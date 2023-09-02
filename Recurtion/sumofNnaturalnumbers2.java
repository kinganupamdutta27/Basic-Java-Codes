public class sumofNnaturalnumbers2 {
    public static void PrintNum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        PrintNum(n-1,sum);
    }
    public static void main(String[] args) {
        PrintNum(5, 0);
    }
}
