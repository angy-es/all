import java.util.Scanner;

public class PallindromeReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n=s.length();
        int mid=n/2;

        String l = s.substring(0, mid);
        String r= s.substring(mid);

        String reversed = new StringBuilder(l).reverse().toString();
        String msh=new StringBuilder(r).reverse().toString();
        

        String result = reversed+ msh;
        if(result)

        System.out.println(s.equals(result)) ;
    }
}