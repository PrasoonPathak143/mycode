import java.util.Random;
public class QuickSort2 {
    public static void main(String[] args) {
        int min = 1000;
        int max = 10000;
        int [] intArray = new int[100];
        for(int i=0; i<100; i++){
            intArray[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        for(int i=0; i<100; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array :-");
        long start = System.nanoTime();
        quickSort(intArray, 0, intArray.length);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        for(int i=0; i<100; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Time taken to this algorithm is : " + elapsedTime);
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = divide(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }
    public static int divide(int[] arr,int start,int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while(i<j){
            while (i < j && arr[--j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
