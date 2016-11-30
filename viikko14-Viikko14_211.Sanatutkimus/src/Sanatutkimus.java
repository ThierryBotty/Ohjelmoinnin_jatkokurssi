
import java.io.*;
import java.util.*;

public class Sanatutkimus {

    private List<String> sanat;
    private File tiedosto;

    public Sanatutkimus(String tiedostonnimi) {
        this.tiedosto = new File(tiedostonnimi);
        this.sanat = new ArrayList();
        lisaaSanat();
    }

    public int sanojenMaara() {
        return sanat.size();
    }

    public boolean onkoSanaa(String sana) {
        for (String s : sanat) {
            if (s.equals(sana)) {
                return true;
            }
        }
        return false;
    }

    public int laskeSanat(int pituus) {
        int luku = 0;
        for (String sana : sanat) {
            if (sana.length() == pituus) {
                luku++;
            }
        }
        return luku;
    }

    public void pituustilasto() {
        for (int i = 1; i < 31; i++) {
            System.out.println(laskeSanat(i));
        }
    }

    public int laskeKirjaimet(char kirjain) {
        int luku = 0;
        for (String sana : sanat) {
            for (Character k : sana.toCharArray()) {
                if (k == kirjain) {
                    luku++;
                }
            }
        }
        return luku;
    }

    public void kirjaintilasto() {
        char[] aakkoset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (Character kirjain : aakkoset) {
            System.out.println(laskeKirjaimet(kirjain));
        }
    }

    public ArrayList<String> haePituudella(int pituus) {
        ArrayList<String> lista = new ArrayList<>();
        for (String sana : sanat) {
            if (sana.length() == pituus) {
                lista.add(sana);
            }
        }
        return lista;
    }

    public ArrayList<String> haeOsalla(String osa) {
        ArrayList<String> lista = new ArrayList<>();
        for (String sana : sanat) {
            if (sana.contains(osa)) {
                lista.add(sana);
            }
        }
        return lista;
    }

    public ArrayList<String> haePalindromit() {
        ArrayList<String> lista = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String sana : sanat) {
            if (sana.equals(new StringBuilder(sana).reverse().toString())) {
                lista.add(sana);
            }
        }
        return lista;
    }

    public ArrayList<String> haeRistikkoon(String pohja) {
        ArrayList<String> lista = new ArrayList<>();
        pohja = pohja.replaceAll("\\?", "[a-ö]");
        for (String sana : sanat) {
            if (sana.matches(pohja)) {
                lista.add(sana);
            }
        }
        return lista;
    }

    private void lisaaSanat() {
        try {
            Scanner lukija = new Scanner(tiedosto, "UTF-8");
            while (lukija.hasNext()) {
                sanat.add(lukija.next());

            }
        } catch (Exception e) {
        }
    }
}
