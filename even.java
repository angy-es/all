import java.util.Scanner;
public class even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int c=0;
        while(n>0){
            int m=sc.nextInt();
           
            if(m%2==0){
                count++;
            }
            else if(m%2!=0){
                c++;
            }}
            if(count > c){
                System.out.println("Even");
            }
            else if(c > count){
                System.out.println("Odd");
            }
            else{
                System.out.println("tie");
            }

        
    }
}