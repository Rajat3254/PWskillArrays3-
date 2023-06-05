import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of elements in array is: ");
        int n=sc.nextInt();
        int count=0;
        System.out.print("enter vallue of x: ");
        int x=sc.nextInt();
        int[]arr=new int[n];
        System.out.print("elements of arrays are: ");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
            if(arr[i]==x){
                count++;
            }
        }
        System.out.print("The occurence of x in array is: "+count);
        
    }
    
    }

