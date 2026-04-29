public class Emp {
    private int emp_Id;
    private String emp_Name;
    
    public void  set_Emp_Id(int Id){
        this.emp_Id = Id;
    }

    public int get_Emp_Id(){
        return this.emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.set_Emp_Id(101);
        e1.setEmp_Name("Rahul");
        System.out.println(e1.get_Emp_Id());
        System.out.println(e1.getEmp_Name());
    }
}