import java.sql.SQLOutput;
// Abstract class having abstract method
abstract class FirstClass{
    abstract int max(int a, int b);
    abstract int min(int a, int b);
    // Abstract methods don't consist body
}
// Inheriting first class' methods
abstract class SecondClass extends FirstClass{
    // Overriding the inherited methods
    @Override
    int max(int a, int b) {
        return Math.max(a,b);
    }
}
class ThirdClass extends SecondClass{
    @Override
    int min(int a, int b) {
        return Math.min(a,b);
    }
}
class Abstract {

    private void print(){
        System.out.println("HI");
    }
    public void Print(){
        System.out.println("HO");
    }
    public static void main(String[] args) {
        // creating object of Second class
        ThirdClass Obj = new ThirdClass();
        // Calling methods of inherited class
        System.out.println(Obj.max(8,9));
        System.out.println(Obj.min(8,9));
    }
}
