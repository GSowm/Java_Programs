public class TestThree {
    public static void main(String[] args) {
        System.out.println(10/5);
        //System.out.println(10/0);
        try {
            throw new ArithmeticException("Go and Enjoy Buddy");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(10/1);
    }
}
