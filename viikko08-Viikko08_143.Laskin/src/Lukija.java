import java.util.*;

public class Lukija {
    private Scanner lukija = new Scanner(System.in);
    
    public String lueMerkkijono() {
        return lukija.nextLine();
    }
    
    public int lueKokonaisluku() {
        return Integer.parseInt(lukija.nextLine());
    }

}
