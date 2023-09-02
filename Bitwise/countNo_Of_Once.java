import java.util.Scanner;

public class countNo_Of_Once {
    public static void main(String[] args) {
        int num; 
        int count=0;
        Scanner Sc = new Scanner(System.in);
        num = Sc.nextInt();
        while(num!=0){
            
            if((num & 1)==1){
                    count++;
            }
            num=num>>1;
        }
        System.out.println("Number of 1 Bits:\t"+count);
    }
}
