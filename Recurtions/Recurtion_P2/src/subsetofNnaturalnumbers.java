import java.util.ArrayList;

public class subsetofNnaturalnumbers {
    public static void main(String[] args) {
        combiSet("123",0,"");
        ArrayList<Integer> Set = new  ArrayList<>();
        comiSetnew(3,Set);
    }
    public static void combiSet(String n,int inx, String new1){
        if(inx==n.length()){
            System.out.println(new1);
            return;
        }

        char C = n.charAt(inx);
        combiSet(n,inx+1, new1);
        combiSet(n,inx+1,new1+C);
    }
    public static void comiSetnew(int n, ArrayList<Integer> Set){
        if(n==0){
            for(int i=0;i<Set.size();i++){
                System.out.print(Set.get(i) +" ");
            }
            System.out.println();
            return;
        }
        Set.add(n);
        comiSetnew(n-1,Set);

        Set.remove(Set.size()-1);
        comiSetnew(n-1,Set);
    }
}
