
public class Sivari implements Palvelusvelvollinen {
    private int tj;
    
    
    public Sivari() {
        this.tj = 362;
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
