package game;

import gameoflife.Simulaattori;

public class Main {

    public static void main(String[] args) {
        // testaa ohjelmaasi täällä
        OmaAlusta alusta = new OmaAlusta(150, 150);
        alusta.alustaSatunnaisetPisteet(0.7);

        Simulaattori simulaattori = new Simulaattori(alusta);
        simulaattori.simuloi();
    }
}
