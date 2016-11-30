
import java.util.*;

public class Pomo implements Tyontekija {
    private String nimi;
    private int palkka;
    private List<String> kielet;
    private List<Tyontekija> alaiset;

    public Pomo(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.kielet = new ArrayList<>();
        this.alaiset = new ArrayList<>();
    }
    
    public void lisaaAlainen(Tyontekija alainen) {
        this.alaiset.add(alainen);
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
        int alaisia = 0;
        for (Tyontekija tyontekija: alaiset) {
            alaisia += tyontekija.laskeAlaiset();
        }
        return alaiset.size() + alaisia;
    }

    @Override
    public void lisaaKieli(String kieli) {
        kielet.add(kieli);
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        
        for (Tyontekija alainen : alaiset) {
            if (alainen.onkoTaitoa(kieli)) {
                return true;
            }
        }
        return kielet.contains(kieli);
    }
}
