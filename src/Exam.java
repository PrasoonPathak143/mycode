class demo6 {
    int a, b;
    demo6() {
        a = 10;
        b = 20;
    }
    public void print()
    {
        System.out.println ("a = " + a + " b = " + b + "n");
    }

}
class Exam {
    public static void main(String[] args)
    {
        demo6 obj1 = new demo6();
        demo6 obj2 = obj1;
        obj1.a += 1;
        obj1.b += 1;
        System.out.println ("values of obj1 : ");
        obj1.print();
        System.out.println ("values of obj2 : ");
        obj2.print();
    }
}