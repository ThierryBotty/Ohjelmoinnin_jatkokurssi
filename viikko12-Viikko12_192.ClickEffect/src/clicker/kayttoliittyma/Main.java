package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import clicker.sovelluslogiikka.OmaLaskuri;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Laskuri laskuri = new OmaLaskuri();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(laskuri);
        SwingUtilities.invokeLater(kayttoliittyma);
    }
}
