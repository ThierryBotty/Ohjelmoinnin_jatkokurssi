import java.util.*;

public class Matkalaukku {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        if (yhteispaino() + tavara.getPaino() <= maksimipaino) {
            tavarat.add(tavara);
        }
    }

    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return ("ei tavaroita (0 kg)");
        } else if (this.tavarat.size() == 1) {
            return ("1 tavara (" + yhteispaino() + " kg)");
        }
        return (this.tavarat.size() + " tavaraa (" + yhteispaino() + " kg)");
    }
    
    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara);
        }
    }

    public int yhteispaino() {
        int painoa = 0;
        for (Tavara tavara : tavarat) {
            painoa += tavara.getPaino();
        }
        return painoa;
    }
    
    public Tavara raskainTavara() {
        if (tavarat.isEmpty()) {
            return null;
        }
        
        Tavara raskain = tavarat.get(0);
        for (Tavara tavara : tavarat) {
            if (tavara.getPaino() > raskain.getPaino()) {
                raskain = tavara;
            }
        }
        return raskain;
    }
}
