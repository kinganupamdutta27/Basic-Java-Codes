public class MargeShort {
    public  static void MargeShortConquer(int[] array, int Start, int Middle, int End){
        int[] res =  new int[End - Start+1];
        int inx1 = Start;
        int inx2 = Middle+1;
        int X = 0;

        while (inx1<=Middle && inx2<=End){
            if(array[inx1]>=array[inx2]){
                res[X++] = array[inx2++];
            }else {
                res[X++] = array[inx1++];
            }
        }

        while (inx1<=Middle) {
            res[X++] = array[inx1++];
        }
        while (inx2<=End) {
            res[X++] = array[inx2++];
        }
        for(int i=0,j=Start; i<res.length;i++,j++){
            array[j] = res[i];
        }
    }
    public static void MargeShortDevide(int[] array, int Start, int End){
        if(Start<End) {


            int Middle = Start + (End - Start) / 2;
            MargeShortDevide(array, Start, Middle);
            MargeShortDevide(array, Middle + 1, End);
            MargeShortConquer(array, Start, Middle, End);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,5,8,7,6,2};
        int n = array.length;
        MargeShortDevide(array,0,n-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
