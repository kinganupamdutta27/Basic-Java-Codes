import java.util.Scanner;

public class inverted_rightangle_triangale {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();

    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    //Another Process
     System.out.println();
     for(int i=n;i>=0;i--){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }

}
