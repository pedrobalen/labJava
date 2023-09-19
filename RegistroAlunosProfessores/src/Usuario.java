/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */
public abstract class Usuario {
    private String nomeCompleto;
    private String dataNascimento;
    private char sexo;
    private String curso;
    private String cpf;
    private String rg;
    private String endereco;
    private String estado;
    private String telefoneContato;
    private String nomePai;
    private String nomeMae;
    private String nacionalidade;


    public Usuario(String nomeCompleto, String dataNascimento, char sexo,String curso, String cpf, String rg, String endereco, String estado, String telefoneContato, String nomePai, String nomeMae, String nacionalidade){
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.curso = curso;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.estado = estado;
        this.telefoneContato = telefoneContato;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCurso() {
        return curso;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
    public abstract void executaAcao();
    
    public Object[] obterDados(){
        return new Object[]{nomeCompleto, dataNascimento, sexo, curso, cpf, rg, endereco, estado, telefoneContato, nomePai, nomeMae, nacionalidade};
    }
}
