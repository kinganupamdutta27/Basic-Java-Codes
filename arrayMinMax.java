import java.util.Scanner;

public class arrayMinMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] array = new int[size];
        
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int min=arrayMinMax_1(array)[0];
        int max=arrayMinMax_1(array)[1];
        System.out.println(min+" "+max);
    
    }

    public static int[] arrayMinMax_1(int[] array){
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];

            }
        }
        int[] r={min,max};

        return r;
    }
    
}
