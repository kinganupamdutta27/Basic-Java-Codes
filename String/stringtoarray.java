import java.lang.reflect.Array;

public class stringtoarray {
    public static void main(String[] args) {
        String X = "adfghjklpoiuytrewqazxcvbnm";
        char[] Carray = new char[50];
        for (int i = 0; i < X.length(); i++) {
            Carray[i]=X.charAt(i);
            
        }
         for (int i = 0; i < X.length(); i++) {
            System.out.println(Carray[i]);
            
        }
    }
}
