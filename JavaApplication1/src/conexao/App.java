/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import beans.Pessoa;
import dao.PessoaDAO;

/**
 *
 * @author laboratorio
 */
public class App {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        Pessoa p = new Pessoa();
        p.setNome("Ricardo");
        p.setSexo("M");
        p.setIdioma("PORTUGUES");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
    }
}
