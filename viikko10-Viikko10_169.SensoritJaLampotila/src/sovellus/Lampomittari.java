package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori{
    private boolean onkoPaalla = false;
    private Random satunnaisluku;

    public Lampomittari() {
        this.satunnaisluku = new Random();
    }
    
    @Override
    public boolean onPaalla() {
        return this.onkoPaalla;
    }

    @Override
    public void paalle() {
        this.onkoPaalla = true;
    }

    @Override
    public void poisPaalta() {
        this.onkoPaalla = false;
    }

    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException("Lämpömittari on pois päältä!");
        }
        return this.satunnaisluku.nextInt(61) - 30;
    }
}
