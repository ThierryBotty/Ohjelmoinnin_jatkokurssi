package laatikot;

public class HukkaavaLaatikko extends Laatikko {

    @Override
    public void lisaa(Tavara tavara) {
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
}
