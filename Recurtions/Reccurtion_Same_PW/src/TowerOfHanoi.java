public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3,"Source","Helper","Destination");
    }
    public static void TOH(int Num_Disk, String Source, String Helper, String Destination){
        if(Num_Disk == 1){
            System.out.println("The Disk Number "+Num_Disk+" Moved From "+Source+" to "+Destination+" Directly");
            return;
        }

        TOH(Num_Disk-1,Source, Destination, Helper);
        System.out.println("The Disk Number "+Num_Disk+" Moved From "+Source+" to "+Destination+ " By Taking The Help From "+Helper);
        TOH(Num_Disk-1,Helper,Source,Destination);
    }
}

