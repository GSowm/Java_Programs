public class TestOne {
    public static void main(String[] args) {
        int[] eids;
        eids = new int[5];
        eids[0] = 101;
        eids[1] = 102;
        eids[2] = 103;
        eids[3] = 104;
        eids[4] = 105;

        for (int eid : eids){
        System.out.println(eid);
        }
        String[] enames = {"RG", "SG", "PG", "NM"};
        for (String ename : enames){
            System.out.println(ename);
        }
    }    
}