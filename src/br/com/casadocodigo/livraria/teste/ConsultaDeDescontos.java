package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {

    public static void main(String[] args){
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("CUP74");

        if(desconto != null){
            System.out.println("Cupom de desconto valido.");
            System.out.println("Valor: " + desconto);
            //Aplica desconto
        } else {
            System.out.println("Esse cupom nao existe.");
        }
    }

}
