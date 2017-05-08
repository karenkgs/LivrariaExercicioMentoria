package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.AutorNuloException;

public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){
        if(autor == null){
            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
        }
//        this(); //Chamando o próprio construtor padrão, que tem coisas delegadas
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

//    public Livro(){
//        this.isbn = "000-00-00000-00-0";
//    }

    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        if(this.temAutor()){
            getAutor().mostrarDetalhes();
        }
        System.out.println("-----");
    }

    boolean temAutor(){
        return this.getAutor() != null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        String retorno = "Nome: " + nome + "\nDescrição: " + descricao + "\nValor: " + valor + "ISBN: " + isbn;

        if(this.temAutor()){
            retorno += autor.toString();
        }

        retorno += "----";

        return retorno;
    }
}