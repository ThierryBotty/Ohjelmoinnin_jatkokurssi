import java.util.*;

public class Muuntaja {
    private ArrayList<Muunnos> muunnokset; 
    
    public Muuntaja() {
        this.muunnokset = new ArrayList<>();
    }

    public void lisaaMuunnos(Muunnos muunnos) {
        this.muunnokset.add(muunnos);
    }
    
    public String muunna(String merkkijono) {
        for (Muunnos muunnos : muunnokset) {
            merkkijono = muunnos.muunna(merkkijono);
        }
        return merkkijono;
    }
}
