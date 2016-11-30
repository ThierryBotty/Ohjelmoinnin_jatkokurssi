
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        System.out.print("sekunnit: ");
        int sek = lukija.nextInt(); // kysy sekuntien alkuarvo käyttäjältä
        System.out.print("minuutit: ");
        int min = lukija.nextInt(); // kysy minuuttien alkuarvo käyttäjältä
        System.out.print("tunnit: ");
        int tun = lukija.nextInt(); // kysy tuntien alkuarvo käyttäjältä

        sekunnit.asetaArvo(sek);
        minuutit.asetaArvo(min);
        tunnit.asetaArvo(tun);

        int i = 0;
        while (i < 121) {
            // lisää edelliseen myös sekuntiviisari
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);
            sekunnit.seuraava();
            if (sekunnit.arvo() == 0) {
                minuutit.seuraava();
                if (minuutit.arvo() == 0) {
                    tunnit.seuraava();
                }
            }
            i++;
        }
    }
}
