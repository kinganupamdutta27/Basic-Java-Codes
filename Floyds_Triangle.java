import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();

    int count=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
    }
}
