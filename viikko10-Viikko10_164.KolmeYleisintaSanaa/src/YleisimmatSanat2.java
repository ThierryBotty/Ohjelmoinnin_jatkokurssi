
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YleisimmatSanat2 implements ToistonTunnistin {

    YleisimmatSanat2() {
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
        String suurin = "";
        String toiseksiSuurin = "";
        String kolmasSuurin = "";

        for (String sana : sanajoukko.keySet()) {
            
            if (suurin.equals("")) {
                suurin = sana;
                continue;
            }
            if (toiseksiSuurin.equals("")) {
                toiseksiSuurin = sana;
                continue;
            }
            if (sanajoukko.get(sana) > sanajoukko.get(suurin)
                    || (sana.length() < suurin.length()
                    && sanajoukko.get(sana) == sanajoukko.get(suurin))) {
                
                kolmasSuurin = toiseksiSuurin;
                toiseksiSuurin = suurin;
                suurin = sana;
            }
            
        }
        
        yleisimmatSanat.add(suurin);
        yleisimmatSanat.add(toiseksiSuurin);
        yleisimmatSanat.add(kolmasSuurin);
        return yleisimmatSanat;
    }
}
