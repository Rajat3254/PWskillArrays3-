import java.util.Scanner;
public class Question_1{
    static void difference(int[]arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==x){
                    System.out.println("yes");
                    count++;
                    break;
                }if(count==1){
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements of array: ");
        int n=sc.nextInt();
        System.out.print("the value of x is: ");
        int x=sc.nextInt();
        System.out.print("enter the elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        difference(arr,x);

    }
}