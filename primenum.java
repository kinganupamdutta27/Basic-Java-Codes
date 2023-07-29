import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        System.out.println("Enter a value:\t");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<=x;i++){
            if(i%2==0){
                System.out.println(i+" Number is Even\n");
            }
        }
    }
    
}
