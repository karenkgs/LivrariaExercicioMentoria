package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        Autor autor2 = new Autor();
        autor2.setNome("Mauricio Aniche");

        if(autor.equals(autor2)){
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

//        LivroFisico fisico = new LivroFisico(null);
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        if(fisico.aplicaDescontoDe10Porcento()){
            System.out.println("Valor agora é " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();
        for (Produto produto: produtos){
            try {
                if (produto != null){
                    System.out.println(produto.getValor());
                }

            } catch (ArrayIndexOutOfBoundsException e){ //catch (ArrayIndexOutOfBoundsException | NullPointerException e) - Entra em qualquer dos casos(OU)
                System.out.println("Deu exception no indice: ");
                e.printStackTrace();
            } catch (NullPointerException e){
                System.out.println("O array n foi instanciado");

            } finally {
                //alguma ação importante - Executado sempre, passando ou não na exceção
            }
        }

        System.out.println("Fui executado");
        System.out.println(ebook);

    }

}
