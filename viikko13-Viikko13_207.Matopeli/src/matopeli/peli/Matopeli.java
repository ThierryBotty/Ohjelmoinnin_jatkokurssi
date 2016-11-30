package matopeli.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import matopeli.Suunta;
import matopeli.domain.*;
import matopeli.gui.Paivitettava;

public class Matopeli extends Timer implements ActionListener {

    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitettava paivitettava;
    private Mato mato;
    private Omena omena;

    public Matopeli(int leveys, int korkeus) {
        super(1000, null);

        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.mato = new Mato(leveys / 2, korkeus / 2, Suunta.ALAS);
        asetaOmenaSatunnaisesti();

    }

    private void asetaOmenaSatunnaisesti() {
        Random random = new Random();
        int x;
        int y;
        while (true) {
            x = random.nextInt(this.leveys);
            y = random.nextInt(this.korkeus);
            if (!mato.osuu(new Omena(x, y))) {
                this.omena = new Omena(x,y);
                break;
            }
        }
    }

    public Mato getMato() {
        return mato;
    }

    public void setMato(Mato mato) {
        this.mato = mato;
    }

    public Omena getOmena() {
        return omena;
    }

    public void setOmena(Omena omena) {
        this.omena = omena;
    }

    public boolean jatkuu() {
        return jatkuu;
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!jatkuu) {
            return;
        }
        mato.liiku();
        if (mato.osuu(omena)) {
            mato.kasva();
            asetaOmenaSatunnaisesti();
        }
        if (mato.osuuItseensa()) {
            jatkuu = false;
        }
        Pala pala = mato.getPalat().get(mato.getPituus()-1);
        if (pala.getX() < 0 || pala.getX() >= this.leveys || pala.getY() < 0 || pala.getY() >= this.korkeus) {
            jatkuu = false;
        }
        
        paivitettava.paivita();
        setDelay(1000 / mato.getPituus()); 
    }

}
