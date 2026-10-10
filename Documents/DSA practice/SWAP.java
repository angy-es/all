import java.util.Scanner;
import java.util.Collections;
public class SWAP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
            for(int j=0;j<n;j=j+2*k){
                for(int m=0;m<k;m++){
                    Collections.swap(java.util.Arrays.asList(arr), j+m, j+m+k);
                }
            }
            System.out.println(arr[i]+" ");
                
                


             }
             
            
        }
         

    }