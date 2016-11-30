package siirrettava;

import java.util.*;

public class Lauma implements Siirrettava {
    private List<Siirrettava> eliot;

    public Lauma() {
        this.eliot = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.eliot.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : eliot) {
            siirrettava.siirra(dx, dy);
        }
    }

    @Override
    public String toString() {
        String teksti = "";
        for (Siirrettava siirrettava : eliot) {
            teksti += siirrettava.toString() + "\n";
        }
        return teksti;
    }
}
