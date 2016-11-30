package tiedosto;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // testaa luokkasi toimintaa täällä

        //File tiedosto = new File("src/testitiedosto.txt");
        Analyysi a = new Analyysi(new File("test/testitiedosto.txt"));
        System.out.println(a.rivimaara());
        System.out.println(a.merkkeja());
    }
}
