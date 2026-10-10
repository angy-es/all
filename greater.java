import java.util.Scanner;

public class greater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {

                int ans = -1;

                for (int j = i + 1; j < n; j++) {

                    if (arr[i] < arr[j]) {
                        ans = arr[j];
                        break;
                    }
                }

                System.out.print(ans + " ");
            }

            System.out.println();
        }
    }
}