public class fibonaciPrint {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        fibPrint(a,b,0,10);
    }
    public static void fibPrint(int a, int b, int sum, int n){
        if(n==0){
            return;
        }
        sum = a+b;
        a = b;
        b = sum;
        System.out.print(" "+sum+" ");
        fibPrint(a,b,sum,n-1);
    }
}
