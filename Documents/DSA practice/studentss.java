import java.util.*;
public class studentss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int idx = s.charAt(i) - 'a';
            if (arr[idx] == -1) {
                ans[i] = -1;
            } else {
                ans[i] = arr[idx] - i - 1;
            }
            arr[idx] = i;
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}