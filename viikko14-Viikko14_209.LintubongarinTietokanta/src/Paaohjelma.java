
import java.util.Scanner;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija);
        kayttoliittyma.run();
    }

}
