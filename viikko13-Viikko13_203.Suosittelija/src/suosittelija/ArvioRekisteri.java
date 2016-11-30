package suosittelija;

import java.util.*;
import suosittelija.domain.*;

public class ArvioRekisteri {

    private Map<Elokuva, List<Arvio>> elokuvaArviot;
    private Map<Henkilo, Map<Elokuva, Arvio>> henkilonArviot;

    public ArvioRekisteri() {
        this.elokuvaArviot = new HashMap<>();
        this.henkilonArviot = new HashMap<>();
    }

    public void lisaaArvio(Elokuva elokuva, Arvio arvio) {
        if (!this.elokuvaArviot.containsKey(elokuva)) {
            this.elokuvaArviot.put(elokuva, new ArrayList<>());
        }
        this.elokuvaArviot.get(elokuva).add(arvio);
    }

    public List<Arvio> annaArviot(Elokuva elokuva) {
        return elokuvaArviot.get(elokuva);
    }

    public Map<Elokuva, List<Arvio>> elokuvienArviot() {
        return this.elokuvaArviot;
    }
    
    public void lisaaArvio(Henkilo henkilo, Elokuva elokuva, Arvio arvio) {
        if (!this.henkilonArviot.containsKey(henkilo)) {
            Map<Elokuva, Arvio> mappi = new HashMap<>();
            this.henkilonArviot.put(henkilo, mappi);
        }
        this.henkilonArviot.get(henkilo).put(elokuva, arvio);
        lisaaArvio(elokuva, arvio);
    }
    
    public Arvio haeArvio(Henkilo henkilo, Elokuva elokuva) {
        if (this.henkilonArviot.get(henkilo).containsKey(elokuva)) {
            return this.henkilonArviot.get(henkilo).get(elokuva);
        }
        return Arvio.EI_NAHNYT;
    }
    
    public Map<Elokuva, Arvio> annaHenkilonArviot(Henkilo henkilo) {
        if (this.henkilonArviot.containsKey(henkilo)) {
            return this.henkilonArviot.get(henkilo);
        }
        return new HashMap<Elokuva, Arvio>();
    }
    
    public List<Henkilo> arvioijat() {
        List<Henkilo> henkilot = new ArrayList<>();
        for (Henkilo henkilo : this.henkilonArviot.keySet()) {
            henkilot.add(henkilo);
        }
        return henkilot;
    }
}
