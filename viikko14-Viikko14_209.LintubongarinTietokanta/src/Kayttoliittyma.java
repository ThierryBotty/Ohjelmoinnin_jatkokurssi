
import java.util.*;

public class Kayttoliittyma {

    private Scanner lukija;
    private List<Lintu> linnut;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.linnut = new ArrayList<>();
    }

    public void run() {
        while (true) {
            System.out.print("? ");
            String komento = lukija.nextLine();
            if (!suoritaKomento(komento)) {
                break;
            }
        }
    }

    private boolean suoritaKomento(String komento) {
        switch (komento) {
            case "Lisaa":
                KomentoLisaa();
                break;
            case "Havainto":
                KomentoHavainto();
                break;
            case "Tilasto":
                KomentoTilasto();
                break;
            case "Nayta":
                KomentoNayta();
                break;
            case "Lopeta":
                return false;
        }
        return true;
    }

    private void KomentoLisaa() {
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        System.out.print("Latinankielinen nimi: ");
        String latNimi = lukija.nextLine();
        linnut.add(new Lintu(nimi, latNimi));
    }

    private void KomentoHavainto() {
        System.out.print("Mikä havaittu? ");
        String havainto = lukija.nextLine();
        Boolean loytyi = false;
        for (Lintu lintu : linnut) {
            if (lintu.getNimi().equalsIgnoreCase(havainto)) {
                lintu.havainto();
                loytyi = true;
            }
        }
        if (!loytyi) {
            System.out.println("Ei ole lintu!");
        }
    }

    private void KomentoTilasto() {
        linnut.stream().forEach(System.out::println);
    }

    private void KomentoNayta() {
        System.out.print("Mikä? ");
        String naytettava = lukija.nextLine();
        Boolean loytyi = false;
        for (Lintu lintu : linnut) {
            if (lintu.getNimi().equalsIgnoreCase(naytettava)) {
                System.out.println(lintu);
                loytyi = true;
            }
        }
        if (!loytyi) {
            System.out.println("Ei ole lintu!");
        }
    }
}
