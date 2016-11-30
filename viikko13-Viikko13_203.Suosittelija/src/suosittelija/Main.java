package suosittelija;

import suosittelija.domain.*;

public class Main {

    public static void main(String[] args) {
        // Testaa luokkiesi toteutusta täällä
        ArvioRekisteri rek = new ArvioRekisteri();
        Henkilo h1 = new Henkilo("Pekka");
        Henkilo h2 = new Henkilo("Arto");
        Henkilo h3 = new Henkilo("Jukka");
        rek.lisaaArvio(h1, new Elokuva("Pulp fiction"), Arvio.OK);
        rek.lisaaArvio(h1, new Elokuva("Eraserhead"), Arvio.HYVA);
        rek.lisaaArvio(h2, new Elokuva("Eraserhead"), Arvio.HUONO);
        rek.lisaaArvio(h2, new Elokuva("Pulp fiction"), Arvio.NEUTRAALI);
        rek.lisaaArvio(h2, new Elokuva("Rambo"), Arvio.HYVA);
        rek.lisaaArvio(h3, new Elokuva("Eraserhead"), Arvio.NEUTRAALI);
        rek.annaArviot(new Elokuva("Eraserhead"));

    }
}
