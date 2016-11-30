import java.util.*;

public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (yhteispaino() + laukku.yhteispaino() <= maksimipaino) {
            this.matkalaukut.add(laukku);
        }
    }

    public ArrayList<Matkalaukku> getMatkalaukut() {
        return matkalaukut;
    }
    
    public int yhteispaino() {
        int painoa = 0;
        for (Matkalaukku matkalaukku : matkalaukut) {
            painoa += matkalaukku.yhteispaino();
        }
        return painoa;
    }
    
    @Override
    public String toString() {
        if (this.matkalaukut.isEmpty()) {
            return ("ei matkalaukkua (0 kg)");
            
        } else if (this.matkalaukut.size() == 1) {
            return ("1 matkalaukku (" + yhteispaino() + " kg)");
        }
        return (this.matkalaukut.size() + " matkalaukkua (" + yhteispaino() + " kg)");
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku matkalaukku : matkalaukut) {
            matkalaukku.tulostaTavarat();
        }
    }
}