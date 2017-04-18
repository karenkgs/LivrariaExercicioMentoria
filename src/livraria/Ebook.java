package livraria;

/**
 * Created by macmini2013 on 11/04/17.
 */
public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        System.out.println("aplicando desconto no ebook");
        //return super.aplicaDescontoDe(porcentagem); //evita repetir a lógica
        return true;
    }


//    @Override
//    public boolean aplicaDescontoDe(double porcentagem){
//        if(porcentagem > 0.15){
//            return false;
//        }
//        this.setValor(this.getValor() - this.getValor() * porcentagem);
//        return true;
//    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
