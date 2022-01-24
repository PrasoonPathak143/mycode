class Create extends Exception{
     Create(String s){
        super(s);
    }
}
public class Create_Exception {
    public static void main(String[] args) {
        try{
            throw new Create("Age not filled");
        }
        catch (Create e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
