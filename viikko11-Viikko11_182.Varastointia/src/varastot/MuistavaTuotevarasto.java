package varastot;


public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }
    
    public String historia() {
        return this.muutoshistoria.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        this.muutoshistoria.lisaa(getSaldo() + maara);
        super.lisaaVarastoon(maara);
    }
    
    @Override
    public double otaVarastosta(double maara) {
        this.muutoshistoria.lisaa(getSaldo() - maara);
        return super.otaVarastosta(maara);
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + getNimi() + "\nHistoria: " + this.muutoshistoria 
                + "\nSuurin tuotemäärä: " + this.muutoshistoria.maxArvo() 
                + "\nPienin tuotemäärä: " + this.muutoshistoria.minArvo() 
                + "\nKeskiarvo: " + this.muutoshistoria.keskiarvo() 
                + "\nSuurin muutos: " + this.muutoshistoria.suurinMuutos() 
                + "\nVarianssi: " + this.muutoshistoria.varianssi());
    }
}
