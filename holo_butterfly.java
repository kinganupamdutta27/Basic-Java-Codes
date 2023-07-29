import java.util.Scanner;

public class holo_butterfly {
    public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        //Star
        for(int j=1;j<=i;j++){
            if(i==j || j==1 || i==1)
            {
                System.out.print("* ");
            }else{
                System.out.print("  ");
            } 
        }
        //Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
         //Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }

        for(int j=1;j<=i;j++){
             if(i==j || j==1 || i==1){
                System.out.print(" *");
             }else{
                System.out.print("  ");
             } 
        }
        System.out.println();
    }
    for(int i=n;i>0;i--){
        //Star
        for(int j=1;j<=i;j++){
            if(i==j || j==1 || i==1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        //Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
         //Space
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            if(i==j || j ==1){
                System.out.print(" *");
            }else{
                 System.out.print("  ");
            }
           
        }
        System.out.println();
    }
    

}

}
