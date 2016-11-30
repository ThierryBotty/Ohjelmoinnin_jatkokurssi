public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;

    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        // kirjoita koodia tähän
        this.arvo = 0;
        this.ylaraja = ylarajanAlkuarvo;
    }

    public void seuraava() {
        // kirjoita koodia tähän
        this.arvo++;
        if (this.arvo > this.ylaraja) {
            this.arvo = 0;
        }
    }

    public int arvo() {
        return arvo;
    }

    public void asetaArvo(int arvo) {
        if (arvo >= 0 && arvo <= this.ylaraja) {
            this.arvo = arvo;
        }
    }
    
    

    @Override
    public String toString() {
        if (this.arvo < 10) {
            return "0" + this.arvo;
        }
        return "" + this.arvo;
    }
}