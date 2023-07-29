import java.util.Scanner;

public class grater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(funGraterNum(X, Y));
    }
    
    public static int funGraterNum(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
}
