import java.util.Scanner;

public class compressrecurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        
        if (s.isEmpty()) return;

        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (count >= k) {
                    System.out.print("" + s.charAt(i) + count);
                } else {
                    
                    for (int j = 0; j < count; j++) {
                        System.out.print(s.charAt(i));
                    }
                }
                count = 1; 
            } else {
                count++;
            }
        }
        System.out.println();
    }
}