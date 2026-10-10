import java.util.Scanner;

public class NaniHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        // sort of an array
        



        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum <= 5000) {
                
                count++;
            } else {
                break;
            }
        }

      
            System.out.println(count);
        
        
    }
}