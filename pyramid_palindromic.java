import java.util.Scanner;

public class pyramid_palindromic {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();

    for(int i=1;i<=n;i++){
        //First Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        //Second Num Print
        for(int j=i;j>0;j--){
            System.out.print(j+" ");
        }
        //Therd num print
        for(int j=2;j<=i;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}
