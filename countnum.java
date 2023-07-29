import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        int[] count = funCountNum();
        System.out.println("Positive Number: "+count[0]+" Negative No: "+count[1]+" Zeros: "+count[2]);
    }
    public static int[] funCountNum(){
        int positive=0;
        int negative=0; 
        int zeros=0;
        Scanner Sc =  new Scanner(System.in);
        int value=0;
        do{
            System.out.println("Enter a number\t");
            value = Sc.nextInt();
           if(value>0){
            positive++;
           }else if(value<0){
            negative++;
           }else{
            zeros++;
           }
        }while(value!=916314);
        int[] count = {positive, negative, zeros};
        return count;
    }
}
