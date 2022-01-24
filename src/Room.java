public class Room {
    int roomNo;
    String roomType;
    float roomArea;
    String bedSize;

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(float roomArea) {
        this.roomArea = roomArea;
    }

    public static void main(String[] args) {
        Room R1 = new Room();
        Room R2 = new Room();
        R1.setRoomNo(1);
        R1.setRoomType("Single");
        R1.setRoomArea(330.4f);
        R1.setBedSize("King sized bed");
        R2.setRoomNo(2);
        R2.setRoomType("Double");
        R2.setRoomArea(229.6f);
        R2.setBedSize("Queen sized bed");
        System.out.println("Room number of R1 :- " + R1.getRoomNo());
        System.out.println("Room type of R1 :- " + R1.getRoomType());
        System.out.println("Room area of R1 (in sq ft) :- " + R1.getRoomArea());
        System.out.println("Bed size of R1 :- " + R1.getBedSize());
        System.out.println("Room number of R2 :- " + R2.getRoomNo());
        System.out.println("Room type of R2 :- " + R2.getRoomType());
        System.out.println("Room area of R2 (in sq ft) :- " + R2.getRoomArea());
        System.out.println("Bed size of R2 :- " + R2.getBedSize());
    }
}
