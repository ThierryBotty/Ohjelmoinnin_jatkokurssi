
import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja1 implements Raportoiva {

    public RaportinLuoja1() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        List<String> alipainoiset = new ArrayList<>();
        List<String> normaalipainoiset = new ArrayList<>();
        List<String> ylipainoiset = new ArrayList<>();
        List<String> merkittavastiYlipainoiset = new ArrayList<>();

        for (Henkilo henkilo : henkilotiedot) {

            double painoindeksi = laskeBMI(henkilo);

            String nimi = henkilo.getNimi();

            if (painoindeksi < 18.5) {
                alipainoiset.add(nimi);

            } else if (painoindeksi < 25) {
                normaalipainoiset.add(nimi);

            } else if (painoindeksi < 30) {
                ylipainoiset.add(nimi);

            } else {
                merkittavastiYlipainoiset.add(nimi);
            }
        }
        
        return new PainoindeksiRaportti(alipainoiset, normaalipainoiset,
                ylipainoiset, merkittavastiYlipainoiset);
    }

    private double laskeBMI(Henkilo henkilo) {
        double painoindeksi = (henkilo.getPaino()
                / (henkilo.getPituus() * henkilo.getPituus()));
        return painoindeksi;
    }
}
