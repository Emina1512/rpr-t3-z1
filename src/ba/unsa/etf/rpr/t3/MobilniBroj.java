package ba.unsa.etf.rpr.t3;

public class MobilniBroj extends TelefonskiBroj {
    private int MobilnaMreza;
    private String broj;

    //getteri
    int getMreza () { return MobilnaMreza; }
    String getBroj () { return broj; }

    //setteri
    void setMreza (int mreza) {
        this.MobilnaMreza = mreza;
    }
    void setBroj(String broj) {
        this.broj = broj;
    }
    public MobilniBroj(int mobilnaMreza, String broj) throws IllegalArgumentException {
        if(this.getMreza() > 67 || this.getMreza() < 60)
        throw new IllegalArgumentException("Wrong mobile network");
        this.MobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }


    public String ispisi() {
        return "0" + getMreza() + "/" + broj;
    }

    public int hachCode() {
        return 0;
    }
}
