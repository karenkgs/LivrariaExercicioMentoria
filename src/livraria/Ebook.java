package livraria;

/**
 * Created by macmini2013 on 11/04/17.
 */
public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }

        return super.aplicaDescontoDe(porcentagem); //evita repetir a lógica

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
