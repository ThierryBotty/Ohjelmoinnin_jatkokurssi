import java.util.*;

public class Sanakirja {
    private HashMap<String, String> sanakirja;

    public Sanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public String kaanna(String sana) {
        return sanakirja.get(sana);
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.put(sana, kaannos);
    }
    
    public int sanojenLukumaara() {
        return sanakirja.size();
    }
    
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> lista = new ArrayList<>();
        for (String sana : this.sanakirja.keySet()) {
            lista.add(sana + " = " + this.sanakirja.get(sana));
        }
        return lista;
    }
}
