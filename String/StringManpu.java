public class StringManpu {
    public static void main(String[] args) {

        String S = "asdcasdxfcvasw";
       
        for (int i = 0; i < S.length(); i++) {
            
            int count =1;
            for (int j = i+1; j < S.length(); j++) {
                if(S.charAt(i)==S.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
