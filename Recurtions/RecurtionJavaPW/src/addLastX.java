import java.sql.Array;
import java.util.Arrays;

public class addLastX {
    public static boolean[] ind = new boolean[26];
    public static int C = 0;

    public static void main(String[] args) {
        Arrays.fill(ind, false);
        String S = "abcdexfxgxhixjkx";
       putX(S,S.length()-1,0,"");
    }
    public static void putX(String str,int Size, int index, String Str1){
        if(index==Size){
            if(str.charAt(index)!='x'){
                Str1+=str.charAt(index);
            }else{
                C++;
            }
            for(int i=0;i<C;i++){
                Str1+='X';
            }
            System.out.println(Str1);
            return;
        }

        if(str.charAt(index)!='x'){
            Str1+=str.charAt(index);
        }else{
            C++;
        }

        putX(str,Size,index+1,Str1);

    }
}
