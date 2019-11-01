package ba.unsa.etf.rpr.t3;

public class FiksniBroj extends TelefonskiBroj {

   //pobrojane vrijednosti, gradovi
    public enum Grad {
        SARAJEVO, TUZLA, ZENICA, BUGOJNO, ORAŠJE, LIVNO, JABLANICA, BIHAĆ, GORAŽDE, ŠIROKI, BRČKO, KUPRES,
        BANJALUKA, PRIJEDOR, TESLIĆ, PELAGIĆEVO,
        BIJELJINA, BRATUNAC, HANPIJESAK, FOČA, TREBINJE
    }
    //atributi
    private Grad grad;
    private String broj;

    //konstruktor
    FiksniBroj(Grad grad, String broj) {
    this.grad = grad;
    this.broj = broj;
    }

    //setteri

    void setGrad(Grad grad) {
    this.grad = grad;
    }
    void setBroj(String broj) {
        this.broj = broj;
    }
    //geteri
    Grad getGrad() {
    return this.grad;
    }
    String getBroj() {
    return this.broj;
    }

    @Override
    public String ispisi() {
        String ans = null;
        switch(grad){
            case SARAJEVO: ans += "033/"; break;
            case TUZLA: ans += "035/"; break;
            case ZENICA: ans += "032/"; break;
            case BUGOJNO: ans += "030/"; break;
            case ORAŠJE: ans += "031/"; break;
            case LIVNO: ans += "034/"; break;
            case JABLANICA: ans += "036/"; break;
            case BIHAĆ: ans += "037/"; break;
            case GORAŽDE: ans += "038/"; break;
            case ŠIROKI: ans += "039/"; break;
            case BRATUNAC: ans += "040/"; break;
            case BRČKO: ans += "041/"; break;
            case KUPRES: ans += "042/"; break;
            case BANJALUKA: ans += "043/"; break;
            case PRIJEDOR: ans += "044/"; break;
            case TESLIĆ: ans += "045/"; break;
            case PELAGIĆEVO: ans += "046/"; break;
            case BIJELJINA: ans += "047/"; break;
            case HANPIJESAK: ans += "048/"; break;
            case FOČA: ans += "049/"; break;
            case TREBINJE: ans += "050/"; break;
    }
    ans += broj;
        return ans;
}
@Override

public int hashCode() {
    return 0;
    }
}
