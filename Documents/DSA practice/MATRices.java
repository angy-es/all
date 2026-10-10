import java.util.Scanner;
import java.util.Collections;
public class MATRices{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
    
        while(n-->0){
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                    
                }
            }
            int temp=0;

            for(int i=0;i<n/2;i++){
                for(int j=0;j<k;j++){
                    temp=arr[i][m-k+1];
                    arr[i][m-k+1]=arr[n-i-1][j];
                    arr[n-i-1][j]=temp;
                }


                
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}