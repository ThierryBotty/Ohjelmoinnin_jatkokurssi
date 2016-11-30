package tyokalut;

import java.util.*;

public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {
    
    private int duplikaatit;
    private Set<String> uniikit;

    public OmaDuplikaattienPoistaja() {
        this.duplikaatit = 0;
        this.uniikit = new HashSet<>();
    }

    @Override
    public void lisaa(String merkkijono) {
        if (this.uniikit.contains(merkkijono)) {
            this.duplikaatit++;
        }
        this.uniikit.add(merkkijono);
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return this.duplikaatit;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return this.uniikit;
    }

    @Override
    public void tyhjenna() {
        this.uniikit.clear();
        this.duplikaatit = 0;
    }
}