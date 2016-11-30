package varastot;

import java.util.*;

public class Muutoshistoria {

    private List<Double> muutoshistoria;

    public Muutoshistoria() {
        this.muutoshistoria = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        this.muutoshistoria.add(tilanne);
    }

    public void nollaa() {
        this.muutoshistoria.clear();
    }

    public double maxArvo() {
        return suurinPieninjaKa()[0];
    }

    public double minArvo() {
        return suurinPieninjaKa()[1];
    }
    
    public double keskiarvo() {
        return suurinPieninjaKa()[2];
    }
    
    public double suurinMuutos() {
        double muutos = 0;
        for (int i = 0; i < muutoshistoria.size() - 1; i++) {
            double osaMuutos = Math.abs(muutoshistoria.get(i)-(muutoshistoria.get(i+1))); 
            if (osaMuutos > muutos) {
                muutos = osaMuutos;
            }
        }
        return muutos;
    }
    
    public double varianssi() {
        double ka = suurinPieninjaKa()[2];
        double summa = 0;
        
        for (int i = 0; i < muutoshistoria.size(); i++) {
            summa += Math.pow((muutoshistoria.get(i) - ka), 2);
        }
        return summa/(muutoshistoria.size()-1);
    }

    private double[] suurinPieninjaKa() {
        if (this.muutoshistoria.isEmpty()) {
            double[] luvut = {0,0,0};
            return luvut;
        }

        double suurin = 0;
        double pienin = muutoshistoria.get(0);
        double summa = 0;

        for (Double luku : muutoshistoria) {
            if (luku > suurin) {
                suurin = luku;
            }
            if (luku < pienin) {
                pienin = luku;
            }
            summa += luku;
        }
        double[] luvut = {suurin, pienin, (summa / this.muutoshistoria.size())};
        return luvut;
    }

    @Override
    public String toString() {
        return this.muutoshistoria.toString();
    }
}