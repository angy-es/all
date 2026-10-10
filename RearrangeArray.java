import java.util.Scanner;
public class RearrangeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Rearranged array:");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i/2]+" ");
            }
            else{
                System.out.print(arr[n-1-i/2]+" ");
            }
            
        }
        
}

}