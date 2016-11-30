package liikkuvakuvio;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NappaimistonKuuntelija implements KeyListener {

    private Component component; 
    private Kuvio kuvio;

    public NappaimistonKuuntelija(Component component, Kuvio kuvio) {
        this.component = component;
        this.kuvio = kuvio;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            kuvio.siirra(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            kuvio.siirra(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            kuvio.siirra(0, 1);
        } else {
            kuvio.siirra(0, -1);
        }
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
