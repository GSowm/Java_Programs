public class ArrayIterations {
    public static void main(String[] args) {
        int[] eids = {101, 102, 103, 104, 105};

    for(int i=0;i<=4;i++){
        System.out.println(eids[i]);
    }
    
    int j=0;
    while (j<=4) {
        System.out.println(eids[j]);
        j++;        
    }

    int k=0;
    do {
        System.out.println(eids[k]);
        k++;
    } while (k<=4);

    for (int eid : eids) {
        System.out.println(eid);
    }

    }
}