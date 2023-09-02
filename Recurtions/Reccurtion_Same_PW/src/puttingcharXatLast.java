public class puttingcharXatLast {
    public static void main(String[] args) {
        System.out.println(XmoverToLast("axax",0,"",""));
        System.out.println(Xmover("axaxa",0,"",0));
    }
    public static String XmoverToLast(String Str, int index, String NewString, String countX){
         if(Str.length() == index){
            return NewString + countX;
         }

        if(Str.charAt(index)=='x'){
            countX+=Str.charAt(index);
        }else
        {
            NewString+=Str.charAt(index);
        }
        return XmoverToLast(Str,index+1,NewString,countX);
    }
    public static String Xmover(String Str, int Index, String newStr, int countX){

        if(Str.length()-1==Index){
            if(Str.charAt(Index)=='X' || Str.charAt(Index)=='x'){
                countX += 1;
            }else{
                newStr += Str.charAt(Index);
            }

            for(int i=0;i<countX;i++){
                newStr = newStr+'X';
            }
            //System.out.println(newStr);
            return newStr;

        }

         if(Str.charAt(Index)=='X' || Str.charAt(Index)=='x'){
             countX += 1;
         }else{
             newStr += Str.charAt(Index);
         }
         return Xmover(Str,Index+1,newStr,countX);
    }
}
