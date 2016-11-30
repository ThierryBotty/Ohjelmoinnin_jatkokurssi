package henkilot;

public class Opiskelija extends Henkilo{
    private int opintopisteita;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }

    public int opintopisteita() {
        return opintopisteita;
    }

    public void opiskele() {
        this.opintopisteita++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + this.opintopisteita;
    }
}
