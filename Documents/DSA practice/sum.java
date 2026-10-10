import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int sum=0;
            int sum1=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //sorting
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            
            for(int i=n-1;i>=n-5;i--){
                sum+=arr[i];
            }
            System.out.println("Sum of top 5 stud marks: "+sum);
            //sum of bottom 5 stud marks
            for(int i=0;i<5;i++){
                sum1+=arr[i];
            }
            System.out.println("Sum of bottom 5 stud marks: "+sum1);
        }
    }
}