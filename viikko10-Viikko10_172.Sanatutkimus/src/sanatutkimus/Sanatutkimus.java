package sanatutkimus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanatutkimus {

    private File tiedosto;

    public Sanatutkimus(File tiedosto) {
        this.tiedosto = tiedosto;
    }

    public int sanojenMaara() throws FileNotFoundException {
        return lueTiedosto().size();
    }

    private List<String> lueTiedosto() throws FileNotFoundException {
        Scanner lukija = new Scanner(tiedosto, "UTF-8");
        List<String> sanat = new ArrayList<>();

        while (lukija.hasNext()) {
            sanat.add(lukija.next());
        }
        return sanat;
    }

    public List<String> kirjaimenZSisaltavatSanat() throws FileNotFoundException {
        List<String> sanat = new ArrayList<>();

        for (String sana : lueTiedosto()) {
            if (sana.contains("z")) {
                sanat.add(sana);
            }
        }
        return sanat;
    }

    public List<String> kirjaimeenLPaattyvatSanat() throws FileNotFoundException {
        List<String> sanat = new ArrayList<>();

        for (String sana : lueTiedosto()) {
            if (sana.endsWith("l")) {
                sanat.add(sana);
            }
        }
        return sanat;
    }

    public List<String> palindromit() throws FileNotFoundException {
        List<String> palindromit = new ArrayList<>();

        for (String sana : lueTiedosto()) {

            if (new StringBuilder(sana).reverse().toString().equals(sana)) {
                //en jaksanut tehdä taas metodia joka kääntää sanaa,
                //joten poimin netistä valmiin metodin.
                palindromit.add(sana);
            }
        }
        return palindromit;
    }

    public List<String> kaikkiVokaalitSisaltavatSanat() throws FileNotFoundException {
        List<String> sanat = new ArrayList<>();

        for (String sana : lueTiedosto()) {
            if (sana.contains("a") && sana.contains("e") && sana.contains("i")
                    && sana.contains("o") && sana.contains("u") && sana.contains("y")
                    && sana.contains("ä") && sana.contains("ö")) {

                sanat.add(sana);
            }
        }
        return sanat;
    }
}
