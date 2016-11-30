
import java.util.*;

public class Tekoaly {

    private Map<Integer, List<Integer>> hattu;
    private Random random;
    private Map<Integer, Integer> poyta;

    public Tekoaly(int tikkujenMaara) {
        this.hattu = new HashMap<>();
        this.random = new Random();
        this.poyta = new HashMap<>();
        luoToimivaMappi(tikkujenMaara);
    }

    private void luoToimivaMappi(int tikkujenMaara) {

        for (int i = 1; i <= tikkujenMaara; i++) {
            List<Integer> lista = new ArrayList<>();
            lista.add(1);
            lista.add(2);
            lista.add(3);
            hattu.put(i, lista);
        }
    }

    public int nostaTikkua(int tikkujenMaara) {
        int arvo = hattu.get(tikkujenMaara).get(random.nextInt(hattu.get(tikkujenMaara).size()));
        poyta.put(tikkujenMaara, arvo);
        hattu.get(tikkujenMaara).remove(Integer.valueOf(arvo));
        return arvo;
    }

    public void siirraVoitonTiedotMappiin() {
        for (int tikkujenMaara : poyta.keySet()) {
            int luku = poyta.get(tikkujenMaara);

            hattu.get(tikkujenMaara).add(luku);
            hattu.get(tikkujenMaara).add(luku);
        }
        poyta.clear();
    }

    public void tyhjennaTiedot() {
        for (int luku : poyta.keySet()) {
            int arvo = poyta.get(luku);
            if (!hattu.get(luku).contains(arvo)) {
                hattu.get(luku).add(arvo);
            }
        }
        poyta.clear();
    }

    public int nostaTikkuaSatunnaisesti(int tikkujenMaara) {
        return random.nextInt(3) + 1;
    }
}
