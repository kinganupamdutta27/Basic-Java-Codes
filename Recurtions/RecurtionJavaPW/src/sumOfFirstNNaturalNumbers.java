public class sumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumNaturalDect(5,0));
        System.out.println(sumNaturalDect2(5));
        System.out.println(sumNaturalInc(5,0,0));
    }
    public static int sumNaturalDect(int n,int sum){
        if(n==0){
            return sum;
        }

        return sumNaturalDect(n-1,sum=sum+n);
    }
    public static int sumNaturalDect2(int n){
        if(n==0){
            return 0;
        }

        return n+ sumNaturalDect2(n-1);
    }
    public static int sumNaturalInc(int n,int i,int sum){
        if(n==i){
            return sum+i;
        }

        return sumNaturalInc(n,i+1,sum+i);
    }
}
