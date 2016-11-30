package maatilasimulaattori;

public class Lypsyrobotti {
    private Maitosailio maitosailio;

    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        try {
            this.maitosailio.lisaaSailioon(lypsava.lypsa());
        } catch (Exception e) {
            throw new IllegalStateException("Maitosäiliötä ei ole asennettu");
        }
    }
}
