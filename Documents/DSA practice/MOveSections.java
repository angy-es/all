import java.util.Scanner;
public class MOveSections{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String x="";
        String y="";
        for(int i=0;i<s.length();i++){
            int index=i+1;

            if(index %4==0||index %6==0){
                 x+=s.charAt(i);
            }
        
            else{
                y+=s.charAt(i);          }
        }
        String last=y+x;
        System.out.println(last);
    }
}