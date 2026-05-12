import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestTwo {
   /* public static void main(String[] args) throws FileNotFoundException{
                PrintWriter pw=new PrintWriter("data.txt");

    }
*/ 
public static void main(String[] args) {
    try {
        PrintWriter pw = new PrintWriter("data.txt");
    } catch (FileNotFoundException fe) {
        System.out.println("File not found");
    }
}
}
