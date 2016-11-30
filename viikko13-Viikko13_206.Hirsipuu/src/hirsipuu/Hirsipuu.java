package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hirsipuu {

    private Sanalista sanalista;
    private List<Character> tehdytArvaukset;
    private int arvauksiaJaljella;
    private String arvattava;
    private List<Character> oikeatArvaukset;

    public Hirsipuu(Sanalista sanalista, int arvauksiaAlussa) {
        this.sanalista = sanalista;
        this.arvauksiaJaljella = arvauksiaAlussa;
        this.tehdytArvaukset = new ArrayList<>();
        this.oikeatArvaukset = new ArrayList<>();

        Collections.shuffle(this.sanalista.sanat());
        this.arvattava = this.sanalista.sanat().get(0);
    }

    public List<Character> arvaukset() {
        return this.tehdytArvaukset;
    }

    public int arvauksiaJaljella() {
        return this.arvauksiaJaljella;
    }

    public boolean arvaa(Character kirjain) {

        this.tehdytArvaukset.add(kirjain);
        if (this.arvattava.contains("" + kirjain)) {
            vaihdaSana(kirjain);
            this.oikeatArvaukset.add(kirjain);
            return true;
        }
        this.arvauksiaJaljella--;

        vaihdaSana(kirjain);

        return false;
    }

    private boolean vaihdaSana(Character kirjain) {
        try {
            Sanalista uusiLista = this.sanalista.sanatJoidenPituusOn(arvattava.length());
            uusiLista = uusiLista.sanatJoissaEiEsiinnyKirjainta(kirjain);
            uusiLista = uusiLista.sanatJoissaMerkit(sana());
            Collections.shuffle(uusiLista.sanat());
            this.arvattava = uusiLista.sanat().get(0);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public String sana() {
        String sana = this.arvattava;

        if (oikeatArvaukset.isEmpty()) {
            sana = sana.replaceAll("\\w", "-");
            return sana;
        }

        StringBuilder saanto = new StringBuilder();
        saanto.append("[^");
        for (Character kirjain : oikeatArvaukset) {
            saanto.append(kirjain);
        }
        saanto.append("]");
        sana = sana.replaceAll(saanto.toString(), "-");

        return sana;
    }

    public String oikeaSana() {
        return arvattava;
    }

    public boolean onLoppu() {
        if (sana().equals(arvattava)) {
            return true;
        }
        return false;
    }
}
