import java.util.Scanner;

public class BinarySearchHillProb {
   public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter The Data:\t");
    int Size = Sc.nextInt();
    int[] array = new int[Size];
     System.out.println("\t Enter The Input Number:\t");
     for (int i = 0; i < Size; i++) {
        array[i] = Sc.nextInt();
     }

     System.out.println(BinarySearchProb_1(array,Size));
    


   } 
   public static int BinarySearchProb_1(int[] arr,int size){

    int Start = 0;
    int End = size-1;
    int Mid = Start + (End-Start)/2;
    int Ans =0;

    while(Start<End){
        if(arr[Mid]>arr[Mid+1]){
            Ans = Mid;
        }
        if(arr[Mid]<arr[Mid+1]){
            Start = Mid+1;
        }else{
            End = Mid;
        }

        Mid = Start + (End-Start)/2;
    }
    return Ans;
   }
}
