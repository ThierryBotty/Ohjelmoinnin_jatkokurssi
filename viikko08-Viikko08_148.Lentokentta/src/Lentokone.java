import java.util.*;

public class Lentokone {
    private String tunnus;
    private int kapasiteetti;
    private ArrayList<String> reitit;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
        this.reitit = new ArrayList<>();
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setReitit(String reitit) {
        this.reitit.add(reitit);
    }
    
    public ArrayList<String> getReitit() {
        return reitit;
    }

    @Override
    public String toString() {
        return (this.tunnus + " (" + this.kapasiteetti + " henkilöä)");
    }
}