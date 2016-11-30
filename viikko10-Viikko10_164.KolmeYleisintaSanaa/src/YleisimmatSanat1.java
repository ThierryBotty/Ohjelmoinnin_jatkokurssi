
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YleisimmatSanat1 implements ToistonTunnistin {

    YleisimmatSanat1() {
    }

    public List<String> yleisetSanat(List<String> sanat) {
        
        HashMap<String, Integer> sanajoukko = new HashMap<>();
        List<String> yleisimmatSanat = new ArrayList<>();

        for (String sana : sanat) {

            if (!sanajoukko.containsKey(sana)) {
                sanajoukko.put(sana, 1);

            } else {
                sanajoukko.put(sana, sanajoukko.get(sana) + 1);
            }

        }
        ArrayList<String> palautettava = new ArrayList<>();
        
        EtsiSuurimmatSanat(sanajoukko, yleisimmatSanat);
        
        return yleisimmatSanat;
    }

    private void EtsiSuurimmatSanat(HashMap<String, Integer> sanajoukko, List<String> yleisimmatSanat) {
        etsiSuurinSana(sanajoukko, yleisimmatSanat);
        etsiSuurinSana(sanajoukko, yleisimmatSanat);
        etsiSuurinSana(sanajoukko, yleisimmatSanat);
    }

    private void etsiSuurinSana(HashMap<String, Integer> sanajoukko, List<String> yleisimmatSanat) {
        String suurin = null;
        
        for (String sana : sanajoukko.keySet()) {
            
            if (suurin == null) {
                suurin = sana;
                continue;
            }
            
            if (sanajoukko.get(sana) > sanajoukko.get(suurin)
                    || (sana.length() < suurin.length()
                    && sanajoukko.get(sana) == sanajoukko.get(suurin))) {
                
                suurin = sana;
            }
        }
        yleisimmatSanat.add(suurin);
        sanajoukko.remove(suurin);
    }
}
