package matopeli.gui;

import java.awt.event.*;
import matopeli.Suunta;
import matopeli.domain.Mato;

public class Nappaimistonkuuntelija implements KeyListener {

    private Mato mato;

    public Nappaimistonkuuntelija(Mato mato) {
        this.mato = mato;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (mato.getSuunta() != Suunta.ALAS) {
                mato.setSuunta(Suunta.YLOS);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (mato.getSuunta() != Suunta.YLOS) {
                mato.setSuunta(Suunta.ALAS);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (mato.getSuunta() != Suunta.OIKEA) {
                mato.setSuunta(Suunta.VASEN);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (mato.getSuunta() != Suunta.VASEN) {
                mato.setSuunta(Suunta.OIKEA);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
