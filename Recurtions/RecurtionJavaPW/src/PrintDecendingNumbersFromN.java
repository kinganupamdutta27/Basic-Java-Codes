public class PrintDecendingNumbersFromN {
    public static void main(String[] args) {
    decendindNumPrintRec(30000);
    }
    public static void decendindNumPrintRec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decendindNumPrintRec(n-1);
    }
}
