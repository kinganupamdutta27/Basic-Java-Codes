import java.util.Scanner;

public class triangel_num_pattern_v2 {
    public static void main(String[] args) {
     int n;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Some Value\t");
    n=sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
