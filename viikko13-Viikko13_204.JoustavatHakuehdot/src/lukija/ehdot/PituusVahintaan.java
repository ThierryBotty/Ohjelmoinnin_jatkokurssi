package lukija.ehdot;

public class PituusVahintaan implements Ehto {
    private int pituus;

    public PituusVahintaan(int pituus) {
        this.pituus = pituus;
    }

    @Override
    public boolean toteutuu(String rivi) {
        return rivi.length() >= pituus;
    }

}
