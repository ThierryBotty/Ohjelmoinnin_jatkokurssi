
public class Sana {
    private String sana;
    private int maara;

    public Sana(String sana) {
        this.sana = sana;
        this.maara = 1;
    }

    public String haeSana() {
        return sana;
    }

    public int haeMaara() {
        return maara;
    }

    public void kasvataMaara() {
        this.maara++;
    }
}
