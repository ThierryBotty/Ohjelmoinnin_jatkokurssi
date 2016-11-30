package suosittelija.comparator;

import java.util.*;
import suosittelija.domain.*;

public class HenkiloComparator implements Comparator<Henkilo>{
    private Map<Henkilo, Integer> henkiloidenSamuudet;

    public HenkiloComparator(Map<Henkilo, Integer> henkiloidenSamuudet) {
        this.henkiloidenSamuudet = henkiloidenSamuudet;
    }
    
    @Override
    public int compare(Henkilo h1, Henkilo h2) {
        return henkiloidenSamuudet.get(h2)-henkiloidenSamuudet.get(h1);
    }

}
