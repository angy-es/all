import java.util.Scanner;

public class Jumpingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            int n = i;
            boolean jumping = true;

            while (n >= 10) {
                int digit1 = n % 10;
                int digit2 = (n / 10) % 10;

                if (Math.abs(digit1 - digit2) != 1) {
                    jumping = false;
                    break;
                }

                n = n / 10;
            }

            if (jumping) {
                System.out.println(i);
            }
        }
    }
}