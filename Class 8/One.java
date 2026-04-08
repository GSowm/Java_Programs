public class One {
    public static void main(String[] args) {
        String[] enames = {"RG","SG", "PG", "NM", "DM"};

        System.out.println("forLoop");
        for(int i=0; i<=enames.length-1; i++){
            System.out.println(enames[i]);
        }

        
        System.out.println("whileLoop");
        int j=0;
        while (j<enames.length) {
            System.out.println(enames[j]);
            j++;
        }

        System.out.println("dowhileLoop");
        int k=0;
        do {
            System.out.println(enames[k]);
            k++;
        } while (k<enames.length);

        
        System.out.println("foreachLoop");
        for (String ename : enames) {
            System.out.println(ename);
        }
    }
}
