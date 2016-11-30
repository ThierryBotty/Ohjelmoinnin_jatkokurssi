package lukija.ehdot;

public class LoppuuHuutoTaiKysymysmerkkiin implements Ehto {

    @Override
    public boolean toteutuu(String rivi) {
        return rivi.endsWith("?") || rivi.endsWith("!");
    }
}
