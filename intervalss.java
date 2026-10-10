import java.util.Scanner;
public class intervalss{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = sc.nextInt();
        int m = s1.length();
        int[] arr=new int[m];
        String ans=" ";
        for(int i=0;i<m;i++){
            if((i+1)%n==0&&i>0){
                ans+=s1.charAt(i);
                ans+=s2;
            }
            else{
                ans+=s1.charAt(i);
            }
        }
        System.out.println(ans);
        

        // put str2 after n 
        
        












        
    }
}