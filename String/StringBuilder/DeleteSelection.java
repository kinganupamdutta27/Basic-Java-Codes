package StringBuilder;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class DeleteSelection {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter:\t");
    StringBuilder ST =new StringBuilder(sc.nextLine());

    System.out.println("Select the range of delete Starting from 0 Enter:\t Size\t "+ST.length());
    int Start = sc.nextInt();
    int Last = sc.nextInt();

    ST.delete(Start, Last);
    System.out.println(ST);
    ST.replace(0, 5, "Noe vc");
    System.out.println(ST);

    ST.reverse();
    System.out.println(ST);
   
}
}
