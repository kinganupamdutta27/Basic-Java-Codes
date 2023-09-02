public class convertNum {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(13));
        System.out.println(decimalToBinary_2(13));
        System.out.println(binaryToDecimal(1101));
    }
    public static String decimalToBinary(int num){
        StringBuilder str = new StringBuilder("");
        while(num!=0){
            if((num&1)==1){
                str.append(1);
            }else{
                str.append(0);
            }
            num=num>>1;
        }
        str.reverse();
        return str.toString();
    }

    public static int decimalToBinary_2(int num){
        int count=0;
        int ans=0;
        while(num!=0){
            int x = num%2;
           
            ans = (int)(Math.pow(10, count)*x)+ans;
            count++;
            num=num/2; 

        }
        return ans;
    }

    public static int binaryToDecimal(int x){
        int reminder=0;
        int ans = 0;
        int count =0;
        int dec=0;
        while(x!=0){
            reminder = x%10;
            ans =  (int)((Math.pow(10,count)*reminder)+ans);
            count++;
            x=x/10;
        }
        count=0;
        reminder =0;
        while (ans!=0) {
            reminder = ans%10;
            if(reminder!=0){
                dec+=(int)(Math.pow(2, count));
            }
            count++;
            ans=ans/10;
        }
        return dec;
    }
}
