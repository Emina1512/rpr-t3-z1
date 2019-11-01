package ba.unsa.etf.rpr.t3;

public abstract class TelefonskiBroj implemets Comparable<TelefonskiBroj> {

    public abstract String ispisi();
    @Override
    public abstract int hashCode();
    @Override
    public int compareTo (TelefonskiBroj telBr) {
        return this.ispisi().compareTo(telBr.ispisi());
        }
}
