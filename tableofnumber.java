import java.util.Scanner;

public class tableofnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number = sc.nextInt();
        System.out.println("Please Enter The Upto what Number :\t");
        int limit = sc.nextInt();
        tableOfNumber(number, limit);
    }
    public static void tableOfNumber(int num, int limit){
        for(int i=1;i<=limit;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }

    }
}
