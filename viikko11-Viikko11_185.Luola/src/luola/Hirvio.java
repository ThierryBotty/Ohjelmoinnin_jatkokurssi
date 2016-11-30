package luola;

import java.util.*;

public class Hirvio {

    private int x;
    private int y;
    private int maxX;
    private int maxY;

    private Random random = new Random();

    public Hirvio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void asetaRaja(int leveys, int korkeus) {
        this.maxX = leveys;
        this.maxY = korkeus;
    }

    public boolean liiku(Pelaaja pelaaja, List<Hirvio> muutHirviot) {

        if (osuikoPelaajaan(pelaaja)) {
            return true;
        }

        int luku = random.nextInt(4);

        if (luku == 0) {
            if (!osuukoHirvioon(this.x + 1, this.y, muutHirviot)) {
                this.x++;
            }
        }

        if (luku == 1) {
            if (!osuukoHirvioon(this.x - 1, this.y, muutHirviot)) {
                this.x--;
            }
        }
        if (luku == 2) {
            if (!osuukoHirvioon(this.x, this.y - 1, muutHirviot)) {
                this.y++;
            }
        }
        if (luku == 3) {
            if (!osuukoHirvioon(this.x, this.y - 1, muutHirviot)) {
                this.y--;
            }
        }

        tarkistaOnkorajojenUlkopuolella();
        return (osuikoPelaajaan(pelaaja));
    }

    private boolean osuikoPelaajaan(Pelaaja pelaaja) {
        if (this.x == pelaaja.getX() && this.y == pelaaja.getY()) {
            return true;
        }
        return false;
    }

    private boolean osuukoHirvioon(int xSijainti, int ySijainti, List<Hirvio> hirviot) {
        for (Hirvio h : hirviot) {
            if (h.x == xSijainti && h.y == ySijainti) {
                return true;
            }
        }
        return false;
    }

    private void tarkistaOnkorajojenUlkopuolella() {
        if (this.x == maxX) {
            this.x = maxX - 1;
        }
        if (this.x < 0) {
            this.x = 0;
        }
        if (this.y == maxY) {
            this.y = maxY - 1;
        }
        if (this.y < 0) {
            this.y = 0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
