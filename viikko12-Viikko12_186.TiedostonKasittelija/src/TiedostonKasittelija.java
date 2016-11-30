
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(new File(tiedosto));
        
        while (lukija.hasNextLine()) {
            lista.add(lukija.nextLine());
        }
        return lista;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        FileWriter kirjoittaja = new FileWriter(new File(tiedosto));
        kirjoittaja.write(teksti);
        kirjoittaja.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        FileWriter kirjoittaja = new FileWriter(new File(tiedosto));
        for (String teksti : tekstit) {
            kirjoittaja.write(teksti + "\n");
        }
        kirjoittaja.close();
    }
}
