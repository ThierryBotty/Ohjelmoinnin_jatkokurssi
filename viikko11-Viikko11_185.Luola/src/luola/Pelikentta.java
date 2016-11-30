package luola;

import java.util.*;

public class Pelikentta {

    final private char a = '@';
    final private char tyhja = '.';
    final private char hirvio = 'h';

    public void tulostaKentta(int leveys, int korkeus, Pelaaja pelaaja, List<Hirvio> hirviot) {
        char[][] pelikentta = new char[korkeus][leveys];
        
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < leveys; j++) {
                pelikentta[i][j] = tyhja;
            }
        }
        
        for (Hirvio h : hirviot) {
            pelikentta[h.getY()][h.getX()] = this.hirvio;
        }
        
        pelikentta[pelaaja.getY()][pelaaja.getX()] = a;

        for (char[] kohta : pelikentta) {
            System.out.println(kohta);
        }
        System.out.println();
    }
}
