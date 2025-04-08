package br.com.fiap.biblioteca.model;

public class Livro {

    public String titulo;
    public int paginas;
    boolean disponivel;

    //métodos
    void  emprestar(){
        disponivel = false;

    }
}
