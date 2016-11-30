import java.util.*;

public class Main {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("apina");
        lista.add("apina");
        lista.add("apina");
        lista.add("piina");
        lista.add("kapina");
        lista.add("apina");
        lista.add("kissa");
        lista.add("apina");
        lista.add("apina");
        lista.add("hai");
        lista.add("apina");
        lista.add("kissa");
        lista.add("hai");
        
        YleisimmatSanat2 yleisimmat = new YleisimmatSanat2();
        
        System.out.println(yleisimmat.yleisetSanat(lista));
        
        
    }

}
