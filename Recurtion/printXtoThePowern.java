public class printXtoThePowern {
    public static int powerofn(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        
        return x* powerofn(x, n-1);

    }
    public static int powerofnt(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n even
        if(n%2==0){
        return powerofnt(x, n/2)* powerofnt(x, n/2);
        }else{
            return powerofnt(x, n/2)* powerofnt(x, n/2)*x;
        }

    }
    public static void main(String[] args) {
        System.out.println(powerofn(2, 5));
        System.out.println(powerofnt(2, 5));
    }
}
