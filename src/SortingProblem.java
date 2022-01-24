import java.util.Random;
public class SortingProblem {
    public static void main(String[] args) {
        int min = 1000;
        int max = 10000;
        int temp;
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
        System.out.println("Sorted array(in descending order) is : ");
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }
        //Passing ascending array to sort in ascending order.
        long start = System.nanoTime();
        for(int i=0; i<99; i++){
            for(int j=0; j<99-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println();
        System.out.println("Sorted array(in ascending order) is : ");
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Time taken to this algorithm is : " + elapsedTime);

       /* for(int i=0; i<100; i++){
            for(int j=0; j<99-i; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array(in descending order) is : ");
        for(int i=0; i<100; i++){
            System.out.print(arr[i] + " ");
        }*/
    }

}

    /*long start = System.nanoTime();
long end = System.nanoTime();
    long elapsedTime = end - start;
    System.out.println("Time taken to this algorithm is : " + elapsedTime);*/