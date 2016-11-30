package luola;

import java.util.*;

public class Luola {

    private int leveys;
    private int korkeus;
    private int hirvioita;
    private int siirtoja;
    private boolean hirviotLiikkuvat;
    private Random random;
    private ArrayList<Hirvio> hirviot;
    private ArrayList<Hirvio> tuhotut;
    private Pelaaja pelaaja;

    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirviotLiikkuvat) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.hirvioita = hirvioita;
        this.siirtoja = siirtoja;
        this.hirviotLiikkuvat = hirviotLiikkuvat;
        this.random = new Random();
        this.hirviot = new ArrayList<>();
        this.tuhotut = new ArrayList<>();
        this.pelaaja = new Pelaaja(leveys, korkeus);
    }

    public void run(Scanner lukija) {
        
        luoHirviot();
        Pelikentta pelikentta = new Pelikentta();

        while (siirtoja > 0) {

            tulostaTilanne();
            pelikentta.tulostaKentta(leveys, korkeus, pelaaja, hirviot);
            String siirto = lukija.nextLine();
            teeSiirrot(siirto);
            this.hirviot.removeAll(tuhotut);

            if (this.hirviot.isEmpty()) {
                System.out.println("VOITIT");
                break;
            }
            this.siirtoja--;
        }
        if (this.siirtoja == 0) {
            System.out.println("HÄVISIT");
        }
    }

    private void teeSiirrot(String teksti) {
        for (char c : teksti.toCharArray()) {
            pelaaja.liiku(c);

            if (hirviotLiikkuvat == true) {
                for (Hirvio hirvio : hirviot) {
                    if (hirvio.liiku(pelaaja, hirviot)) {
                        tuhotut.add(hirvio);
                    }
                }
            } else {
                for (Hirvio hirvio : hirviot) {
                    if (hirvio.getX() == pelaaja.getX() && hirvio.getY() == pelaaja.getY()) {
                        tuhotut.add(hirvio);
                    }
                }
            }
        }
    }

    private void luoHirviot() {
        for (int i = 0; i < this.hirvioita; i++) {
            this.hirviot.add(new Hirvio(random.nextInt(leveys), (random.nextInt(korkeus))));
        }
        
        for (Hirvio hirvio : hirviot) {
            hirvio.asetaRaja(leveys, korkeus);
        }
    }

    public ArrayList<Hirvio> getHirviot() {
        return hirviot;
    }

    private void tulostaTilanne() {
        System.out.println(siirtoja + "\n\n@ " + this.pelaaja.getX() + " " + this.pelaaja.getY());
        for (Hirvio hirvio : hirviot) {
            System.out.println("h " + hirvio.getX() + " " + hirvio.getY());
        }
        System.out.println();
    }
}
