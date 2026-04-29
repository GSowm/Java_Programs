public class Super {
    Super(){
        super();
        System.out.println("GP Class constructor");
    }
}
class Parent extends Super{
    Parent(){
        super();
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Class Constructor");
    }
}
public class Demo {
    public static void main(String[] args) {
        new Child();
    }    
}
