public class Sum_Thread extends Thread{
    public void run() {
        System.out.println("Prasoon");
    }
    public static void main(String[] args) {
        Extending_Thread T = new Extending_Thread();
        T.start();
    }
}
