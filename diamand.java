import java.util.Scanner;

public class diamand {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
    //First Half
    for(int i=1;i<=n;i++){
        //Printning Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        //Printng Stars
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        //Printing Right Stars
        for(int j=2;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
        
    }
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
            //Printning Space
            System.out.print("  ");
        }
        //Printng Stars
            for(int j=1;j<=i;j++){
            System.out.print("* ");
            }
        //Printing Right Stars
            for(int j=2;j<=i;j++){
            System.out.print("* ");
     }
        System.out.println();
    }
    
    //Another Process by x*i-1
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("   ");
        }
        for(int j=1;j<=i*2-1;j++){
            System.out.print(" * ");
        }
        System.out.println();    
    }
    for(int i=n;i>0;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print("   ");
        }
        for(int j=1;j<=i*2-1;j++){
            System.out.print(" * ");
        }
        System.out.println();    
    }
    }
    }
