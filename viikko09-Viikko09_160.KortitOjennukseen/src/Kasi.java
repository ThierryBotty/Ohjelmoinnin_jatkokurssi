import java.util.*;

public class Kasi implements Comparable<Kasi> {
    private List<Kortti> kortit;

    public Kasi() {
        this.kortit = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        this.kortit.add(kortti);
    }
    
    public void tulosta() {
        for (Kortti kortti : kortit) {
            System.out.println(kortti);
        }
    }
    
    public void jarjesta() {
        this.kortit.sort(null);
    }
    
    public void jarjestaMaittain() {
        Collections.sort(kortit, new SamatMaatVierekkainArvojarjestykseen());
    }

    @Override
    public int compareTo(Kasi toinen) {
        int summa = 0;
        
        for (Kortti kortti : kortit) {
            summa += kortti.getArvo();
        }
        for (Kortti kortti : toinen.kortit) {
            summa -= kortti.getArvo();
        }
        return (summa);
    }
}