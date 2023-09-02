import java.util.HashSet;

public class ProbableSubStrings {
    public static void main(String[] args) {
    choiceStr("abc",0,"");
    HashSet<String> collection = new HashSet<>();
    combinationCharacter("aaa",0,"",collection);
    }
    public static void choiceStr(String a, int index,String sew1){
        if(a.length()==index){
            System.out.println(sew1);

            return;
        }
        char currentChar = a.charAt(index);
        //to be
        choiceStr(a, index+1,sew1+currentChar);
        //not to be
        choiceStr(a, index+1,sew1);
    }
    public static void combinationCharacter(String Str, int index , String newStr, HashSet<String> set){
        if(Str.length()==index){
            if(set.contains(newStr)){
                return;
            }else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }


        }

        char n = Str.charAt(index);
        combinationCharacter(Str,index+1,newStr,set);
        combinationCharacter(Str,index+1,newStr+n, set);
    }
}
