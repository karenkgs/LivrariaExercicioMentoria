package livraria;

public class RegrasDeDesconto {

    public static void main(String args[]){

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro(autor);
        livro.setNome("Java 8 prático");
        livro.setDescricao("Novos recursos da linguagem.");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no livro não pode ser maior que 30%");
        } else {
            System.out.println("Valor do livro com desconto: "+livro.getValor());
        }


        Ebook ebook = new Ebook(autor);
        ebook.setNome("Lógica de programação");
        ebook.setDescricao("Crie seus primeiros programas.");
        ebook.setValor(29.90);
        ebook.setIsbn("978-85-66250-22-0");

        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: "+ebook.getValor());
        }

    }

}
