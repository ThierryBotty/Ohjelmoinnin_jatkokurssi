package maatilasimulaattori;

import java.util.*;

public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobotti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }

    public void hoida(Lehma lehma) {
        try {
            this.lypsyrobotti.lypsa(lehma);
        } catch (Exception e) {
            throw new IllegalStateException("Lypsyrobotti ei ole asennettu");
        }
    }

    public void hoida(Collection<Lehma> lehmat) {
        for (Lehma lehma : lehmat) {
            hoida(lehma);
        }
    }

    @Override
    public String toString() {
        return "Navetta: " + this.maitosailio.toString();
    }
}
