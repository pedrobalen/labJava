
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public class Professor extends Usuario {
    private String matricula;
    private String formacao;
    private String alocacao;

    public Professor(String nomeCompleto, String dataNascimento, char sexo, String curso, String cpf, String rg, String endereco, String estado, String telefoneContato, String nomePai, String nomeMae, String nacionalidade) {
        super(nomeCompleto, dataNascimento, sexo, curso, cpf, rg, endereco, estado, telefoneContato, nomePai, nomeMae, nacionalidade);
    }
    
    public void executaAcao(){
        JOptionPane.showMessageDialog(null,getNomeCompleto()+ " inserido", "Professor Cadastrado!", JOptionPane.OK_OPTION);
    }
    

}
