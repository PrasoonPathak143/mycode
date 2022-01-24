public class Extending_Thread extends Thread {
    public void run(){
        System.out.println("Thread implemented by extending Thread class.");
    }
    public static void main(String[] args) {
        Extending_Thread T = new Extending_Thread();
        T.start();
    }
}
