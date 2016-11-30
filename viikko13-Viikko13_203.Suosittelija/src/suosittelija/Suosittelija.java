package suosittelija;

import java.util.*;
import suosittelija.domain.*;
import suosittelija.comparator.*;

public class Suosittelija {
    private ArvioRekisteri arvioRekisteri;

    public Suosittelija(ArvioRekisteri arvioRekisteri) {
        this.arvioRekisteri = arvioRekisteri;
    }
    
    public Elokuva suositteleElokuva(Henkilo henkilo) {
        List<Elokuva> elokuvat = new ArrayList<>();
        
        for (Elokuva elokuva : this.arvioRekisteri.elokuvienArviot().keySet()) {
            elokuvat.add(elokuva);
        }
        Collections.sort(elokuvat, 
                new ElokuvaComparator(this.arvioRekisteri.elokuvienArviot()));
        return elokuvat.get(0);
    }
}
