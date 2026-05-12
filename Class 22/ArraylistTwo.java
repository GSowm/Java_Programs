import java.util.ArrayList;

public class ArraylistTwo {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("RG");
        enames.add("SG");
        enames.add("PG");
        enames.add("Modi");
        System.out.println(enames);
        // for (String ename:enames){
        //    System.out.println(ename);
        // }

        // for(i=0; i<=enames.size();i++){
        //     System.out.println((enames));
        // }

        int i=0;
        // while (i<=enames.size()) {
        //     System.out.println(enames);
        //     i++;
        // }

        do {
            System.out.println(enames);
        } while (i<=enames.size());
    }
}
