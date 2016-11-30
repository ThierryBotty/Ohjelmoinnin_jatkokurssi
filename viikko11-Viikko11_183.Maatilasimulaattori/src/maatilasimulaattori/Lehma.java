package maatilasimulaattori;

import java.util.*;

public class Lehma implements Lypsava, Eleleva {

    private Random random;
    private String nimi;
    private int tilavuus;
    private double maara;

    public Lehma() {
        this.random = new Random();
        this.tilavuus = 15 + random.nextInt(26);
        this.nimi = NIMIA[random.nextInt(NIMIA.length)];
    }

    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma(String nimi) {
        this.random = new Random();
        this.nimi = nimi;
        this.tilavuus = 15 + random.nextInt(26);
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public String toString() {
        return this.nimi + " " + Math.ceil(this.maara) + "/" + Math.ceil(this.tilavuus);
    }

    @Override
    public double lypsa() {
        double luku = this.maara;
        this.maara = 0;
        return luku;
    }

    @Override
    public void eleleTunti() {
        this.maara += (0.1*(random.nextInt(14) + 7));
        if (this.maara > this.tilavuus) {
            this.maara = this.tilavuus;
        }
    }

}
