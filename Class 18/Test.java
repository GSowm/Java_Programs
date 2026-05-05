public class Test{
    public static void main(String[] args) {
        
        String m1 = "sowmya";
        String s1 = new String("Rahul");
        s1.concat("Gandhi");
        System.out.println(s1);

        s1 = s1.concat("Gandhi");
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Rahul");
        sb.append("Gandhi");
        System.out.println(sb);
    }
}