public class Thread_Implement implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is created by implementing runnable interface.");
    }
    public static void main(String[] args) {
        Thread_Implement T1 = new Thread_Implement();
        Thread T = new Thread(T1);
        T.start();
    }
}
