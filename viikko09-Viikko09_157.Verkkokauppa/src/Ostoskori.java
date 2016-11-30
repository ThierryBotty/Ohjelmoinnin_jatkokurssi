import java.util.*;

public class Ostoskori {
    private Map<String, Ostos> kori;

    public Ostoskori() {
        this.kori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        if (this.kori.containsKey(tuote)) {
            this.kori.get(tuote).kasvataMaaraa();
            
        } else {
            this.kori.put(tuote, new Ostos (tuote, 1, hinta));
        }
    }
    
    public int hinta() {
        int hinta = 0;
        for (Ostos ostos : this.kori.values()) {
            hinta += ostos.hinta();
        }
        
        return hinta;
    }
    
    public void tulosta() {
        for (Ostos ostos : this.kori.values()) {
            System.out.println(ostos);
        }
    }   
}
