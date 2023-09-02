public class XtoThePowerN {
    public static void main(String[] args) {
        System.out.println(PowerCal(2,4));
        System.out.println(PowerCal_LogN(2,4));
    }
    public static int PowerCal(int X, int N){
        if(N==0){
            return 1;
        }
        return X * PowerCal(X,N-1);
    }
    public static int PowerCal_LogN(int X, int N){
        if(N==0){
            return 1;
        }
        if(N%2==0){
            return PowerCal_LogN(X,N/2) * PowerCal_LogN(X,N/2);
        }else{
            return PowerCal_LogN(X,N/2) * PowerCal_LogN(X,N/2) * X;
        }

    }
}
