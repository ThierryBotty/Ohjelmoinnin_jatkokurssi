
public class Asevelvollinen implements Palvelusvelvollinen {
    private int tj;

    public Asevelvollinen(int tj) {
        this.tj = tj;
    }
    
    @Override
    public int getTJ() {
        return this.tj;
    }

    @Override
    public void palvele() {
        this.tj -= 1;
        if (tj < 0) {
            tj = 0;
        }
    }

}
