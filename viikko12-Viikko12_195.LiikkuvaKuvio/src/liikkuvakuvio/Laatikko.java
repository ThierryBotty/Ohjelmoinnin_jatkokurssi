package liikkuvakuvio;

import java.awt.Graphics;

public class Laatikko extends Kuvio {
    private int leveys;
    private int korkeus;

    public Laatikko(int x, int y, int leveys, int korkeus) {
        super(x, y);
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    @Override
    public void piirra(Graphics graphics) {
        graphics.fillRect(getX(), getY(), leveys, korkeus);
    }
}
