
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja    
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();

        if (kellonaika(merkkijono)) {
            System.out.println("Muoto on oikea.");
        } else {
            System.out.println("Muoto ei ole oikea.");
        }
    }

    public static boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }

    public static boolean kaikkiVokaaleja(String merkkijono) {
        return merkkijono.matches("[aeiouyåäö]*");
    }

    public static boolean kellonaika(String merkkijono) {
        return merkkijono.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
