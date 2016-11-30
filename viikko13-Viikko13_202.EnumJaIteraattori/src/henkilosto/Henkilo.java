package henkilosto;

public class Henkilo {

    private String nimi;
    private Koulutus koulutus;

    public Henkilo(String nimi, Koulutus koulutus) {
        this.nimi = nimi;
        this.koulutus = koulutus;
    }

    public Koulutus getKoulutus() {
        return koulutus;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + koulutus;
    }
}
