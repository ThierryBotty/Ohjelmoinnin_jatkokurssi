package muuttaminen.logiikka;

import java.util.*;
import muuttaminen.domain.*;

public class Pakkaaja {
    private int laatikoidenTilavuus;

    public Pakkaaja(int laatikoidenTilavuus) {
        this.laatikoidenTilavuus = laatikoidenTilavuus;
    }
    
    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        List<Muuttolaatikko> laatikot = new ArrayList<>();
       
        for (Tavara tavara : tavarat) {
            laatikot.add(new Muuttolaatikko(laatikoidenTilavuus));
        }
        for (int i = 0; i < tavarat.size(); i++) {
            laatikot.get(i).lisaaTavara(tavarat.get(i));
        }
        return laatikot;
    }
}
