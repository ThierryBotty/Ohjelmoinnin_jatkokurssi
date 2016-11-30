import java.util.*;

public class Velkakirja {
    private HashMap<String, Double> velkakirja;
    
    public Velkakirja() {
        this.velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        this.velkakirja.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        if (this.velkakirja.containsKey(kuka)) {
            return velkakirja.get(kuka);
        }
        return 0;
    }
}