import java.util.Scanner;

public class kchunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i += 2 * k) {

            // First k characters
            int l= s.substring(i , k);
            String m = s.substring(i+k, k);

            // Reverse first k characters
            StringBuilder sb = new StringBuilder(m);
            sb.reverse();

            ans.append(sb);
//
            // Next k characters remai
            // mn unchanged
            int p= Math.min(i + 2 * k, n);
            if (l < p) {
                ans.append(s.substring(l, p));
            }
        }

        System.out.println(ans);
    }
}