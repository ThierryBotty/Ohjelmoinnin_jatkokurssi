import java.util.*;

public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        Henkilo matti = new Henkilo("Viivi", 1.63, 55, 69);
        Henkilo asdf = new Henkilo("matti2", 1.62, 70, 69);
        Henkilo matt = new Henkilo("matti3", 1.32, 65, 69);
        Henkilo mai = new Henkilo("matti4", 1.62, 165, 69);
        Henkilo mtti = new Henkilo("matti5", 1.80, 90, 69);
        
        RaportinLuoja1 testi = new RaportinLuoja1();
        
        List<Henkilo> henkilot = new ArrayList<>();
        henkilot.add(matti);
        henkilot.add(asdf);
        henkilot.add(matt);
        henkilot.add(mai);
        henkilot.add(mtti);
        
        for (String nimi : testi.painoindeksiRaportti(henkilot).getAlipainoiset()) {
            System.out.println(nimi);
        }
        System.out.println("normi");
        for (String nimi : testi.painoindeksiRaportti(henkilot).getNormaalipainoiset()) {
            System.out.println(nimi);
        }
        System.out.println("yli");
        for (String nimi : testi.painoindeksiRaportti(henkilot).getYlipainoiset()) {
            System.out.println(nimi);
        }
        System.out.println("merk.");
        for (String nimi : testi.painoindeksiRaportti(henkilot).getMerkittavastiYlipainoiset()) {
            System.out.println(nimi);
        }
    }

}
