import java.util.*;

public class Varasto {
    private Map<String, Integer> hinnasto;
    private Map<String, Integer> saldo;
    
    public Varasto() {
        this.hinnasto = new HashMap();
        this.saldo = new HashMap();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnasto.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if (this.hinnasto.containsKey(tuote)) {
            return hinnasto.get(tuote);
        }
        return -99;
    }
    
    public int saldo(String tuote) {
        if (this.saldo.containsKey(tuote)) {
            return saldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        if (!this.saldo.containsKey(tuote)) {
            return false;
        }
        
        if (this.saldo.get(tuote) > 0) {
            this.saldo.put(tuote, (this.saldo.get(tuote) - 1));
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        return this.saldo.keySet();
    }
}
