import java.util.Scanner;

public class matchesIndex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size,scr;
            System.out.println("Enter The Size of The Array:\t");
            size=sc.nextInt();
            int[] arr = new int[size];

            for(int i=0;i<arr.length;i++){
                System.out.println("Enter The Values In Array:\t");
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter The Value to be searched:\n");
            scr=sc.nextInt();
            System.out.println("The Search Item found on Index number:\t"+matchIndex(arr, scr));
        }
        
    }
    public static int matchIndex(int[] num,int value){
        for(int i=0;i<num.length;i++){
            if(num[i]==value){
                return i;
            }
          
        }
       return 404; 
    }
}
