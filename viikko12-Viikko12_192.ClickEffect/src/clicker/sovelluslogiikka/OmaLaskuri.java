package clicker.sovelluslogiikka;

public class OmaLaskuri implements Laskuri{
    private int arvo;

    public OmaLaskuri() {
        this.arvo = 0;
    }
    
    @Override
    public void kasvata() {
        this.arvo++;
    }
    
    @Override
    public int annaArvo() {
        return this.arvo;
    }
}
