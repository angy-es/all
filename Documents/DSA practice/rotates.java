import java.util.Scanner;
public class rotates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        String s=sc.next();
        int k=sc.nextInt();
        if(k>n){
            k=k%n;
        }
        else if(k<n){
           String m = s.substring(k,n-k)+s.substring(0,k);
        }
        else{
            String p = s.substring(k,n-k)+s.substring(0,k);
        }
        
    }
}