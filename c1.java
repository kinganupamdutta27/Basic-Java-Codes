import java.util.*;
public class c1 {
    public static void main(String[] args) {

        System.out.println("I am Anupam");
        System.out.println("Enter Some Values");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int c=0;
        System.out.println("Enter The Selection between +,/,-,*");
        String s = sc.next();
        System.out.println(s);
        switch(s){
            case "+": 
                        c = a + b;
                        System.out.println(c);
                        break;
            case "-":   
                        c = a-b;
                        System.out.println(c);
                        break;
            default:
                        System.out.println("ERRor");

        }
        odd_even(50);
        age(25);
        int x1 = sc.nextInt();
        for(int i=1;i<=x1;i++){
            System.out.println(i);
        }
        int i=1;
        while(i<=x1){
            System.out.println(i);
            i++;

        }
        do{
            System.out.println ("I Love Sri Krishna + Mahadev");
        }while(i<=x1);
          i=1;
          int k1 = sc.nextInt();  
        while(i<=x1)
        {
            System.out.println(k1+" X "+i+" = "+(i*k1));

            i++;
        }
        i=1;
        int sum=0;
        while(i<=x1){
            System.out.println(sum+" = "+sum+" + "+i);
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
    static void odd_even(int num){
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
             System.out.println(num+" is ODD");
        }

    }
    static void age(int num){
        if(num>18){
             System.out.println("Adult");
        }else if(num<18){
            System.out.println("Child");
        }else{
            System.out.println("OLD");
        }
    }

}
