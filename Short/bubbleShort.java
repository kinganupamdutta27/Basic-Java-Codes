import java.util.Scanner;

public class bubbleShort{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        int size = Sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Number:");
        for(int i = 0; i < size; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("Array before Shot:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // bubble sort complex way
        arr=bubbleShortComplex(arr, size);
        //bubble sort Simple way
        arr = bubbleShortSimple(arr, size);


        System.out.println("\nArray After Shot:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        

    }

    public static int[] bubbleShortComplex(int[] array, int size){
        
        for(int i=0;i<size;i++){
            int[] max = new int[2]; 
            max[0] = 0;
            max[1] = Integer.MIN_VALUE;
            for(int j=0;j<size-i;j++){
                if(array[j]>max[1]){
                    max[1] = array[j];
                    max[0] = j;
                } 
                if(j == size-(i+1)){
                    int temp = array[j];
                    array[max[0]] = array[j];
                    array[j] = max[1];
                    array[max[0]] = temp;
                }
            }
        }
        return array;
    }

    public static int[] bubbleShortSimple(int[] array, int size){

        for(int i = 0;i<size-1;i++){
            for(int j = 0;j<size-(i+1);j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                }
            }
        return array;
    }
}