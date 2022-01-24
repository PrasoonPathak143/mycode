class Vehicle{
    protected int noOfWheels;      // attributes of a vehicle
    protected int seatingCapacity;
    protected int maxVelocity;
    // getters and setters of attributes
    protected int getNoOfWheels() {
        return noOfWheels;
    }
    protected void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    protected int getSeatingCapacity() {
        return seatingCapacity;
    }
    protected void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    protected int getMaxVelocity() {
        return maxVelocity;
    }
    protected void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
    protected void acceleration() {
        System.out.println("Accelerated.......");
    }
    protected void breaks(){
        System.out.println("Breaks Applied.......");
    }
}
class Bike extends Vehicle{
    protected int mileage;
    protected int getMileage() {
        return mileage;
    }
    protected void setMileage(int mileage) {
        this.mileage = mileage;
    }
    protected void specialization(){
        System.out.println("Acquires high speed quickly");
    }
}
class MountainBike extends Bike{
    protected void specialization(){
        System.out.println("Specialized tyres");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bike yamaha = new Bike();   // Creating object of class bike
        yamaha.setNoOfWheels(2);
        yamaha.setMaxVelocity(200);
        yamaha.setSeatingCapacity(2);
        yamaha.setMileage(55);
        System.out.println("Number of wheels in Yamaha :- " + yamaha.getNoOfWheels());
        System.out.println("Maximum velocity in Yamaha :- " + yamaha.getMaxVelocity() + "kmph");
        System.out.println("Seating Capacity in Yamaha :- " + yamaha.getSeatingCapacity());
        System.out.println("Mileage in Yamaha :- " + yamaha.getMileage() + "kmpl");
        yamaha.specialization();
        yamaha.acceleration();
        yamaha.breaks();
        MountainBike Turner_Burner = new MountainBike();     // Object of class Mountain bike
        Turner_Burner.setNoOfWheels(2);
        Turner_Burner.setMaxVelocity(100);
        Turner_Burner.setSeatingCapacity(1);
        Turner_Burner.setMileage(35);
        System.out.println("Number of wheels in Turner_Burner :- " + Turner_Burner.getNoOfWheels());
        System.out.println("Maximum velocity in Turner_Burner :- " + Turner_Burner.getMaxVelocity() + "kmph");
        System.out.println("Seating Capacity in Turner_Burner :- " + Turner_Burner.getSeatingCapacity());
        System.out.println("Mileage in Turner_Burner :- " + Turner_Burner.getMileage() + "kmpl");
        Turner_Burner.specialization();
        Turner_Burner.acceleration();
        Turner_Burner.breaks();
    }
}
