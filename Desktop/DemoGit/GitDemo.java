package demoGit;
import java.util.*;

public class GitDemo {
    public static String changer(String name) {
        StringBuilder sb = new StringBuilder();
        for(int i = name.length() - 1; i >= 0; i--) {
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print(changer(scan.nextLine()));
    }
}
