import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja2 implements Tasoittava {

    MittaustenTasoittaja2() {
    }

    @Override
    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        ArrayList<Double> luvut = new ArrayList<>();
        
        for (int i = 0; i < henkilotiedot.size(); i++) {
            
            if (i == 0 || i == henkilotiedot.size() - 1) {
                luvut.add(1.0 * (henkilotiedot.get(i).getSyke()));
            } else {
                luvut.add(1.0 * (henkilotiedot.get(i).getSyke() + 
                henkilotiedot.get(i + 1).getSyke() + 
                henkilotiedot.get(i - 1).getSyke()) / 3);
            }
            
        }
        return luvut;
    }
}
