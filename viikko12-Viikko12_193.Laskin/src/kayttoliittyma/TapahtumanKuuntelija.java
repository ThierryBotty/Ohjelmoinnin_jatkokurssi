package kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TapahtumanKuuntelija implements ActionListener {

    private JButton plus;
    private JButton miinus;
    private JButton z;
    private JTextField ylempiTekstiKentta;
    private JTextField alempiTekstiKentta;

    public TapahtumanKuuntelija(JButton plus, JButton miinus, JButton z,
            JTextField ylempiTekstiKentta, JTextField alempiTekstiKentta) {

        this.plus = plus;
        this.miinus = miinus;
        this.z = z;
        this.ylempiTekstiKentta = ylempiTekstiKentta;;
        this.alempiTekstiKentta = alempiTekstiKentta;;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int ylempi = Integer.parseInt(this.ylempiTekstiKentta.getText());        
        int alempi = 0;
        
        if (this.alempiTekstiKentta.getText().matches("\\d+")) {
            alempi = Integer.parseInt(this.alempiTekstiKentta.getText());
        }
        
        if (ae.getSource() == plus) {
            this.ylempiTekstiKentta.setText("" + (ylempi + alempi));
            
        } else if (ae.getSource() == miinus) {
            this.ylempiTekstiKentta.setText("" + (ylempi - alempi));
            
        } else {
            this.ylempiTekstiKentta.setText("0");
        }
        this.alempiTekstiKentta.setText("");
        
        if (Integer.parseInt(this.ylempiTekstiKentta.getText()) == 0) {
            this.z.setEnabled(false);
        } else {
            this.z.setEnabled(true);
        }
    }
}
