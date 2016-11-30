
import java.util.*;

public class Koodari implements Tyontekija {
    private String nimi;
    private int palkka;
    private List<String> kielet;

    public Koodari(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.kielet = new ArrayList<>();
    }
    
    @Override
    public String haeNimi() {
        return nimi;
    }

    @Override
    public int haePalkka() {
        return palkka;
    }

    @Override
    public int laskeAlaiset() {
        return 0;
    }

    @Override
    public void lisaaKieli(String kieli) {
        kielet.add(kieli);
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        return kielet.contains(kieli);
    }
}
