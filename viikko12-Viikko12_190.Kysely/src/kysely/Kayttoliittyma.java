package kysely;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Luo sovelluksesi tänne
        frame = new JFrame("Ikkuna");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void luoKomponentit(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Oletko?"));
        container.add(new JCheckBox("Kyllä"));
        container.add(new JCheckBox("En"));
        container.add(new JLabel("Miksi?"));
        
        JRadioButton eka = new JRadioButton("Siksi.");
        JRadioButton toka = new JRadioButton("Koska se on kivaa!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        buttonGroup.add(eka);
        buttonGroup.add(toka);
        
        container.add(eka);
        container.add(toka);
        
        container.add(new JButton("Valmis"));
    }

    public JFrame getFrame() {
        return frame;
    }
}
