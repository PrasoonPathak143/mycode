class Display{
    Display() {
        System.out.println("Method of Parent Class");
    }
}
public class Example_Super extends Display{
   Example_Super(){
        super();
        // calling constructor of parent class
    }
    public static void main(String[] args) {
        Example_Super sup = new Example_Super();
    }
}
