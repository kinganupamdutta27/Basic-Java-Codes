package StringBuilder;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        System.out.println("Enter:\n");
        Scanner sc = new Scanner(System.in);
        StringBuilder Str =  new StringBuilder(sc.nextLine());
        System.out.println(Str);
        for (int i = 0; i < Str.length()/2; i++) {
            char temp = Str.charAt(i);
            char temp2 = Str.charAt(Str.length()-(i+1));
            //System.out.println(temp+" " +temp2);
            Str.setCharAt(i,Str.charAt(Str.length()-(i+1)));
            Str.setCharAt(Str.length()-(i+1), temp);       
        }
        System.out.println(Str);

    }
}
