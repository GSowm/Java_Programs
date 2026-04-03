public class array_Crud {
    public static void main(String[] args) {
        
        int[] eids = {101,102,103,104};
        String[] enames = {"RG", "SG", "PG", "NM"};
        double[] prices = {99.9, 199.9,299.9, 399.9};

        System.out.println(eids[0]);
        System.out.println(eids[1]);
        //System.out.println(eids[9]);

        eids[2] = 181;
        System.out.println(eids[2]);
    }
}
