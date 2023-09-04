public class QuickShot {

    public static int findPivotePoint(int[] arr, int low, int high) {
        int pivote = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[high] = temp;
        arr[i] = pivote;
        return i;

    }

    public static void QuickShotAlgo(int[] arr, int low, int high) {
        if (low <= high) {
            int pivote = findPivotePoint(arr, low, high);

            QuickShotAlgo(arr, low, pivote - 1);
            QuickShotAlgo(arr, pivote + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 9, 8 };
        int s = arr.length;
        QuickShotAlgo(arr, 0, s - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
