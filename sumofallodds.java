import java.util.Scanner;

public class sumofallodds {
    // Write a function to print the sum of all odd numbers from 1 to n.
    public static void main(String[] args) {
        System.out.println("enter some number:\t");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("The Avg is: \t"+funSumOfOdd(x));
        
    }
    public static int funSumOfOdd(int n){
        int result=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                result+=i;
            }
        }
        return result;
    }
}
