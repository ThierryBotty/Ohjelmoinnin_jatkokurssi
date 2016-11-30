package ilmoitin;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class Ilmoitin implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Frame");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        JTextField tekstialue1 = new JTextField();
        JLabel tekstialue2 = new JLabel();
        JButton kopioiPainike = new JButton("Päivitä");
        
        TapahtumanKuuntelija kopioija = new TapahtumanKuuntelija(tekstialue1, tekstialue2);
        kopioiPainike.addActionListener(kopioija);
        container.setLayout(new GridLayout(3, 1));
        
        container.add(tekstialue1);
        container.add(kopioiPainike);
        container.add(tekstialue2);
    }
}
