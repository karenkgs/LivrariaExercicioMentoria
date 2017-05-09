package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto>{

    double getValor(); //Todo o método sem corpo de uma interface é abstrato, e todos os métodos são públicos por padrão

}
