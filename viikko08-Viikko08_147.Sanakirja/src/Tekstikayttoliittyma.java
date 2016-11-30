
import java.util.*;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {
        System.out.println("Komennot:");
        System.out.println("  lisaa - lisää sanaparin sanakirjaan");
        System.out.println("  kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("  lopeta - poistuu kättöliittymästä");
        System.out.println();

        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }
            hoidaKomento(komento);
            System.out.println();
        }
    }

    private void komentoKaanna() {
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.println("Käännös: " + sanakirja.kaanna(sana));
    }

    private void komentoLisaa() {
        System.out.print("Suomeksi: ");
        String sana = lukija.nextLine();
        System.out.print("Käännös: ");
        String kaannos = lukija.nextLine();
        sanakirja.lisaa(sana, kaannos);
    }

    public void hoidaKomento(String komento) {
        if (komento.equals("lisaa")) {
            komentoLisaa();
        } else if (komento.equals("kaanna")) {
            komentoKaanna();
        } else {
            System.out.println("Tuntematon komento");
        }
    }
}
