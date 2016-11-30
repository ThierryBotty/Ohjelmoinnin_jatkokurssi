import java.util.*;

public class Henkilo implements Comparable<Henkilo> {
    private String nimi;
    private Set<String> numerot;
    private String katu;
    private String kaupunki;

    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.numerot = new HashSet<>();
    }

    public void lisaaNumero(String numero) {
        this.numerot.add(numero);
    }

    public void lisaaOsoite(String katu, String kaupunki) {
        this.katu = katu;
        this.kaupunki = kaupunki;
    }

    public String haeNimi() {
        return nimi;
    }

    public void haeNumerot() {
        for (String numero : this.numerot) {
            System.out.println(" " + numero);
        }
    }

    public String haeOsoite() {
        if (this.katu == null && this.kaupunki == null) {
            return "";
        }
        if (this.katu == null) {
            return this.kaupunki;
        }
        
        if (this.kaupunki == null) {
            return this.katu;
        }
        return (this.katu + " " + this.kaupunki);
    }

    @Override
    public String toString() {
        
        return ("osoite: " + haeOsoite());
    }

    @Override
    public int compareTo(Henkilo o) {
        return (this.nimi.compareTo(o.haeNimi()));
    }
    
    
}
