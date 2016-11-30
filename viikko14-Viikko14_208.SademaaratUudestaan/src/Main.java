
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna sademääriä, lopeta luvulla 999999");
        double summa = 0;
        int lukuja = 0;
        while (true) {
            System.out.println("Anna sademäärä:");
            double luku = Double.parseDouble(lukija.nextLine());
            if (luku == 999999) {
                break;
            }
            if (luku >= 0) {
                summa += luku;
                lukuja++;
            }
        }
        if (lukuja == 0) {
            System.out.println("Yhtään sademäärää ei syötetty.");
        } else {
            System.out.println("Sademäärien keskiarvo on " + summa / lukuja);
        }
    }
}
