import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of N: ");
        int N=sc.nextInt();
        int[]arr=new int[N-1];
        System.out.print("the elements of arrays are: ");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int sum_of_N_natural_no=N*(N+1)/2;
        int ans=sum_of_N_natural_no-sum;
        System.out.println("The missing number is: "+ans);
    }
    
}
