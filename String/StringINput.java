import java.util.Scanner;

public class StringINput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = new String("Anupam Dutta");
        System.out.println("Please Enter Dept:\t");
        String dept = sc.nextLine();
        String full = Name+" "+dept;
        System.out.println(full);
    }
}