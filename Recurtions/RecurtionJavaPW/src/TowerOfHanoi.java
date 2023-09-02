public class TowerOfHanoi {
    public static void main(String[] args) {
        String A = "Source";
        String B = "Helper";
        String C = "Destination";
        TOH(2,A,B,C);
    }
    public static void TOH(int num, String TOW1, String TOW2, String TOW3){

        if(num==1){
            System.out.println("Transfer Disk "+num+" From " +TOW1+" to "+TOW3);
            return;
        }
        TOH(num-1,TOW1,TOW3,TOW2);
        System.out.println("Transfer Disk "+num+" From " +TOW1+" to "+TOW3);
        TOH(num-1,TOW2,TOW1,TOW3);
    }
}
