class Rooms{
    double length;             // attributes of class Rooms
    double breadth;
    double height;
    Rooms(int length, int breadth, int height) {     // constructor setting values of attributes
        this.height = height;
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return this.breadth*this.length;     // area of object room
    }
    public double volume(){
        return this.height*this.breadth*this.length;  // volume of room
    }
}
class Bedroom extends Rooms{
    String bedType;
    boolean haveAC;
    Bedroom(int length, int breadth, int height) {
        super(length, breadth, height);
    }
    public void setBedType(String s){
        this.bedType = s;
    }
    public String getBedType(){
        return this.bedType;
    }
    public void setHaveAC(boolean b){
       this.haveAC = b;
    }
    public boolean getHaveAC(){
        return this.haveAC;
    }
}
public class Ques1 {
    public static void main(String[] args) {
        Bedroom B = new Bedroom(10,20,10);
        System.out.println("Length of bedroom is :- " + B.length);
        System.out.println("Breadth of bedroom is :- " + B.breadth);
        System.out.println("Height of bedroom is :- " + B.height);
        System.out.println("Area of Bedroom is :- " + B.area());
        System.out.println("Volume of Bedroom is :- " + B.volume());
        B.setBedType("Double Bed");
        System.out.println("Bed type is :- " + B.getBedType());
        B.setHaveAC(true);
        System.out.println("Does room have AC :- " + B.getHaveAC());
    }
}
