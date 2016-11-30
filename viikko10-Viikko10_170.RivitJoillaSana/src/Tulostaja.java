
import java.io.File;
import java.util.Scanner;

public class Tulostaja {
    private Scanner lukija;
    
    public Tulostaja(String tiedostonNimi) throws Exception {
        
        this.lukija = new Scanner (new File(tiedostonNimi), "UTF-8");
    }
    
    public void tulostaRivitJoilla(String sana) {
        
        while (this.lukija.hasNextLine()) {
            String rivi = this.lukija.nextLine();
            if (sana.equals("") || rivi.contains(sana)) {
                System.out.println(rivi);
            }
        }
    }
}
