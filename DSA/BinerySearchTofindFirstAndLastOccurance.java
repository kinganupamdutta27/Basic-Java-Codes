import java.util.Scanner;

public class BinerySearchTofindFirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input Size of Array:\t");
        int size = Sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Elements:");
        for (int i = 0; i < size; i++) {
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter The Key Search Elements:");
        int key = Sc.nextInt();

        System.out.println("First Occurance:\t"+FirstOccurance(arr,size,key)+"\tLast Occurance:\t"+LastOccurance(arr,size,key));

        
    }
    public static int FirstOccurance(int[] arr,int size,int key){
        int Start = 0;
        int End =  size-1;
        int Mid = Start+(End-Start)/2;
        int Ans = 0;
        while (Start<=End) {
            
            if(arr[Mid]==key){
                Ans = Mid;
                End = Mid-1;
            }else if (arr[Mid]>key) {
                End = Mid - 1;
                
            }else{
                Start = Mid + 1;
            }
            Mid = Start + (End-Start)/2;
            System.out.println(Mid);
        }
        return Ans;
    }
    public static int LastOccurance(int[] arr,int size,int key){
        int Start = 0;
        int End = size-1;
        int Mid =  Start+(End-Start)/2;
        int Ans = 0;

        while (Start<=End) {

            if(arr[Mid]==key){
               Ans = Mid;
               Start = Mid + 1; 
            }

            if(arr[Mid]>key){
                End = Mid-1;
            }else{
                Start = Mid + 1;
            }
            Mid = Start+(End-Start)/2;
            
        }
        return Ans;
    }
}
