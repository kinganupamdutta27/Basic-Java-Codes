import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesinString {
    public static boolean[] EncounterdCharacters = new boolean[26];
    public static String removDuplicate="";


    public static void main(String[] args) {
    Arrays.fill(EncounterdCharacters, false);
    String S = "assdddfffggttrreewwqqaassxxccvvbbnmmkkjjuuytrrwsdfgbvc";
        System.out.println(removeDuplicate(S,0));

    }
    public static String removeDuplicate(String Str, int index){

        if(Str.length()-1==index){
            if(EncounterdCharacters[Str.charAt(index)-'a']){

            }else{
                EncounterdCharacters[Str.charAt(index)-'a'] = true;
            }
            for(int i=0;i<26;i++){
                if(EncounterdCharacters[i]){
                    char s = (char) ('a'+ i);
                    removDuplicate+=s;
                }
            }
            //System.out.println(removDuplicate);
            return removDuplicate;
        }

        if(EncounterdCharacters[Str.charAt(index)-'a']){

        }else{
            EncounterdCharacters[Str.charAt(index)-'a'] = true;
        }

        return removeDuplicate(Str,index+1);
    }

}
