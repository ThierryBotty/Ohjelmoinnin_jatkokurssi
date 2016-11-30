package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class KlikkaustenKuuntelija implements ActionListener {

    private Laskuri laskuri;
    private JLabel label;

    public KlikkaustenKuuntelija(Laskuri laskuri, JLabel label) {
        this.laskuri = laskuri;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.laskuri.kasvata();
        this.label.setText(this.laskuri.annaArvo() + "");
    }
}
