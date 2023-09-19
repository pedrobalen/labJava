
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Aluno extends Usuario{
    private String matricula;
    private String curso;
    
    public Aluno(String nomeCompleto, String dataNascimento, char sexo, String curso, String cpf, String rg, String endereco, String estado, String telefoneContato, String nomePai, String nomeMae, String nacionalidade) {
        super(nomeCompleto, dataNascimento, sexo, curso, cpf, rg, endereco, estado, telefoneContato, nomePai, nomeMae, nacionalidade);
    }
 

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public void executaAcao(){
        JOptionPane.showMessageDialog(null,getNomeCompleto()+ " inserido" , "Aluno Cadastrado!", JOptionPane.OK_OPTION);
    }    
    
    

    
}
