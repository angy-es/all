import java.util.Scanner;
public class StringPallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String m=s;
       for(int i=0;i<n;i++){
        m+=s.charAt(i);
       }
       if(s.equals(m)){
        System.out.println("pallindrome");
       }
       else{
        System.out.println("not pallindrome");
       }
    }
}