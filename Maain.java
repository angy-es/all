import java.util.Scanner;
public class Maain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fuel = n/b;
        int petrol = n/a;
        if(fuel * y > petrol * x){
            System.out.println("PETROL");
        }
        else if(fuel * y < petrol * x){
            System.out.println("DIESEL");
        }
        else{
            System.out.println("ANY");
        }

    }
}
}