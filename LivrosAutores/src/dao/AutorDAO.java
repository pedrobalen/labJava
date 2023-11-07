/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Autor;
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
public class AutorDAO {
    private Conexao conexao;
    private Connection conn; 
    
    public AutorDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Autor autor){
        String sql = "INSERT INTO autores(nome, nacionalidade, data_nascimento) VALUES (?, ?, ?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getNacionalidade());
            stmt.setInt(3, autor.getDataNascimento());
            stmt.execute();
        } catch(SQLException ex){
            System.out.println("Erro ao inserir autor: " +ex.getMessage());
        }
    }    
    
    
    public void excluir(int id) {
        try {
            String sql = "DELETE FROM autores WHERE id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.execute();
        } catch(SQLException ex) {
            System.out.println("Erro ao excluir autor: " +  ex.getMessage());
        }
    }        
    
    public Autor getA(int id){
            
        String sql = "SELECT * FROM autores where id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            Autor a = new Autor();
            a.setId(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setNacionalidade(rs.getString("nacionalidade"));
            a.setDataNascimento(rs.getInt("data_nascimento"));
            return a;
        }catch(SQLException ex){
        System.out.println("erro: " + ex.getMessage());
        return null;
        }    
    }     
    
    public List<Autor> getAutor(){
        
        String sql = "SELECT * FROM autores";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            List<Autor> listaAutores = new ArrayList();
            while(rs.next()){
                Autor a = new Autor();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setNacionalidade(rs.getString("nacionalidade"));
                a.setDataNascimento(rs.getInt("data_nascimento"));
                listaAutores.add(a);
            }
            return listaAutores;
        }catch(SQLException ex){
        System.out.println("erro: " + ex.getMessage());
        return null;
        }    
    }    
    
    public List<Autor> getAutorNome(String nome){
        
        String sql = "SELECT * FROM autores WHERE nome like ? and nacionalidade LIKE ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Autor> listaAutores = new ArrayList();
            while(rs.next()){
                Autor a = new Autor();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setNacionalidade(rs.getString("nacionalidade"));
                a.setDataNascimento(rs.getInt("data_nascimento"));
                listaAutores.add(a);
            }
            return listaAutores;
        }catch(SQLException ex){
        System.out.println("erro: " + ex.getMessage());
        return null;
        }    
    }         
}
