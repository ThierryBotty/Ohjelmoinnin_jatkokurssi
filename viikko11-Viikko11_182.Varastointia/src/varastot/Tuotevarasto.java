package varastot;

public class Tuotevarasto extends Varasto {
    private String nimi;

    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.nimi = tuotenimi;   
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }

    @Override
    public String toString() {
        return this.nimi + ": " + super.toString();
    }
}
