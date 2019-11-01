package ba.unsa.etf.rpr.t3;

public class MedjunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava=drzava;
        this.broj=broj;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String ispisi() {
        return ""+drzava+broj;
    }
}

