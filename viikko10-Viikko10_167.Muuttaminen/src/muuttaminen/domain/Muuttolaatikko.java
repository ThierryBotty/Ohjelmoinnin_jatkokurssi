package muuttaminen.domain;

import java.util.*;

public class Muuttolaatikko implements Tavara {
    private int maksimitilavuus;
    private List<Tavara> tavarat;

    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.tavarat = new ArrayList();
    }
    
    public boolean lisaaTavara(Tavara tavara) {
        if (tavara.getTilavuus() + this.tilavuusNyt() <= this.maksimitilavuus) {
            this.tavarat.add(tavara);
            return true;
        }
        return false;
    }
    
    private int tilavuusNyt() {
        int tilavuus = 0;
        for (Tavara tavara : tavarat) {
            tilavuus += tavara.getTilavuus();
        }
        return tilavuus;
    }

    @Override
    public int getTilavuus() {
        return this.tilavuusNyt();
    }
}
