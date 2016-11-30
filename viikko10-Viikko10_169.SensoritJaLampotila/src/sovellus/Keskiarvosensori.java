package sovellus;

import java.util.*;

public class Keskiarvosensori implements Sensori {
    private List<Sensori> lista;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        this.lista = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.lista.add(lisattava);
    }

    @Override
    public boolean onPaalla() {
        for (Sensori sensori : lista) {
            if (!sensori.onPaalla()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void paalle() {
        for (Sensori sensori : lista) {
            sensori.paalle();
        }
    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : lista) {
            sensori.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException("Kaikki sensorit eivät ole päällä!");
            
        } else if (this.lista.isEmpty()) {
            throw new IllegalStateException("Ei ole sensoria!");
            
        }
        return (laskeKeskiarvo());
    }

    private int laskeKeskiarvo() {
        int summa = 0;
        for (Sensori sensori : lista) {
            summa += sensori.mittaa();
        }
        int ka = summa / lista.size();
        this.mittaukset.add(ka);
        return (ka);
    }
    
    public List<Integer> mittaukset() {
        return this.mittaukset;
    }
}
