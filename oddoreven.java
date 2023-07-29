import java.util.Scanner;

public class oddoreven{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number = sc.nextInt();
        findoddoreven(number);
    }
    public static void findoddoreven(int num){
        
            if(num%2==0){
                System.out.println(num+" it is Even");
            }else{
                System.out.println(num+" it is ODD");
            }
        }
}