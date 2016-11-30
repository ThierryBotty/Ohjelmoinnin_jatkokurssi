
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        Henkilo matti = new Henkilo("matti", 1.82, 45, 95);
        Henkilo asdf = new Henkilo("matti2", 1.62, 70, 102);
        Henkilo matt = new Henkilo("matti3", 1.32, 65, 98);
        Henkilo mai = new Henkilo("matti4", 1.62, 165, 88);
        Henkilo mtti = new Henkilo("matti5", 1.80, 90, 105);
        
        MittaustenTasoittaja1 testi = new MittaustenTasoittaja1();
        
        List<Henkilo> henkilot = new ArrayList<>();
        henkilot.add(matti);
        henkilot.add(asdf);
        henkilot.add(matt);
        henkilot.add(mai);
        henkilot.add(mtti);
        
        System.out.println(testi.tasoita(henkilot));
    }

}
