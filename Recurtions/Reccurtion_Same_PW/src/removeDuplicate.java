import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicate {

    public static boolean[] alp = new boolean[26];
    public static void main(String[] args) {
        HashSet<Character> Set = new HashSet<>();
        Arrays.fill(alp,false);
        dupRemove("aasaas",0);
        dupStrRem("asasdsa",0,Set);
    }
    public static void dupRemove(String Str, int Index){
        if(Str.length()-1==Index){
            char currentChar = Str.charAt(Index);
            if(alp[currentChar-'a']){

            }else{
                alp[currentChar-'a']=true;
            }

            for (int i = 0; i < 26; i++) {
                if(alp[i]){
                    char X = (char) ('a'+i);
                    System.out.print(X);
                }
            }
            return;
        }

        char currentChar = Str.charAt(Index);
        if(alp[currentChar-'a']){

        }else{
            alp[currentChar-'a']=true;
        }
        dupRemove(Str, Index+1);
    }
    //Another Way By HashMap
    public static void dupStrRem(String Str, int Index, HashSet<Character> Set){

        if(Str.length()==Index){
           //Iterator it = Set.iterator();
            System.out.println();
            for(char S : Set){
                System.out.print(S);
            }

            return;
        }

        if(Set.contains(Str.charAt(Index))){

        }else {
            Set.add(Str.charAt(Index));
        }
        dupStrRem(Str,Index+1,Set);
    }

}

