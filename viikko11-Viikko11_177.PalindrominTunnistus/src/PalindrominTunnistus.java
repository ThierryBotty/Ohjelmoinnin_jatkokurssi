
public class PalindrominTunnistus {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        System.out.println(onPalindromi("a man, a plan, a canal: Panama")); // true
        System.out.println(onPalindromi("not a bird, not a plane, superman!")); // false
        System.out.println(onPalindromi("saippuakauppias")); // true
        System.out.println(onPalindromi("porkkanakauppias")); // false
    }

    public static boolean onPalindromi(String merkkijono) {
        // toteuta metodi tänne
        merkkijono = merkkijono.toLowerCase().replaceAll("\\W", "");
        if (new StringBuilder(merkkijono).reverse().toString().equals(merkkijono)) {
            return true;
        }
        return false;
    }
}
