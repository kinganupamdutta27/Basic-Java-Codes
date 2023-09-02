public class printAccendingNumber {
    public static void main(String[] args) {
    printAcendNum(5,1);
    }
    public static void printAcendNum(int n, int i){
        if(n==i){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printAcendNum(n,i+1);
    }
}
class newClassExample{
    public void printAcendNumMethod(int n, int i){
        if(n==i){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printAcendNumMethod(n,i+1);
    }
}
