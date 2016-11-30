package laatikot;

import java.util.*;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksPaino;
    private List<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int paino) {
        this.tavarat = new ArrayList<>();
        this.maksPaino = paino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (tavara.getPaino() + painoNyt() <= maksPaino) {
            this.tavarat.add(tavara);
        }   
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        boolean onko = false;
        for (Tavara t : tavarat) {
            if (t.equals(tavara)) {
                onko = true;
            }
        }
        return onko;
    }

    private int painoNyt() {
        int paino = 0;
        for (Tavara tavara : tavarat) {
            paino += tavara.getPaino();
        }
        return paino;
    }
}
