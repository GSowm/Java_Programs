abstract class One_abstract{

}
class Test{
    public static void main(String[] args) {
        One_abstract a1 = new One_abstract();
        //error: class is abstract; cannot be instantiated
    }
}