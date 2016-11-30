
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!

    }
    
    public static void lisaaMatkalaukutTiiliskivilla(Lastiruuma lastiruuma) {
        for (int i = 1; i < 101; i++) {
            Tavara tiiliskivi = new Tavara("tiiliskivi", i);
            Matkalaukku matkalaukku = new Matkalaukku(i);
            matkalaukku.lisaaTavara(tiiliskivi);
            lastiruuma.lisaaMatkalaukku(matkalaukku);
        }
    }
}