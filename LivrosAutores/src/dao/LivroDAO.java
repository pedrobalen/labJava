/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Autor;
import beans.Livro;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class LivroDAO {
    private Conexao conexao;
    private Connection conn;

    public LivroDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Livro livro){
        String sql = "INSERT INTO livros(titulo, autor_id, genero, ano_publicacao, num_copias_disponiveis) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAutorId().getId());
            stmt.setString(3, livro.getGenero());            
            stmt.setInt(4, livro.getAnoPublicacao());
            stmt.setInt(5, livro.getNumCopiasDisponiveis());            
            stmt.execute();
        } catch(SQLException ex){
            System.out.println("Erro ao inserir livro: " +ex.getMessage());
        }
    }       
    
    public void editar(Livro livro){
        try{
            String sql = "UPDATE livros set titulo=?, autor_id=?, genero=?, ano_publicacao=?, num_copias_disponiveis=? WHERE id=?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAutorId().getId());
            stmt.setString(3, livro.getGenero());       
            stmt.setInt(4, livro.getAnoPublicacao());
            stmt.setInt(5, livro.getNumCopiasDisponiveis());            
            stmt.execute();
        } catch(SQLException ex){
            System.out.println("Erro ao atualizar livro: " +ex.getMessage());
        }
    }    
    
    public void excluir(int id){
        try{
            String sql = "delete from livros WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();        
        }catch(SQLException ex){
            System.out.println("Erro ao excluir livros: " +ex.getMessage());       
        }  
    }    
    

    public List<Livro> getLivros(){
        String sql = "SELECT * FROM livros";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            List<Livro> listaLivros = new ArrayList();
            
            while(rs.next()){
                Livro l = new Livro();
                l.setId(rs.getInt("id"));
                l.setTitulo(rs.getString("titulo"));
                l.setGenero(rs.getString("genero"));
                l.setAnoPublicacao(rs.getInt("ano_publicacao"));                
                l.setNumCopiasDisponiveis(rs.getInt("num_copias_disponiveis"));                 
                
                AutorDAO aDAO = new AutorDAO();
                
                Autor a = aDAO.getA(rs.getInt("autor_id"));
                l.setAutorId(a);
                listaLivros.add(l);
            }
            return listaLivros;      
        }catch(SQLException ex){
            System.out.println("Erro ao consultar autor: " +ex.getMessage());
            return null;
        } 
   }
}