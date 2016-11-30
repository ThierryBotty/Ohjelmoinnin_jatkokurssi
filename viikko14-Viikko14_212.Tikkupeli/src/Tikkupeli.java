
import java.util.*;

public class Tikkupeli {

    private Scanner lukija;
    private int tikkua;
    private int tikkujenAlkuperainenMaara;
    private Tekoaly tekoaly;

    public Tikkupeli(Scanner lukija) {
        this.lukija = lukija;
    }

    public void run() {
        valitseTikkujenMaara();
        tulostaVaihtoehdot();
        pelaaUudestaan();
        
    }

    private void valitseTikkujenMaara() {
        System.out.println("Tervetuloa tikkupeliin!");
        while (true) {
            System.out.print("Kuinka monta tikkua pöydällä on aluksi (10-100)? ");
            Integer luku = Integer.parseInt(lukija.nextLine());
            if (luku > 9 && luku < 101) {
                this.tikkua = luku;
                this.tikkujenAlkuperainenMaara = luku;
                System.out.println();
                break;
            } else {
                System.out.println("Valitse luku väliltä 10-100");
            }
        }
    }

    private void tulostaVaihtoehdot() {
        System.out.print("Vaihtoehdot:\n"
                + " Pelaa kaveria vastaan (1)\n"
                + " Pelaa tietokonetta vastaan (2)\n"
                + " Pelaa kouliintunutta tietokonetta vastaan (3)\n"
                + "Minkä vaihtoehdon valitset (1-3)? ");

        String syote = lukija.nextLine();
        if (syote.equals("" + 1)) {
            vanhempaaKoodiaJokaPitaaRefraktoidaMuttaEnJaksa();
        } else if (syote.equals("" + 2)) {
            tekoaly = new Tekoaly(tikkua);
            pelaaTekoalyaVastaan();
        } else if (syote.equals("" + 3)) {
            tekoaly = new Tekoaly(tikkua);
            treenaa();
            pelaaTekoalyaVastaan();
        }
    }

    private void pelaaUudestaan() {

        while (true) {
            System.out.print("\nPelaa uudestaan (1 = kyllä, 0 = ei)? ");
            String syote = lukija.nextLine();
            if (syote.equals("" + 1)) {
                tikkua = tikkujenAlkuperainenMaara;
                pelaaTekoalyaVastaan();
            } else if (syote.equals("" + 0)) {
                break;
            }
        }
        System.out.println("Kiitos!");
    }

    private void pelaaTekoalyaVastaan() {
        while (true) {
            pelaaja1Pelaa();
            if (tikkua < 1) {
                System.out.println("Pelaaja 1, hävisit :/");
                tekoaly.siirraVoitonTiedotMappiin();
                break;
            }
            tekoalyPelaa();
            if (tikkua < 1) {
                System.out.println("Tekoäly häviää");
                tekoaly.tyhjennaTiedot();
                break;
            }
        }
    }

    private void treenaa() {
        System.out.println("\nTreenataan...");
        for (int i = 0; i < 10000; i++) {
            while (true) {
                
                int nosto = tekoaly.nostaTikkuaSatunnaisesti(tikkua);
                tikkua -= nosto;
                if (tikkua < 1) {
                    tekoaly.siirraVoitonTiedotMappiin();
                    break;
                }
                nosto = tekoaly.nostaTikkua(tikkua);
                tikkua -= nosto;
                if (tikkua < 1) {
                    tekoaly.tyhjennaTiedot();
                    break;
                }
            }
            tikkua = tikkujenAlkuperainenMaara;
        }
    }

    private void pelaaja1Pelaa() {
        tulostaTikkujenMaara();
        System.out.print("Pelaaja 1: Kuinka monta tikkua nostat (1-3)? ");
        Integer nosto = Integer.parseInt(lukija.nextLine());

        if (nosto < 1 || nosto > 3) {
            System.out.println("Valitse luku väliltä 1-3");

        } else {
            this.tikkua -= nosto;
        }
        System.out.println();
    }

    private void tekoalyPelaa() {
        tulostaTikkujenMaara();
        int nosto = tekoaly.nostaTikkua(tikkua);
        System.out.println("Tekoäly valitsee " + nosto);
        tikkua -= nosto;
    }

    private void vanhempaaKoodiaJokaPitaaRefraktoidaMuttaEnJaksa() {
        boolean pelaaja1 = true;
        String pelaaja = "Pelaaja 1";
        tulostaTikkujenMaara();

        while (tikkua > 0) {

            if (!pelaaja1) {
                pelaaja = "Pelaaja 2";
            } else {
                pelaaja = "Pelaaja 1";
            }

            System.out.print(pelaaja + ": Kuinka monta tikkua nostat (1-3)? ");
            Integer nosto = Integer.parseInt(lukija.nextLine());

            if (nosto < 1 || nosto > 3) {
                System.out.println("Valitse luku väliltä 1-3");

            } else {
                this.tikkua -= nosto;
                pelaaja1 = !pelaaja1;
                tulostaTikkujenMaara();
            }
        }
        System.out.println(pelaaja + ", hävisit :/");
    }

    private void tulostaTikkujenMaara() {
        if (tikkua > 1) {
            System.out.println("\nPöydällä on " + tikkua + " tikkua.");

        } else if (tikkua == 1) {
            System.out.println("\nPöydällä on 1 tikku.");
        }
    }
}
