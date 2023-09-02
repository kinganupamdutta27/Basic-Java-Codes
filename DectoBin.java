import java.util.Scanner;

public class DectoBin{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Value:\t");
        int X = Sc.nextInt();
        int X1=X;
        /*Also Gives Right Answer But not Proper Technic */
        int rem;
        int ans=0;
        while(X!=0){
            rem=X%2;
            ans = (10*ans)+rem;
            X=X/2;
        }
        System.out.println(ans);

        ans=0;
        while(X1!=0){
            if((X1&1)!=0){
                ans = (10*ans)+1;
            }else{
                ans = (10*ans)+0;
            }
            X1=X1>>1;
        }
        System.out.println(ans);
    }
}