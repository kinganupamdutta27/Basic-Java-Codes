import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        System.out.println("Enter A Base number:\t");
        Scanner sc = new Scanner(System.in);
        int XC = sc.nextInt();
        System.out.println("Enter A Power number:\t");
        int XP = sc.nextInt();
        System.out.println(funPower(XC, XP));
    }
  
    public static int funPower(int base, int power){
        int res=1;
        for(int i=1;i<=power;i++){
            res=res*base;
        }
        return res;
    }
}
