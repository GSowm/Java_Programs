public class One {
    public static void main(String[] args) {
        String ename = null;
        try {
            System.out.println(ename.length());
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());            
        }
        System.out.println("GM");
    }
}
