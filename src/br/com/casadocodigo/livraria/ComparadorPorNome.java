package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Livro;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2){
        return l1.getNome().compareTo(l2.getNome());
    }
}
