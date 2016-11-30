package kayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class GraafinenLaskin implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Laskin");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JTextField ylempiTekstiKentta = new JTextField("0");
        ylempiTekstiKentta.setEnabled(false);
        JTextField alempiTekstiKentta = new JTextField();

        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton z = new JButton("Z");
        z.setEnabled(false);

        TapahtumanKuuntelija kuuntelija = new TapahtumanKuuntelija(plus,
                minus, z, ylempiTekstiKentta, alempiTekstiKentta);
        
        plus.addActionListener(kuuntelija);
        minus.addActionListener(kuuntelija);
        z.addActionListener(kuuntelija);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(z);

        container.setLayout(new GridLayout(3, 1));
        container.add(ylempiTekstiKentta);
        container.add(alempiTekstiKentta);
        container.add(panel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
