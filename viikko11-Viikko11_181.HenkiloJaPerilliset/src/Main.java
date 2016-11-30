import henkilot.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaLaitoksenHenkilot(henkilot);
    }

    public static void tulostaLaitoksenHenkilot(List<Henkilo> henkilot) {
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);
        }
    }
}
