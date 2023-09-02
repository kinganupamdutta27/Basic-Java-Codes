public class permulationOfSequence{


    public static void main(String[] args) {
        Sequence("abc", "");
    }
    public static void Sequence(String Str, String NewStr){
        if(Str.length()==0){
            System.out.println(NewStr);
            return;
        }
        for(int i =0 ;i<Str.length();i++){
            char currentChar = Str.charAt(i);
            String newmainStr = Str.substring(0, i)+Str.substring(i+1);
            Sequence(newmainStr, NewStr+currentChar);
        }


    }

}