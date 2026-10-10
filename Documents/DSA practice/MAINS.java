import java.util.*;
public class MAINS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        for(int i=0;i<n1;i++){
            //count of character in string
            char ch=s1.charAt(i);
            for(int j=0;j<n2;i++){
                char cha=s2.charAt(j);
                if(ch==cha){
                    count+=i;
                }
    
            }
             System.out.println(count);

        }
    }
}