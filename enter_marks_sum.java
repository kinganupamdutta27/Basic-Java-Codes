import java.util.Scanner;

public class enter_marks_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks_sum=0;
        int i;
        do{
            System.out.println("Enter 1 for Input Marks and 0 to Break:\t");
            i = sc.nextInt();
            if(i==1){
                System.out.println("Enter Marks:\t");
            }
            marks_sum += sc.nextInt();
        }while(i!=0 && marks_sum<=100);

        if(marks_sum>=90){
            System.out.println("This is Good");
        }else if(marks_sum>=60 && marks_sum<=89){
            System.out.println("This is also Good");
        }else if(marks_sum>0 && marks_sum<=59){
            System.out.println("This is Good as well");
        }else{
            System.out.println("Better Try Next time!");
        }
System.out.println(marks_sum);
    }
    
}
