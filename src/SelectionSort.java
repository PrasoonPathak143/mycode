import java.util.Random;
public class SelectionSort {
    public static void main(String[] args) {
        int min = 1000;
        int max = 10000;
        int temp = 0;
        int [] arr = new int[100];
        for(int i=0; i<100; i++){
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<100; i++){
            for(int j=0; j<99-i; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array in descending order : ");
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }

        long start = System.nanoTime();
        for(int i=0; i<100; i++){
           for(int j=i; j<100; j++){
               int minimum = arr[i];
               if(arr[j] < minimum && j != i){
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println();
        System.out.println("Sorted array is : ");
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Time taken to this algorithm is : " + elapsedTime);
    }
}
