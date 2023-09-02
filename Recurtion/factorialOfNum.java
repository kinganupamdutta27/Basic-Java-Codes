public class factorialOfNum {
    public static int factOfN(int num, int index, int fact){
        if(num == index) return fact*num;
        if(num == 0 || num ==1) return 1;
        return factOfN(num, index+1, fact*index);
    }
    public static void main(String[] args) {
        System.out.println(factOfN(5, 1, 1));
    }
}
