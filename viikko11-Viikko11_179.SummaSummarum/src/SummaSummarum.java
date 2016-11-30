
import java.util.ArrayList;
import java.util.List;

public class SummaSummarum {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(0);
        lista.add(7);
        lista.add(0);
        lista.add(5);
        lista.add(4);
        lista.add(1);
        lista.add(0);
        lista.add(0);
        lista.add(6);

        List<Integer> summat = summaSummarum(lista);
        for (int luku : summat) {
            System.out.println(luku);
        }
    }

    public static List<Integer> summaSummarum(List<Integer> luvut) {
        // toteuta metodin toiminnallisuus tänne
        List<Integer> summat = new ArrayList<>();
        int summa = 0;
        for (int i = 0; i < luvut.size(); i++) {
            if (luvut.get(i) == 0) {
                summat.add(summa);
                summa = 0;
                if (luvut.get(i + 1) == 0) {
                    break;
                }
            }
            summa += luvut.get(i);
        }
        return summat;
    }
}
