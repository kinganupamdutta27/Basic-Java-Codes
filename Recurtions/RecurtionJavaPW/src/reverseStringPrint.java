public class reverseStringPrint {
    public static void main(String[] args) {
        String s = "Anupam";
        int size = s.length();
        System.out.println(reverse(s,size-1,""));
    }
    public static String reverse(String a, int size, String newS){
        if(size==0){
            newS+=a.charAt(size);
            return newS;
        }

        newS+=a.charAt(size);
        return reverse(a,size-1,newS);
    }
}

