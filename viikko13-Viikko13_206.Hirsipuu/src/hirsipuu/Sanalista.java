package hirsipuu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sanalista {

    private List<String> sanat;

    public Sanalista(List<String> sanat) {
        this.sanat = sanat;
    }

    public List<String> sanat() {
        return this.sanat;
    }

    public Sanalista sanatJoidenPituusOn(int pituus) {
        List<String> sanoja = new ArrayList<>();
        for (String sana : this.sanat) {
            if (sana.length() == pituus) {
                sanoja.add(sana);
            }
        }
        Sanalista sanalista = new Sanalista(sanoja);
        return sanalista;
    }

    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {
        List<String> sanoja = new ArrayList<>();
        for (String sana : this.sanat) {
            if (sana.contains("" + kirjain)) {
                continue;
            }
            sanoja.add(sana);
        }
        Sanalista sanalista = new Sanalista(sanoja);
        return sanalista;
    }

    public Sanalista sanatJoissaMerkit(String merkkijono) {
        Sanalista sanalista = sanatJoidenPituusOn(merkkijono.length());
        List<String> sanoja = sanalista.sanat();
        Iterator<String> iteraattori = sanoja.iterator();
        
        while (iteraattori.hasNext()) {
            String seuraava = iteraattori.next();
            for (int i = 0; i < merkkijono.length(); i++) {
                if (merkkijono.charAt(i) != seuraava.charAt(i) && merkkijono.charAt(i) != '-') {
                    iteraattori.remove();
                }
            }
        }
        return new Sanalista(sanoja);
    }

    public int koko() {
        return this.sanat.size();
    }
}
