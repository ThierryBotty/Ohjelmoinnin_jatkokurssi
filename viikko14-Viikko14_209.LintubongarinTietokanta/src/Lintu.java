
public class Lintu {
    private String nimi;
    private String latNimi;
    private int havainnot;

    public Lintu(String nimi, String latNimi) {
        this.nimi = nimi;
        this.latNimi = latNimi;
        this.havainnot = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public void havainto() {
        havainnot++;
    }
    
    @Override
    public String toString() {
        return nimi + " (" + latNimi + "): " + havainnot + " havaintoa";
    }
}
