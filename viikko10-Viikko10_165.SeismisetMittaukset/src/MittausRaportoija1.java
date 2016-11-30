
import java.util.ArrayList;
import java.util.List;

class MittausRaportoija1 implements SeismisenToiminnanMittaaja {

    MittausRaportoija1() {
    }

    public List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi) {
        
        List<SuurinTaajuusRaportti> lista = new ArrayList<>();
        int paiva = 0;
        double suurinMittaus = 0;
        
        for (Double luku : mittausData) {
            
            if (luku >= 20150101) {
                if (paiva != 0) {
                    lista.add(new SuurinTaajuusRaportti(paiva, suurinMittaus));
                }
                paiva = (int) (luku - (20150000 + kuukausi * 100));
                suurinMittaus = 0;
                
            } else {
                if (luku > suurinMittaus) {
                    suurinMittaus = luku;
                }
            }
        }
        lista.add(new SuurinTaajuusRaportti(paiva, suurinMittaus));
        return lista;
    }
}
