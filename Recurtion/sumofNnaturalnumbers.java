public class sumofNnaturalnumbers {
    public static int sumOfNnaturalnumbers2(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfNnaturalnumbers2(n-1);
    }
    public static int sumOfNnaturalnumbers3(int n, int sum){
        if(n==0){
            return sum;
        }
        return  sumOfNnaturalnumbers3(n-1,sum+n);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNnaturalnumbers3(5,0));
          System.out.println(sumOfNnaturalnumbers2(5));
    }
}
