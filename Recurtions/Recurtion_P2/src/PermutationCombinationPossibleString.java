public class PermutationCombinationPossibleString {
    public static void main(String[] args) {
        perCombStr("abc","");
    }
    public static void perCombStr(String Str, String Combination){

        if(Str.length()==0){
            System.out.println(Combination);
            return;
        }

        for (int i = 0; i < Str.length(); i++) {
            char currentChar = Str.charAt(i);
            String NewStr = Str.substring(0,i) + Str.substring(i+1);
            perCombStr(NewStr, Combination+currentChar);
        }
    }
}
