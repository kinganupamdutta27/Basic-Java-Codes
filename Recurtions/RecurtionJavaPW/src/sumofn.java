public class sumofn {
    public static void main(String[] args) {
        System.out.println(sumN(5));
        System.out.println(sumN_2(5,0));
        System.out.println(sumN_new(5,0,0));
    }
    public static int sumN(int n){
        if(n==0){
            return n;
        }
        return n+sumN(n-1);
    }
    public static int sumN_2(int n, int i){
        if(i==n){
            return i;
        }

        return i+sumN_2(n,i+1);
    }
    public static int sumN_new(int n, int i, int sum){
        if(i==n){
            return i;
        }

        return sum+sumN_new(n,i+1,sum+i);
    }
}
