public class Fivonaci {

    public static void main(String[] args) {
        TOH(3,"Source","Helper","Destination");
    }
    public  static void TOH(int n, String A, String B, String C){
        if(n==1){
            System.out.println("The Disk No. "+n+" Travel From "+A+" to "+C);
        }
        TOH(n-1,A,C,B);
        System.out.println("The Disk No. "+n+" Travel From "+A+" to "+C);
        TOH(n-1,B,A,C);
    }
}
