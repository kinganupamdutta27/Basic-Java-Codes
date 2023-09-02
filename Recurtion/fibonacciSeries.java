public class fibonacciSeries {
    public static void fibonacciSeriesPrint(int a , int b , int sum, int num){
        if(num == 0){
            return;
        }
        sum = a + b;
        System.out.print(sum+" ");
        a = b;
        b = sum;
        fibonacciSeriesPrint(a, b, sum, num-1);
    }
    public static void fib(int a, int b, int sum, int limit){
        if(limit == 0){
            System.out.print(sum+" ");
            return;
        }
        System.out.print(sum+" ");
        fib(a=b,b=sum,sum=a+b,limit-1);
    }
    public static void main(String[] args) {
        System.out.print(0+" "+1+" ");
        fibonacciSeriesPrint(0,1,0,13-2);
        fib(0,1,0,13-2);
    }
    
}
