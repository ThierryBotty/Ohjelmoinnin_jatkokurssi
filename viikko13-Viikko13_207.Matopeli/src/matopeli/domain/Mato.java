package matopeli.domain;

import java.util.*;
import matopeli.Suunta;
import static matopeli.Suunta.*;

public class Mato {

    private Suunta suunta;
    private List<Pala> palat;
    private boolean kasva;

    public Mato(int alkuX, int alkuY, Suunta alkusuunta) {

        this.suunta = alkusuunta;
        this.palat = new ArrayList<>();
        this.palat.add(new Pala(alkuX, alkuY));
        this.kasva = true;
    }

    public Suunta getSuunta() {
        return suunta;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    public int getPituus() {
        return this.palat.size();
    }

    public List<Pala> getPalat() {
        return palat;
    }

    public void liiku() {
        Pala viimeinen = this.palat.get(this.palat.size() - 1);
        int x = viimeinen.getX();
        int y = viimeinen.getY();

        if (this.suunta == ALAS) {
            palat.add(new Pala(x, y + 1));

        } else if (this.suunta == YLOS) {
            palat.add(new Pala(x, y - 1));

        } else if (this.suunta == VASEN) {
            palat.add(new Pala(x - 1, y));

        } else {
            palat.add(new Pala(x + 1, y));
        }

        if (getPituus() > 3 && this.kasva == false) {
            this.palat.remove(0);
        }
        this.kasva = false;
    }

    public void kasva() {
        this.kasva = true;
    }
    
    public boolean osuu(Pala pala) {
        for (Pala paloja : palat) {
            if (pala.osuu(paloja)) {
                return true;
            }
        }
        return false;
    }

    public boolean osuuItseensa() {
        for (int i = 0; i < palat.size() - 2; i++) {
            if (palat.get(i).osuu(palat.get(palat.size() - 1))) {
                return true;
            }
        }
        return false;
    }
}
