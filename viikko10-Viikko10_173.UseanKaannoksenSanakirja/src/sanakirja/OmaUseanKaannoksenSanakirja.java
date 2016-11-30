package sanakirja;

import java.util.*;

public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja{
    private Map<String, Set> sanakirja;

    public OmaUseanKaannoksenSanakirja() {
        this.sanakirja = new HashMap<>();
    }

    @Override
    public void lisaa(String sana, String kaannos) {
        if (!this.sanakirja.containsKey(sana)) {
            this.sanakirja.put(sana, new HashSet<>());
        }
        
        this.sanakirja.get(sana).add(kaannos);
    }

    @Override
    public Set<String> kaanna(String sana) {
        return this.sanakirja.get(sana);
    }

    @Override
    public void poista(String sana) {
        this.sanakirja.remove(sana);
    }
}