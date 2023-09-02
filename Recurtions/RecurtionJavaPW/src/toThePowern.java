import java.util.Scanner;

public class toThePowern {
    public static void main(String[] args) {
        System.out.println("First Provide Base the Provide Power");
        Scanner Sc = new Scanner(System.in);
        int base = Sc.nextInt();
        int pow = Sc.nextInt();
        System.out.println("Result:\t"+toThePowN(base,pow));
        System.out.println("Result:\t"+toThePowN_log2n(base,pow));
    }
    public static int toThePowN(int X, int n){
        if(n==0){
            return 1;
        }

        return X*toThePowN(X,n-1);
    }
    //reduce stack height to login for optimize memory use as moré stack height mean more storage will consume
    public static int toThePowN_log2n(int X, int n){
        if(n==0){
            return 1;
        }
    if(n%2==0){
        return toThePowN(X,n/2)*toThePowN(X,n/2);
    }else {
        return toThePowN(X,n/2)*toThePowN(X,n/2) * X;
    }

    }
}
