 class Point {
    double x;
    double y;
    Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    Point(){
        this(0,0);
        // calls the constructor of same class with parameters a = 0, b = 0
    }
    public void display(){
        System.out.println("x = " + x + " y = " + y);
    }
    public static void main(String[] args) {
        Point num = new Point(10,5);
        num.display();
    }
}
