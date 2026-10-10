import java.util.Scanner;
public class removefromselected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        String y = "";
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < r.length(); j++) {
                if (s.charAt(i) == r.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                y += s.charAt(i);
            }
        }
        System.out.println(y);
    }
}
