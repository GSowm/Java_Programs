public class Employee{
    public static void set_no_of_Leaves(){
        System.out.println("Good morning");
    }
    public String get_Emp(){
        return "Rahul";
    }
    public void set_Emp(){
        System.out.println("Setting Emp details");
    }
    public static void main(String[] args) {
        int a = 100;
        set_no_of_Leaves();
        Employee e1 = new Employee();
        String ename = e1.get_Emp();
        System.out.println(ename);
        e1.set_Emp();

    }
}
