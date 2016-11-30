
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Hip Hip Hurraa"
        
        System.out.print("Kirjoita merkkijono: ");
        String teksti = lukija.nextLine();
        
        for (int i = 0; i < teksti.length(); i++) {
            
            System.out.print(teksti.charAt(i));
            
            if (i % 2 == 1) {
                System.out.print(" hip");
            }
            
            if (i % 5 == 4) {
                System.out.print(" hurraa");
            }
            System.out.println();
        }

    }
}
