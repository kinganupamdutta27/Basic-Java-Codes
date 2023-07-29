import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        System.out.println("Enter a Number for Limit to Fib:\t");
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        funFib(X);
    }
    
    public static void funFib(int num){
        int a = 0;
        int b = 1;
        int sum=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=num;i++){
            sum = a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
