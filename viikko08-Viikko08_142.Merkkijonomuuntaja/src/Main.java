
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        String sana = "porkkana";
        Muunnos muunnos1 = new Muunnos('a', 'b');
        sana = muunnos1.muunna(sana);

        System.out.println(sana);

        Muunnos muunnos2 = new Muunnos('k', 'x');
        sana = muunnos2.muunna(sana);

        System.out.println(sana);
    }
}
