
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        
        MittausRaportoija2 testi = new MittausRaportoija2();
        ArrayList<Double> lista = new ArrayList<>();
        
        lista.add( (double) 20151004);
        lista.add( (double) 200);
        lista.add( (double) 150);
        lista.add( (double) 175);
        lista.add( (double) 20151005);
        lista.add( (double) 0.002);
        lista.add( (double) 0.03);
        lista.add( (double) 20151007);
        lista.add( (double) 15);
        
        
        for (SuurinTaajuusRaportti tieto : testi.paivittaisetMaksimit(lista, 10)) {
            System.out.println(tieto.getPaiva() + " " + tieto.getSuurinArvo());
        }
        
    }

}
