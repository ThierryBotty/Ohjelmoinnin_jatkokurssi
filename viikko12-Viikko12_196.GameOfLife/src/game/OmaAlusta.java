package game;

import gameoflife.GameOfLifeAlusta;
import java.util.Random;

public class OmaAlusta extends GameOfLifeAlusta {

    public OmaAlusta(int leveys, int korkeus) {
        super(leveys, korkeus);
    }

    @Override
    public void alustaSatunnaisetPisteet(double todennakoisyysPisteelle) {
        Random random = new Random();

        for (int x = 0; x < getLeveys(); x++) {
            for (int y = 0; y < getKorkeus(); y++) {
                if (todennakoisyysPisteelle >= random.nextDouble()) {
                    muutaElavaksi(x, y);
                }
            }
        }
    }

    @Override
    public boolean onElossa(int x, int y) {
        if (onkoRajojenSisalla(x, y)) {
            return getAlusta()[x][y];
        }
        return false;
    }

    @Override
    public void muutaElavaksi(int x, int y) {
        if (onkoRajojenSisalla(x, y)) {
            getAlusta()[x][y] = true;
        }
    }

    @Override
    public void muutaKuolleeksi(int x, int y) {
        if (onkoRajojenSisalla(x, y)) {
            getAlusta()[x][y] = false;
        }
    }

    @Override
    public int getElossaOlevienNaapurienLukumaara(int x, int y) {
        int elossa = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((i != 0 || j != 0) && onElossa(x + i, y + j)) {
                    elossa++;
                }
            }
        }
        return elossa;
    }

    @Override
    public void hoidaSolu(int x, int y, int elossaOleviaNaapureita) {
        if (!onElossa(x, y)) {
            if (elossaOleviaNaapureita == 3) {
                muutaElavaksi(x, y);
            }
        } else {
            if (elossaOleviaNaapureita < 2 || elossaOleviaNaapureita > 3) {
                muutaKuolleeksi(x, y);
            }
        }
    }

    private boolean onkoRajojenSisalla(int x, int y) {
        if (x >= 0 && y >= 0 && x < getLeveys() && y < getKorkeus()) {
            return true;
        }
        return false;
    }
}
