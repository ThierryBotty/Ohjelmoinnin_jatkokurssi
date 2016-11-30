import java.util.ArrayList;

public class Varianssi {
    // Tee tänne metodi, joka summaa listan alkiot ja palauttaa summan
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for (Integer luku : lista) {
            summa += luku;
        }
        return summa;
    }
    
    // Tee tänne metodi, joka laskee listan alkioiden keskiarvon ja palauttaa sen
    public static double keskiarvo(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        return 1.0 * summa(lista)/lista.size();
    }

    public static double varianssi(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double summa = 0;
        double ka = keskiarvo(lista);
        for (Integer luku : lista) {
            summa += Math.pow((luku - ka), 2);
            
        }
        return summa / (lista.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Varianssi: " + varianssi(lista));
    }

}
