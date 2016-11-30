
import java.util.*;

public class Kayttoliittyma {

    private Scanner lukija;
    private ArrayList<Lentokone> lentokoneet;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.lentokoneet = new ArrayList<>();
    }

    public void kaynnista() {

        lentokentanHallinta();

        System.out.println("Lentopalvelu\n" + "------------\n" + "");
        while (true) {
            tulostaToiminnot();
            String syote = lukija.nextLine();
            if (syote.equals("x")) {
                break;
            }
            lentopalvelunToiminnot(syote);
        }
    }

    private void lentopalvelunToiminnot(String komento) {
        if (komento.equals("1")) {
            tulostaLentokoneet();

        } else if (komento.equals("2")) {
            tulostaLennot();

        } else if (komento.equals("3")) {
            tulostaLentokoneenTiedot();
        }
    }

    private void tulostaToiminnot() {
        System.out.println("Valitse toiminto:\n" + "[1] Tulosta lentokoneet\n"
                + "[2] Tulosta lennot\n" + "[3] Tulosta lentokoneen tiedot\n"
                + "[x] Lopeta");
        System.out.print("> ");
    }

    private void lentokentanHallinta() {
        System.out.println("Lentokentän hallinta\n"
                + "--------------------\n" + "");

        while (true) {

            System.out.println("Valitse toiminto:\n" + "[1] Lisää lentokone\n"
                    + "[2] Lisää lento\n" + "[x] Poistu hallintamoodista");
            System.out.print("> ");

            String syote = lukija.nextLine();

            if (syote.equals("x")) {
                System.out.println();
                break;
            }
            hoidaToiminto(syote);
        }
    }

    public void hoidaToiminto(String komento) {

        if (komento.equals("1")) {
            lisaaLentokone();

        } else if (komento.equals("2")) {
            lisaaLento();
        }
    }

    private void lisaaLentokone() {

        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());

        this.lentokoneet.add(new Lentokone(tunnus, kapasiteetti));
    }

    private void lisaaLento() {

        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahto = lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohde = lukija.nextLine();

        for (Lentokone lentokone : lentokoneet) {
            if (lentokone.getTunnus().equals(tunnus)) {
                lentokone.setReitit("(" + lahto + "-" + kohde + ")");
            }
        }
    }

    private void tulostaLentokoneet() {
        for (Lentokone lentokone : lentokoneet) {
            System.out.println(lentokone);
        }
    }

    private void tulostaLennot() {
        for (Lentokone lentokone : lentokoneet) {
            for (String tiedot : lentokone.getReitit()) {
                System.out.println(lentokone + " " + tiedot);
            }
        }
    }

    private void tulostaLentokoneenTiedot() {
        System.out.print("Mikä kone: ");
        String kone = lukija.nextLine();
        for (Lentokone lentokone : lentokoneet) {
            if (lentokone.getTunnus().equals(kone)) {
                System.out.println(lentokone);
            }
        }
    }
}
