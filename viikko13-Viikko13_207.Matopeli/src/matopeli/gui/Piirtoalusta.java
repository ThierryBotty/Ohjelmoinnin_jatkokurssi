package matopeli.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import matopeli.domain.Pala;
import matopeli.peli.Matopeli;

public class Piirtoalusta extends JPanel implements Paivitettava {

    private Matopeli matopeli;
    private int sivu;

    public Piirtoalusta(Matopeli matopeli, int palanSivunPituus) {
        this.matopeli = matopeli;
        this.sivu = palanSivunPituus;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        for (Pala pala : matopeli.getMato().getPalat()) {
            g.fill3DRect(pala.getX() * sivu, pala.getY() * sivu, sivu, sivu, true);
        }
        g.setColor(Color.red);
        g.fillOval(matopeli.getOmena().getX() * sivu,
                matopeli.getOmena().getY() * sivu, sivu, sivu);
    }

    @Override
    public void paivita() {
        repaint();
    }
}
