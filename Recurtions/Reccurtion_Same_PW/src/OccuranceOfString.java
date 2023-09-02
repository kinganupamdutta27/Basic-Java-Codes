import java.util.HashSet;

public class OccuranceOfString {
    public static int F=-1;
    public static int L=-1;
    public static void main(String[] args) {
        Occ("szxsawedaaa",0,'a');
    }
    public static void Occ(String Str, int inx, char ele){
        if(inx==Str.length()-1){
            if(Str.charAt(inx)== ele){
                if(F==-1){
                    F=inx;
                }else {
                    L=inx;
                }
            }
            if(L==-1){
                L=F;
            }
            System.out.println("First Occurance = "+F+" Last Occurace = "+L);
            return;
        }
        if(Str.charAt(inx)== ele){

            if(F==-1){
                F=inx;
            }else {
                L=inx;
            }
        }
        Occ(Str, inx+1,ele);

    }
}
