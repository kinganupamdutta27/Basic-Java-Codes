import java.util.BitSet;
import java.util.Scanner;

public class bitoperations{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Number:\t");
        int num = Sc.nextInt();
        System.out.println("Enter The position Number:\t");
        int pos = Sc.nextInt();
        System.out.println("Enter The Choise Number:\t 1. for GET 2. for SET, 3. for Clear, 4. for Toggle");
        int chs = Sc.nextInt();
        switch (chs) {
            case 1:System.out.println(Get(num,pos));   
                break;
            case 2:System.out.println(Set(num, pos));
                break;
            case 3:System.out.println(Clear(num, pos));
                break;
            case 4:System.out.println(Toggel(num, pos));
                break;
            default:
                break;
        }
    
}
   public static int Get(int num, int pos){
    int bistmask = 1<<pos;
    if((num & bistmask) != 0){
        return 1;
    }else{
         return 0;
    }
   }
   public static int Set(int num, int pos){
    int bitmask = 1<<pos;
    int nwenum=bitmask | num;
    return nwenum;
   }
   public static int Clear(int num,int pos){
    int bitMask = 1<<pos;
    bitMask=~bitMask;
    num=num&bitMask;
    return num;
   }
   public static int Toggel(int num, int pos){
    int BitMask = 1<<pos;
    num=num^BitMask;
    return num;
   }
}