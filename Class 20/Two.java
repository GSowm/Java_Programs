public class Two {
    public static void main(String[] args) {
        int[] eids = {101,102,103};

        System.out.println(eids[1]);
        
        try {
            System.out.println(eids[20]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.getMessage();
        }
        System.out.println(eids[2]);
    }
}
