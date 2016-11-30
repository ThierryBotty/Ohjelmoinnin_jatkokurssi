package arviot;

import java.util.*;

public class TunteikkaatArviot {

    private Map<String, Integer> sanat;
    private List<String> rivit;

    public TunteikkaatArviot(List<String> rivit) {
        this.sanat = new HashMap();
        siirraSanatMappiin(rivit);
        this.rivit = rivit;
    }

    public int sanojenLukumaara(String sana) {
        if (this.sanat.containsKey(sana)) {
            return this.sanat.get(sana);
        }
        return 0;
    }

    public double sananTunne(String sana) {
        double summa = 0;
        int lukuja = 0;
        for (String rivi : this.rivit) {
            String[] osat = rivi.split(" ");

            for (String osa : osat) {

                osa = osa.toLowerCase();
                if (osa.equalsIgnoreCase(sana)) {
                    summa += Integer.parseInt(osat[0]);
                    lukuja++;
                }
            }
        }
        if (lukuja == 0) {
            return (2.0);
        }
        return (summa / lukuja);
    }

    public String sananTunneMerkkijonona(String sana) {
        if (this.sananTunne(sana) <= 1.9) {
            return "negatiivinen";
            
        } else if (this.sananTunne(sana) <= 2.1) {
            return "neutraali";
            
        } else {
            return "positiivinen";
        }
    }

    public double lauseenTunne(String lause) {
        String[] osat = lause.split(" ");
        
        double summa = 0;
        int lukuja = 0;
        for (String sana : osat) {
            summa += sananTunne(sana);
            lukuja++;
        }
        return summa / lukuja;
    }

    public String lauseenTunneMerkkijonona(String lause) {
        if (this.lauseenTunne(lause) <= 1.9) {
            return "negatiivinen";
            
        } else if (this.lauseenTunne(lause) <= 2.1) {
            return "neutraali";
            
        } else {
            return "positiivinen";
        }
    }

    private void siirraSanatMappiin(List<String> rivit) {
        for (String rivi : rivit) {
            String[] osat = rivi.split(" ");

            for (String sana : osat) {

                sana = sana.toLowerCase();
                if (this.sanat.containsKey(sana)) {
                    this.sanat.put(sana, this.sanat.get(sana) + 1);

                } else {
                    this.sanat.put(sana, 1);
                }
            }
        }
    }
}
