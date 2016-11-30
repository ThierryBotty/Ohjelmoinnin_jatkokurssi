package henkilosto;

import java.util.*;

public class Tyontekijat {
    private List<Henkilo> henkilot;

    public Tyontekijat() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        this.henkilot.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        for (Henkilo henkilo : lisattavat) {
            this.henkilot.add(henkilo);
        }
    }
    
    public void tulosta() {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while (iteraattori.hasNext()) {
            Henkilo seuraava = iteraattori.next();
            if (seuraava.getKoulutus().equals(koulutus)) {
                System.out.println(seuraava);
            }
        }
    }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus().equals(koulutus)) {
                iteraattori.remove();
            }
        }
    }
}
