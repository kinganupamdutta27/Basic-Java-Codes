public class factoroalOfNum {
    public static int PrintFactorial(int num){
        if(num == 1){
            return 1;
        }
        if (num == 0){
            return 1;
        }
        return num * PrintFactorial(num-1);

    }
    public static void main(String[] args) {
        System.out.println(PrintFactorial(5));
    }
}
