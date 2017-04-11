package livraria;

/**
 * Created by macmini2013 on 11/04/17.
 */
public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
