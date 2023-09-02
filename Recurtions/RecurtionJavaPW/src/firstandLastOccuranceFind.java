public class firstandLastOccuranceFind {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        occ("sasdanupam", 0, 5, 'a');
    }

    public static void occ(String S, int i, int Size, char a) {
        if(i==Size){
            if(S.charAt(i)==a){
                if(first==-1){
                    first=i;
                }else{
                    last=i;
                }
            }
            System.out.println("First Occurance:\t"+first+"\tLast Occurance\t"+last);
            return;
        }
        if(S.charAt(i)==a){
            if(first==-1){
                first=i;
            }else{
                last=i;
            }
        }

        occ(S, i + 1, Size, a);
    }
}
