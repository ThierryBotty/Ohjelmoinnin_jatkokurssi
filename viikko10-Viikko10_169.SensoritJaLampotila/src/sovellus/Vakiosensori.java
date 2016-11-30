package sovellus;

public class Vakiosensori implements Sensori {
    private int mittaus;

    public Vakiosensori(int mittaus) {
        this.mittaus = mittaus;
    }
    

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
    }

    @Override
    public void poisPaalta() {
    }

    @Override
    public int mittaa() {
        return this.mittaus;
    }
}
