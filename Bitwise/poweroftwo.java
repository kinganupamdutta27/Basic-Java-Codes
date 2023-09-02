import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        if(PowerOftwo(x)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        

    }
    public static boolean PowerOftwo(int x){
        int count=0;
        int res=0;
        while(x!=0){
            if ((x & 1)!=0) {
                res = (int) (res + Math.pow(2, count));
            }
            count++;
            x=x>>1;
            
        }
        int i =1;
        while (i<=res) {
        
            if(res==i){
                return true;
            }
            i=i*2;
        }
        return false;
    }
}
