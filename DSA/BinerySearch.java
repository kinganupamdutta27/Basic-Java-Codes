import java.util.Scanner;

public class BinerySearch{
    public static void main(String[] args) {
        Scanner Sc =  new Scanner(System.in);
        System.out.println("Enter Size of Array:\t");
        int size = Sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Data into Array:\t");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter The Key:\t");
        int key = Sc.nextInt();
        if(BinerySearchAlgo(arr, size, key)==-1){
            System.out.println("Item not in Array");
        }else{
            System.out.println("Index is :\t"+BinerySearchAlgo(arr, size, key));
        }
    }


    public static int BinerySearchAlgo(int[] arr, int size, int key){
        int Start = 0;
        int End = size-1;
        int Mid = Start+(End-Start)/2;
        while (Start<=End) {
            if(arr[Mid]==key){
                return Mid;
            }

            if(arr[Mid]>key){
                End = Mid-1;
            }else{
                Start = Mid+1;
            }

            Mid = Start+(End-Start)/2;
        }
        return -1;
    }
}