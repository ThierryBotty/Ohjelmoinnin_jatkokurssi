
public class Laskin {

    private Lukija lukija;
    private int laskujenmaara;

    public Laskin() {
        this.lukija = new Lukija();
        this.laskujenmaara = 0;
    }

    public void kaynnista() {
        while (true) {
            System.out.print("komento: ");
            String komento = lukija.lueMerkkijono();
            if (komento.equals("lopetus")) {
                break;
            }

            if (komento.equals("summa")) {
                summa();
            } else if (komento.equals("erotus")) {
                erotus();
            } else if (komento.equals("tulo")) {
                tulo();
            }
        }

        statistiikka();
    }

    private void summa() {
        int[] luvut = kysyluvut();
        System.out.println("Lukujen summa " + (luvut[0] + luvut[1]));
        System.out.println();
    }

    private void erotus() {
        int[] luvut = kysyluvut();
        System.out.println("Lukujen erotus " + (luvut[0] - luvut[1]));
        System.out.println();
    }

    private void tulo() {
        int[] luvut = kysyluvut();
        System.out.println("Lukujen tulos " + (luvut[0] * luvut[1]));
        System.out.println();
    }

    private void statistiikka() {
        System.out.println("Laskuja laskettiin " + this.laskujenmaara);
    }

    private int[] kysyluvut() {
        
        this.laskujenmaara++;
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        return new int[] {luku1, luku2};
    }
}
