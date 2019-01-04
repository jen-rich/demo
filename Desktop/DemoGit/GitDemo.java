import java.util.*;

public class GitDemo {
    public static String changer(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        for(int i = name.length(); i > 0; i++) {
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        changer(scan.nextLine());
    }
}
