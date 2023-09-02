import java.sql.SQLOutput;

public class PrintInReverse {
    public static void main(String[] args) {
        System.out.println(Rev("abc",2,""));
        Rev2("abc",2);
    }
    public static String Rev(String Str, int Index, String Str2){
        if(Index==0){
            char current = Str.charAt(Index);
            return Str2+current;
        }
        return Rev(Str,Index-1,Str2+Str.charAt(Index));
    }
    public static void Rev2(String str, int inx){

        if(inx==0){
            System.out.print(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        Rev2(str,inx-1);
    }
}
