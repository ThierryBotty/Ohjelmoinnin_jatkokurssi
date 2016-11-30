import java.util.*;

public class Laatikko implements Talletettava {
    
    private double maksimipaino;
    private ArrayList<Talletettava> tavarat;

    public Laatikko(double maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Talletettava talletettava) {
        if (talletettava.paino() + paino() <= maksimipaino) {
            this.tavarat.add(talletettava);
        }
    }

    @Override
    public double paino() {
        double paino = 0;
        for (Talletettava tavara : this.tavarat) {
            paino += tavara.paino();
        }
        return paino;
    }

    @Override
    public String toString() {
        return ("Laatikko: " + this.tavarat.size() + 
                " esinettä, paino yhteensä " + paino() + " kiloa");
        
    }
}
