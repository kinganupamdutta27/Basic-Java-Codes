import java.util.Scanner;

public class primeornot{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:\n");
        int number = sc.nextInt();
        System.out.println("Number Is Prime: "+findPrimeorNot(number));
    }
    public static boolean findPrimeorNot(int num){
        boolean x=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                x=false;
                break;
            }
        }
        return x;
    }
}