public class nokiaMobileButton {
    public static String[] key_arr = new String[]{".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
    combiButton("45",0,"");
    }
    public static void combiButton(String Str,int index, String OutputStr){
        if(Str.length()==index){
            System.out.println(OutputStr);
            return;
        }

        char selectCurrentCaracter = Str.charAt(index);
        int currentCharacter = selectCurrentCaracter - '0';

        String currentButtonString = key_arr[currentCharacter];

        for(int i=0;i<currentButtonString.length();i++){
            char C = currentButtonString.charAt(i);
            combiButton(Str,index+1,OutputStr+C);
        }

    }
}
