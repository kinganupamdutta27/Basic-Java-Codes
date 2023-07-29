public class palind {
    public static int isPalindrome(int x) {
        int z = x;
        int c=0;
     while(z!=0){
            int x1 = z%10;
            z=z/10;
            c++; 
     }
     return c;
 
    }
    public static void main(String args[]){
        int x = isPalindrome(121);
        System.out.println(x);
    }
}
