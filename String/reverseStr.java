import java.lang.reflect.Array;
import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:\t:");
        String str = Sc.nextLine();
        char[] chr = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            chr[i]=str.charAt(i);
        }
        
        for(int i=0;i<(str.length()/2);i++){
            char temp = chr[i];
            chr[i]=chr[str.length()-(i+1)];
            chr[str.length()-(i+1)] = temp;
        } 
        String newSR = String.valueOf(chr);
        System.out.println(newSR);
    }
}
