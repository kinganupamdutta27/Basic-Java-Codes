import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        //Space R jono Hobe
        for(int j=0;j<=n-i;j++){
                System.out.print(' ');
        }//Print Number
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    }
}
