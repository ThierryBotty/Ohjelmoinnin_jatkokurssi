
import java.util.*;

public class Rengastustoimisto {

    private Map<Lintu, List<String>> havaintopaikat;

    public Rengastustoimisto() {
        this.havaintopaikat = new HashMap<>();
    }

    public void havaitse(Lintu lintu, String paikka) {

        if (!this.havaintopaikat.containsKey(lintu)) {
            this.havaintopaikat.put(lintu, new ArrayList<>());
        }
        this.havaintopaikat.get(lintu).add(paikka);
    }

    public void havainnot(Lintu lintu) {
        
        if (!this.havaintopaikat.containsKey(lintu)) {
            System.out.println(lintu + "havaintoja: 0");
            
        } else {
            System.out.println(lintu + " havaintoja: " + this.havaintopaikat.get(lintu).size());
            
            for (String havaintopaikka : this.havaintopaikat.get(lintu)) {
                System.out.println(havaintopaikka);
            }
        }
    }
}
