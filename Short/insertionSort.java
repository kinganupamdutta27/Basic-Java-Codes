import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Enter Size");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        System.out.println("\t Enter Data:");
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }

        arr=insertionSortNew(arr,Size);

        System.out.println("Data Out:\n");
        for (int i = 0; i < Size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] insertionSortNew(int[] arr, int size) {
        for(int i=1;i<size;i++) 
        {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    return arr;
    }
}
