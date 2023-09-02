import java.util.Scanner;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Size oƒ the array:\n");
        int Size = Sc.nextInt();
        int[] arr = new int[Size];
        System.out.println("Enter Data into array:\n");
        for (int i=0;i<Size;i++){
            arr[i] = Sc.nextInt();
        }

        System.out.println("Entered Data into array:\n");
        for (int i=0;i<Size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After Bubble Sort Data into array:\n");
        bubbleShotJava(arr,Size);
        for (int i=0;i<Size;i++){
            System.out.println(arr[i]);
        }

    }

    public static int[] bubbleShotJava(int[] arr, int Size){
        for(int i =0 ;i<Size-1;i++){
            for(int j =0; j<Size-(i+1);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
