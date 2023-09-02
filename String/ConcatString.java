import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Name:\t");
        String First_Name = sc.next();
        System.out.println("Enter The Last Name:\t");
        String Last_name = sc.next();

        String full_name = First_Name + " " + Last_name;
        System.out.println(full_name);


    }
}
