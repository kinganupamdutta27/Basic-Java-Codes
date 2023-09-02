public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd_cal(36,60));
        System.out.println(gcd_cal_if(36,60));
    }
    public static int gcd_cal(int num,int num1){
        int Gcd=1;
        for(int i=1;i<=num && i<=num1;i++){
           if(num%i==0 && num1%i==0){
            Gcd = i;
           }
        }
        return Gcd;
    }
    public static int gcd_cal_if(int num,int num1){
        while(num!=num1){
        if(num>num1){
            num=num-num1;
        }else{
            num1=num1-num;
        }
    }
    return num1;
    }
}
