public class SortedArrayCheck {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1, 2, 3,5 },3,0));
    }
    public static boolean sorted(int[] arr, int size, int index){
        if(index==size){
            if(arr[index]<=arr[index-1]){
                return false;
            }else {
                return true;
            }
        }
        if(index>0 && arr[index]<=arr[index-1]){
            return false;
        }
        return sorted(arr,size,index+1);
    }
}
