package liikkuvakuvio;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {
    private Kuvio kuvio;

    public Piirtoalusta(Kuvio kuvio) {
        super.setBackground(Color.WHITE);
        this.kuvio = kuvio;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        kuvio.piirra(g);
    }   
}
