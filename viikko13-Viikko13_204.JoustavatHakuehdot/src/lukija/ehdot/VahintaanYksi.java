package lukija.ehdot;

public class VahintaanYksi implements Ehto {
    Ehto[] ehdot;

    public VahintaanYksi(Ehto... ehdot) {
        this.ehdot = ehdot;
    }

    @Override
    public boolean toteutuu(String rivi) {
        for (int i = 0; i < ehdot.length; i++) {
            if (ehdot[i].toteutuu(rivi)) {
                return true;
            }
        }
        return false;                
    }
}
