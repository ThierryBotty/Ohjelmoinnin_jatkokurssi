
import java.util.ArrayList;
import java.util.List;

public class MittausRaportoija2 implements SeismisenToiminnanMittaaja {

    MittausRaportoija2() {
    }

    public List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi) {

        List<SuurinTaajuusRaportti> lista = new ArrayList<>();
        int paiva = (int) mittausData.indexOf(0);
        double suurinMittaus = mittausData.get(1);

        for (Double luku : mittausData) {
            
            if (luku <= 500 && luku > suurinMittaus) {
                    suurinMittaus = luku;
            }

            if (luku >= 20150101) {
                lista.add(new SuurinTaajuusRaportti(paiva, suurinMittaus));
                paiva = (int) (luku - (20150000 + kuukausi * 100));
                suurinMittaus = 0;
            }
        }
        lista.add(new SuurinTaajuusRaportti(paiva, suurinMittaus));
        lista.remove(0);
        return lista;

        
    }
}
