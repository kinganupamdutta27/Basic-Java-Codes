
public class insertionsort {
    public static void main(String[] args) {
        int[] array = new int[]{9,7,8,6,4,5,3,2,1,0};
        for(int i=0;i<10-1;i++) {
            int j=i;
            while(j>=0){

                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                j--;
            }
        }
         for(int i =0;i<10;i++){
            
             System.out.print(array[i]+"\t");
         }

    }
}
