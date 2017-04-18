package livraria;

public class RegrasDeDesconto {

    public static void main(String args[]){

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(39.90);

//        if(!miniLivro.aplicaDescontoDe(0.3)){
//            System.out.println("Desconto no livro não pode ser maior que 30%");
//        } else {
//            System.out.println("Valor do livro com desconto: "+miniLivro.getValor());
//        }

    }

}
