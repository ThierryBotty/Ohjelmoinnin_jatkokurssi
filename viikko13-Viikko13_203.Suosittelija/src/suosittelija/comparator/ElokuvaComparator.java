package suosittelija.comparator;

import java.util.*;
import suosittelija.domain.*;

public class ElokuvaComparator implements Comparator<Elokuva> {
    private Map<Elokuva, List<Arvio>> arviot;
    
    public ElokuvaComparator(Map<Elokuva, List<Arvio>> arviot) {
        this.arviot = arviot;
    }

    @Override
    public int compare(Elokuva e1, Elokuva e2) {
        return (int) (keskiarvo(e2) - keskiarvo(e1));
    }

    private double keskiarvo(Elokuva elokuva) {
        double summa = 0;
        for (Arvio arvio: arviot.get(elokuva)) {
            summa += arvio.getArvo();
        }
        return summa / arviot.get(elokuva).size();
    }
    
}
