class Demo1
{
    public double myMethod(double num1, double num2)  // we changed the datatype of both parameters to double and return type of method to double
    {
        System.out.println("First myMethod of class Demo");
        return num1+num2;
    }
    public int myMethod(int var1, int var2)
    {
        System.out.println("Second myMethod of class Demo");
        return var1-var2;
    }
}
class Demo2
{
    public static void main(String[] args)
    {
        Demo1 obj1= new Demo1();   // we have created the object of class Demo1
        obj1.myMethod(10,10);
        obj1.myMethod(20,12);
    }
}