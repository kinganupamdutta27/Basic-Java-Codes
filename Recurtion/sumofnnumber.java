public class sumofnnumber {
    public static int sumofN(int n,int i,int sum){
        if(i==n){
            return sum+n;
        }
        /*sum += i;
        return sumofN(n, i+1, sum); */ //True
        return sumofN(n, i+1, sum+i);   //Also True
        
    }
    public static void main(String[] args) {
        System.out.println(sumofN(5, 1, 0));
    }
}
