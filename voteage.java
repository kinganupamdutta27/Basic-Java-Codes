import java.util.Scanner;

public class voteage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        funVoteAge(X);
    }
    public static void funVoteAge(int age){
        if(age>18 && age<=100){
            System.out.println("Eligible to Vote");
        }else if(age>100){
            System.out.println("Eligible to Vote BUT Very OLD");
        }else if(age<=18 && age>0){
            System.out.println(" not Eligible to Vote See Pogo");
        }else{
            System.out.println(" Invalid Input");
        }
    }
}
