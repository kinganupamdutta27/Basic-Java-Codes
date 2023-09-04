public class margeShot {
    public static void Concour(int[] arr, int start, int Middle, int end) {
        int inx1 = start;
        int inx2 = Middle + 1;
        int X = 0;
        int[] res = new int[end - start + 1];

        while (inx1 <= Middle && inx2 <= end) {
            if (arr[inx1] > arr[inx2]) {
                res[X++] = arr[inx2++];
            } else {
                res[X++] = arr[inx1++];
            }
        }

        while (inx1 <= Middle) {
            res[X++] = arr[inx1++];
        }

        while (inx2 <= end) {
            res[X++] = arr[inx2++];
        }

        for (int j = 0, i = start; j < res.length; i++, j++) {
            arr[i] = res[j];
        }
    }

    public static void Devide(int[] arr, int start, int end) {
        // Terminator
        if (start >= end) {
            return;
        }

        int Middle = start + (end - start) / 2;
        Devide(arr, start, Middle);
        Devide(arr, Middle + 1, end);
        Concour(arr, start, Middle, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 9, 8 };
        int s = arr.length;
        Devide(arr, 0, s - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
