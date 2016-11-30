import java.util.*;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat = new HashMap<>();
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        
        if (!this.omistajat.containsKey(rekkari)) {
            this.omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }
    
    public String hae(Rekisterinumero rekkari) {
        return this.omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        
        if (!this.omistajat.containsKey(rekkari)) {
            return false;
        }
        
        this.omistajat.remove(rekkari);
        return true;
    }
    
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekkari : this.omistajat.keySet()) {
            System.out.println(rekkari);
        }
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> lista = new ArrayList<>();
        for (String omistaja : this.omistajat.values()) {
            if (!lista.contains(omistaja)) {
                lista.add(omistaja);
                System.out.println(omistaja);
            }
        }
    }
}
