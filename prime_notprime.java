import java.util.Scanner;

public class prime_notprime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=2;
        boolean TF = true;
        System.out.println("Enter a value:\n");
        int x = sc.nextInt();
        while(i<x){
            if(x%i==0){
                TF=false;
                break;
            }
        i++;
        }
        if(TF==true){
            System.out.println("number is Prime");
        }else{
             System.out.println("number is not Prime");
        }
    }
}
