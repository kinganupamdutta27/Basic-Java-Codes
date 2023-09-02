public class guestBindingIssue {
    public static void main(String[] args) {
        System.out.println(CallGuest(4));
    }
    public static int CallGuest(int n){
        if(n<=1){
            return 1;
        }

        return CallGuest(n-1)+(n-1)*CallGuest(n-2);
    }
}
