import java.util.Scanner;
public class ques1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            String s=sc.next();
            String g=sc.next();
            String ans="";
            for(int i=0;i<5;i++){
                if(s.charAt(i)==g.charAt(i)){
                    ans+="G";
                }
                else{
                    ans+="B";
                }
            }
            System.out.println(ans);
    }
}


