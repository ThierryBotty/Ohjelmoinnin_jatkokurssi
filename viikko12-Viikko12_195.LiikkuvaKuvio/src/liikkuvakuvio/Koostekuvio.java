package liikkuvakuvio;

import java.awt.Graphics;
import java.util.*;

public class Koostekuvio extends Kuvio {
    private List<Kuvio> kuviot;

    public Koostekuvio() {
        super(0, 0);
        this.kuviot = new ArrayList<>();
    }
    
    public void liita(Kuvio k) {
        this.kuviot.add(k);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Kuvio kuvio : kuviot) {
            kuvio.siirra(dx, dy);
        }
    }

    @Override
    public void piirra(Graphics graphics) {
        for (Kuvio kuvio : kuviot) {
            kuvio.piirra(graphics);
        }
    }
}
