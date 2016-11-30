
import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja1 implements Tasoittava {

    MittaustenTasoittaja1() {
    }

    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        ArrayList<Double> luvut = new ArrayList<>();
        
        for (int i = 0; i < henkilotiedot.size(); i++) {
            
            if (i == 0 || i == henkilotiedot.size() - 1) {
                luvut.add(haeSyke(henkilotiedot, i));
                
            } else {
                luvut.add(laskeKolmenKeskiarvo(henkilotiedot, i));
            }
        }
        return luvut;
    }

    private double laskeKolmenKeskiarvo(List<Henkilo> henkilot, int i) {
        return ((haeSyke(henkilot, i) +
                haeSyke(henkilot, i - 1) +
                haeSyke(henkilot, i + 1)) / 3);
    }
    
    private double haeSyke(List<Henkilo> henkilot, int i) {
        return 1.0 * henkilot.get(i).getSyke();
    }
}
