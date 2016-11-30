
public class Muunnos {
    private char muunnettava;
    private char muunnettu;

    public Muunnos(char muunnettava, char muunnettu) {
        this.muunnettava = muunnettava;
        this.muunnettu = muunnettu;
    }
    
    public String muunna(String merkkijono) {
        return merkkijono.replace(muunnettava, muunnettu);
    }
}