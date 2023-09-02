public class checkArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(checkArrayMethod(arr,0));
    }
    public static boolean checkArrayMethod(int[] arr, int index){
        if(index == arr.length-1){
            if(arr[index]>arr[index-1]){
                return true;
            }else {
                return false;
            }
        }

        if(arr[index]>arr[index+1]){
            return false;
        }
        return  checkArrayMethod(arr,index+1);

    }
}
