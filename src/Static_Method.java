
public class Static_Method {
    public static void print(){
        System.out.println("This is Static Method");
        // creating an object to execute non-static method
        Static_Method f1 = new Static_Method();
        f1.display();
    }
    public void display(){
        System.out.println("This is Non-Static Method");
    }
    public static void main(String[] args) {
        print();
    }
}
