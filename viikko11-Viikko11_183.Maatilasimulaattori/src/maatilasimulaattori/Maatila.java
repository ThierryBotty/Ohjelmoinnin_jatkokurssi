package maatilasimulaattori;

import java.util.*;

public class Maatila implements Eleleva {

    private String omistaja;
    
    private List<Lehma> lehmat;
    private Navetta navetta;

    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.lehmat = new ArrayList<>();
        this.navetta = navetta;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }

    public void hoidaLehmat() {
        for (Lehma lehma : lehmat) {
            this.navetta.getMaitosailio().lisaaSailioon(lehma.lypsa());
        }
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }

    @Override
    public void eleleTunti() {
        for (Lehma lehma : lehmat) {
            lehma.eleleTunti();
        }
    }

    @Override
    public String toString() {
        return "Maatilan omistaja: " + this.omistaja + "\nNavetan maitosäiliö: "
                + this.navetta.getMaitosailio().toString() + "\nLehmät:" + tulostalehmat();
    }
    
    private String tulostalehmat() {
        String palautettava = "";
        for (Lehma lehma : this.lehmat) {
            palautettava += "\n        " + lehma.toString();
        }
        return palautettava;
    }

}
