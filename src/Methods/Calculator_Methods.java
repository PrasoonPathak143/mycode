package Methods;

public class Calculator_Methods {
    protected static void add(double a, double b){
        System.out.println(a+b);
    }
    protected static void subtract(double a, double b){
        System.out.println(a-b);
    }
    protected static void multiply(double a, double b){
        System.out.println(a*b);
    }
    protected static void divide(double a, double b){
        System.out.println(a/b);
    }
    protected static void squareRoot(double a){
        System.out.println(Math.pow(a,0.5));
    }
    protected static void percentage(double a, double b){
        System.out.println((a/b)*100);
    }
}
