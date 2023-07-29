import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
    int n;
    int[][] xa = new int[10][10];
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
        //Populating 1
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //Populating all 1's
        for(int j=1;j<=i;j++){
            if(i==j || j==1){
                xa[i][j] = 1;
                System.out.print(xa[i][j]+" ");
            }else{
                //Populating Others
                 xa[i][j] =  xa[i-1][j-1] +  xa[i-1][j];
                 System.out.print(xa[i][j]+" ");
            }
        }
        System.out.println();
    }
}
}
