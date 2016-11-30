
import java.util.Objects;

public class Lintu {

    private String nimi;
    private String latinankielinenNimi;
    private int rengastusvuosi;

    public Lintu(String nimi, String latinankielinenNimi, int rengastusvuosi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.rengastusvuosi = rengastusvuosi;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.latinankielinenNimi);
        hash = 79 * hash + this.rengastusvuosi;
        return hash;
    }

    @Override
    public boolean equals(Object olio) {
        if (olio == null) {
            return false;
        }
        if (getClass() != olio.getClass()) {
            return false;
        }
        final Lintu toinen = (Lintu) olio;
        if (!Objects.equals(this.latinankielinenNimi, toinen.latinankielinenNimi)) {
            return false;
        }
        if (this.rengastusvuosi != toinen.rengastusvuosi) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.latinankielinenNimi + " (" + this.rengastusvuosi + ")";
    }
}
