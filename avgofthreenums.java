import java.util.Scanner;

public class avgofthreenums {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number1 = sc.nextInt();
        System.out.println("Enter a number:\n");
        int number2 = sc.nextInt();
        System.out.println("Enter a number:\n");
        int number3 = sc.nextInt();
        System.out.println(functionAvgOfThreenums(number1, number2, number3));
    }
    public static int functionAvgOfThreenums(int number1,int number2,int number3){
        return ((number1+number2+number3)/3);
    }
}
