
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
//         tulostaHymioityna("Metodi");
//         tulostaHymioityna("Hajautustaulu");
//         tulostaHymioityna("Rajapinta");
    }
    
    private static void tulostaHymioityna(String merkkijono) {
        
        if (merkkijono.length() % 2 == 1) {
            merkkijono += " "; 
        }
        
        int pituus = merkkijono.length();
        tulostaHymioi(pituus / 2 + 3);
        
        System.out.print(":) " + merkkijono + " :)");
        System.out.println();
        
        tulostaHymioi(pituus / 2 + 3);   
    }
    
    private static void tulostaHymioi(int luku) {
        for (int i = 0; i < luku; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
}