public class factorialOfNumber2 {

    public static void factorial(int n, int i, int fact) {
        if(i==n){
            fact*=i;
            System.out.println(fact);
            return;
        }

        fact *= i;
        factorial(n, i+1, fact);
      
    }
    public static void main(String[] args) {
       factorial(5, 1,1);
    }
}
