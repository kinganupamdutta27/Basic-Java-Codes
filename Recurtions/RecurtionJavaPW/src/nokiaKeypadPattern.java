import java.util.Scanner;

public class nokiaKeypadPattern {
    public static String[] keypad = new String[]{".","abc","def","ghi","jkl","mno","qprs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Put Num:");
        String B1 = Sc.next();
        keyCombination(B1,0,"");

    }
    public static void keyCombination(String ipc, int index, String new1){

        if(ipc.length()==index){
            System.out.println(new1);
            return;
        }

        char currentChar = ipc.charAt(index);
        String currentString = keypad[currentChar-'0'];

        for(int i = 0 ; i<currentString.length();i++){
            keyCombination(ipc,index+1, new1+currentString.charAt(i));
        }

       // keyCombination(Str1, Str2, index+1, new1 );
    }

}
