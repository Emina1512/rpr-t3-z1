package ba.unsa.etf.rpr.t3;

import java.util.*;

public class Imenik {

    private HashMap <String, TelefonskiBroj> atributi = new HashMap<>();

    //getter
    public HashMap<String, TelefonskiBroj> getAtributi () { return atributi; }
    public void dodaj(String ime, TelefonskiBroj broj) {
        atributi.putIfAbsent(ime, broj);
    }
  /*  public String dajBroj(String ime) {
        return atributi.get(ime).ispisi();
    }*/
 /*   public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : atributi.entrySet()) {
            if (entry.getValue().equals(broj)) {
                return entry.getKey();
            }
    }
}
*/
    public String naSlovo(char s) {
        int count=1;
        StringBuilder people = new StringBuilder();
        for(Map.Entry<String, TelefonskiBroj> element : atributi.entrySet()) {
            if( element.getKey().charAt(0)==s){
                people.append(String.format("%d. %s - %s\n", count, element.getKey(), element.getValue()));
                count++;
            }
        }
        return people.toString();
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad nazivGrada) {
        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> element : atributi.entrySet()) {
            TelefonskiBroj broj = element.getValue();
            if (broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(nazivGrada))brojeviIzGrada.add(element.getValue());
            }
        }
        return brojeviIzGrada;
    }
    public Set<String> izGrada(FiksniBroj.Grad nazivGrada) {
        Set<String> townPeople = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> element : atributi.entrySet()) {
            TelefonskiBroj broj = element.getValue();
            if (broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(nazivGrada))townPeople.add(element.getKey());
            }
        }
        return townPeople;
    }

}