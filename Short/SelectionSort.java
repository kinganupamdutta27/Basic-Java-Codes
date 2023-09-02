import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Size of The Array:");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Input Data:\t");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        array = SelectionSort1(array, size);

        System.out.println("\t Array After Selection Sort:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public static int[] SelectionSort1(int[] array, int size) {

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

}