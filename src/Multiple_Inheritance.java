interface Class1{
    default void print(){
        System.out.println("Class1 print method");
    }
}
interface Class2{
    default void display(){
        System.out.println("Class2 display method");
    }
}
public class Multiple_Inheritance implements Class1,Class2{
    public void showInheritance(){
        // accessing method of both interfaces from this class
        Class1.super.print();
        Class2.super.display();
    }
    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.display();
        obj.print();
        obj.showInheritance();
    }
}
