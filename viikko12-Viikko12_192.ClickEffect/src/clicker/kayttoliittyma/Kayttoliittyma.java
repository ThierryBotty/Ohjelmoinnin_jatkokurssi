package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Laskuri laskuri;

    public Kayttoliittyma(Laskuri laskuri) {
        this.laskuri = laskuri;
    }

    @Override
    public void run() {
        frame = new JFrame("The Effect");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JLabel teksti = new JLabel("0");
        JButton painike = new JButton("Click!");
        
        painike.addActionListener(new KlikkaustenKuuntelija(laskuri, teksti));
        
        container.add(teksti);
        container.add(painike, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
