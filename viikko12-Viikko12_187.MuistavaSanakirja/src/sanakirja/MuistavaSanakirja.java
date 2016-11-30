package sanakirja;

import java.io.*;
import java.util.*;

public class MuistavaSanakirja {

    private Map<String, String> sanat;
    private File tiedosto;

    public MuistavaSanakirja() {
        this.sanat = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = new File(tiedosto);
    }

    public boolean lataa() {
        try (Scanner tiedostonLukija = new Scanner(this.tiedosto)) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                this.sanat.put(osat[0], osat[1]);
            }
            tiedostonLukija.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void lisaa(String sana, String kaannos) {
        if (!this.sanat.containsKey(sana)) {
            this.sanat.put(sana, kaannos);
        }
    }

    public String kaanna(String sana) {
        if (sanat.containsKey(sana)) {
            return sanat.get(sana);
        }
        for (String kaannos : this.sanat.keySet()) {
            if (sana.equals(this.sanat.get(kaannos))) {
                return kaannos;
            }
        }
        return null;
    }

    public boolean tallenna() {

        try (FileWriter kirjoittaja = new FileWriter(this.tiedosto)) {
            for (String sana : this.sanat.keySet()) {
                kirjoittaja.write(sana + ":" + this.sanat.get(sana) + "\n");
            }
            kirjoittaja.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void poista(String sana) {
        String kaannos = kaanna(sana);
        this.sanat.remove(sana);
        this.sanat.remove(kaannos);
    }
}
