public class sumofNnaturalnumbes {
    public static void SumOfN(int n, int i, int sum){
        if(n==i){
            System.out.println(i+sum);
            return;
        }
        sum+=i;
        SumOfN(n,i+1,sum);
    }
    public static void main(String[] args) {
        SumOfN(5,1,0);
    }
}
