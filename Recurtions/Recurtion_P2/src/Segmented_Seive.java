import java.util.ArrayList;
import java.util.List;

public class Segmented_Seive {
    //Notmal Sieve
    public static int N = 1000000;
    public static boolean[] normalSieveArr = new boolean[N + 1];

    public static void nornalSieve() {
        for (int i = 0; i < N + 1; i++) {
            normalSieveArr[i] = true;
        }

        normalSieveArr[0] = normalSieveArr[1] = false;

        for (int i = 0; i < N + 1; i++) {
            if (normalSieveArr[i]) {
                for (int j = 2 * i; j < N + 1; j = j + i) {
                    normalSieveArr[j] = false;
                }
            }
        }
    }
   public static List<Integer> resArr = new ArrayList<>();
    public static List<Integer> findThePrimeTillSQRt(int n) {

        for (int i = 0; i <= n; i++) {
            if(normalSieveArr[i]){
                resArr.add(i);
            }
        }

        return resArr;
    }



    public static void main(String[] args) {
        int L = 110;
        int R = 130;
        nornalSieve();
        findThePrimeTillSQRt((int) Math.sqrt(R));
       /* for (int i = 0; i < 5; i++) {
            System.out.println(resArr.get(i));
        }*/
        //System.out.println(resArr.size());

        boolean[] dummy = new boolean[R-L+1];

        for (int i = 0; i < ((R-L)+1); i++) {
            dummy[i] = true;
        }


        for(int X: resArr){

            int Current = (L/X)*X;
            if (Current<L){
                Current+=X;
            }
            //System.out.println(Current+" "+X);
            for (int i = Math.max(Current, X*X); i <= R; i+=X) {

                dummy[i-L] = false;
            }
        }
       /* for (boolean X:dummy){
            System.out.println(X);
        }*/
        for (int i=L;i<R;i++){
            if(dummy[i-L]){
                System.out.println(i);
            }
        }

    }
}
