import java.util.Random;
public class QuickSortwrong {
    public static void main(String[] args) {
        int min = 1000;
        int max = 10000;
        int temp = 0;
        long t;
        int [] intArray = new int[100];
        for(int i=0; i<100; i++){
            intArray[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        for(int i=0; i<100; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array :-");
        quickSort(intArray, 0, intArray.length);
        for(int i=0; i<100; i++){
            System.out.print(intArray[i] + " ");
        }
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
            for(int p = 0; p>0; p++){
                if(arr[j] <= pivot){
                    arr[i] = arr[j];
                    break;
                }
                j--;
            }
            for(int p = 0; p>0; p++) {
                if (arr[i] >= pivot) {
                    arr[j] = arr[i];
                    break;
                }
                i++;
            }
        }
        arr[j] = pivot;
        return j;

    }




}
