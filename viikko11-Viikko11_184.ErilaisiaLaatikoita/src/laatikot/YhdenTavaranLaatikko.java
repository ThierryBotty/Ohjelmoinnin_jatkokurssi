package laatikot;

public class YhdenTavaranLaatikko extends Laatikko {

    private Tavara tavara;

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavara == null) {
            this.tavara = tavara;
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.tavara == null) {
            return false;
        } 
        return this.tavara.equals(tavara);
    }
}
