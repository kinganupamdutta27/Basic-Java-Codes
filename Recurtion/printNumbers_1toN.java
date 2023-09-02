public class printNumbers_1toN {

    public static void printNumbersAssending(int n, int i){
        if(i==n){
             System.out.println(i);
            return;
        }
        System.out.println(i);
        printNumbersAssending(n, i+1);
    }
    public static void main(String[] args) {
        printNumbersAssending(10, 1);
    }
}
