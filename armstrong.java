import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean found = false;

        for (int i = x; i <= y; i++) {
            int s = i;
            int temp = i;
            int digits = String.valueOf(i).length();
            double sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp = temp / 10;
            }

            if (s == sum) {
                System.out.println(s);
                found = true;
            }

            
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
