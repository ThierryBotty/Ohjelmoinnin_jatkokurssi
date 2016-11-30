package henkilot;

public class Henkilo {
    private String nimi;
    private String osoite;

    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        return (this.nimi + "\n  " + this.osoite);
    }
}
