package tiedosto;

import java.io.File;
import java.util.Scanner;

public class Analyysi {
    
    private File tiedosto;
    
    public Analyysi(File tiedosto) throws Exception { 
        this.tiedosto = tiedosto;
    }
    
    public int rivimaara() throws Exception {
        Scanner lukija = new Scanner(tiedosto);
        
        int rivienMaara = 0;
        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            rivienMaara++;
        }
        return rivienMaara;
    }
    
    public int merkkeja() throws Exception {
        Scanner lukija = new Scanner(tiedosto);
        int merkkeja = 0;
        while (lukija.hasNext()) {
            String rivi = lukija.nextLine();
            merkkeja += (rivi.length() + 1);
        }
        return merkkeja;
    }
}
