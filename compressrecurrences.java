import java.util.Scanner;
public class compressrecurrences{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int c=1;
        
        for(int i=0;i<s.length();i++){
            
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                if(c>=k){
                    System.out.println(""+s.charAt(i)+c);
                }
                else{
                    
                for(int j=0;j<c;j++){
                    System.out.println(s.charAt(i));
                }
            }}
            else{
                c++;
            }
        }
        System.out.println("");

    }
}