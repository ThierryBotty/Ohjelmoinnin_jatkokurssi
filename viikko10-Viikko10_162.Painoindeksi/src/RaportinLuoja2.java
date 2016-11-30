
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja2 implements Raportoiva {

    RaportinLuoja2() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        
        List<String> alipainoiset = new ArrayList<>();
        List<String> normaalipainoiset = new ArrayList<>();
        List<String> ylipainoiset = new ArrayList<>();
        List<String> merkittavastiYlipainoiset = new ArrayList<>();
        
        for (Henkilo henkilo : henkilotiedot) {
            
            double painoindeksi = (henkilo.getPaino() / 
                    (henkilo.getPituus() * henkilo.getPituus()));
            
            String nimi = henkilo.getNimi();
            
            if (painoindeksi < 18.5) {
                alipainoiset.add(henkilo.getNimi());
                
            } else if (painoindeksi < 25) {
                normaalipainoiset.add(henkilo.getNimi());
                
            } else if (painoindeksi < 30) {
                ylipainoiset.add(henkilo.getNimi());
                
            } else {
                merkittavastiYlipainoiset.add(henkilo.getNimi());
            }
            
        }
        return new PainoindeksiRaportti(alipainoiset, normaalipainoiset, 
                ylipainoiset, merkittavastiYlipainoiset);
    }
}
