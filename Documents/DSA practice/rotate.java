import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        int n = s.length();

        k = k % n;

        //String m = s.substring(k) + s.substring(0, k);
        String m = s.substring(n-k) + s.substring(0, n-k);

        System.out.println(m);
    }
}