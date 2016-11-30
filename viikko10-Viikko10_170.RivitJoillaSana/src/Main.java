
public class Main {

    public static void main(String[] args) throws Exception {
        // tee testikoodia tänne
        // projektissa kokeiluja varten tiedostot
        //    src/testitiedosto.txt
        //    src/kalevala.txt
        Tulostaja t = new Tulostaja("src/testitiedosto.txt");
        t.tulostaRivitJoilla("Väinämöinen");
    }
}
