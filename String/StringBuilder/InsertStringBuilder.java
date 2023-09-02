package StringBuilder;

import java.util.Scanner;

public class InsertStringBuilder {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The String:\t");
        StringBuilder STR = new StringBuilder(Sc.nextLine());
        System.out.println(STR);
        System.out.println("Enter Where to Insert?:\t");
        int numInx = Sc.nextInt();

        // Consume the newline character left in the buffer
        Sc.nextLine();

        System.out.println("Enter What to Insert?:\t");
        StringBuilder STR1 =  new StringBuilder(Sc.nextLine());
        STR.insert(numInx, STR1);
        System.out.println(STR);

        
    }
}
