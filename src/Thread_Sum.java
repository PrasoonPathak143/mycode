public class Thread_Sum extends Thread {
    public void run(){  // run method that defines the task
        int sum = 0;
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            try {
                sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum is :- " + sum);
    }
    public static void main(String[] args) {
        Thread_Sum T = new Thread_Sum();
        T.start();
    }
}
