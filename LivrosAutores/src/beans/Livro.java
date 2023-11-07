/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author pedro
 */
public class Livro {
    private int id;
    private String titulo;
    private Autor autorId;
    private String genero;
    private int anoPublicacao;
    private int numCopiasDisponiveis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutorId() {
        return autorId;
    }

    
    public Autor getAutorid() {
        return autorId;
    }
    
    
    public void setAutorId(Autor autorId) {
        this.autorId = autorId;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void setNumCopiasDisponiveis(int numCopiasDisponiveis) {
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }
}
