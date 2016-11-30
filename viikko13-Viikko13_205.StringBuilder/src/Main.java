
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(muotoile(t));
    }

    public static String muotoile(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        
        for (int i = 0; i < t.length; i++) {
            sb.append(" ").append(t[i]);
            
            if (i != t.length - 1) {
                sb.append(",");
            } else {
                break;
            }
            if (i % 4 == 0) {
                sb.append("\n");
            }
        }
        
        sb.append("\n}");
        return sb.toString();
    }
}
