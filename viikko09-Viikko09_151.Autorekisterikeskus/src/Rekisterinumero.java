
import java.util.Objects;


public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // HUOM: oliomuuttujissa on määre final eli niiden arvoa ei voi muuttaa!
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.rekNro);
        hash = 47 * hash + Objects.hashCode(this.maa);
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
        final Rekisterinumero other = (Rekisterinumero) olio;
        if (!Objects.equals(this.rekNro, other.rekNro)) {
            return false;
        }
        return Objects.equals(this.maa, other.maa);
    }
}
