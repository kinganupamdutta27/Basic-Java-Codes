import java.util.Scanner;

public class arraySeq {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:\n");
        Scanner Sc = new Scanner(System.in);
        int size=Sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Data in array:\n");
            arr[i]=Sc.nextInt();
        }
        if(Seqn(arr)){
            System.out.println("OK");
        }else{
            System.out.println("Failed");
        }
    }
    public static boolean Seqn(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    } 
}
