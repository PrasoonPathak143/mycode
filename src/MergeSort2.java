import java.util.Random;
public class MergeSort2 {
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
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int a;
            for(a=firstUnsortedIndex; a>0 && intArray[a-1]<newElement; a--){
                intArray[a] = intArray[a-1];
            }
            intArray[a] = newElement;
        }
        System.out.println();
        System.out.println("In descending order :-");
        for(int i=0; i<100; i++) {
            System.out.print(intArray[i] + " ");
        }
        long start = System.nanoTime();
        mergeSort(intArray, 0, intArray.length);
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println();
        System.out.println("Sorted array in ascending order to ascending order :-");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Time taken to this algorithm is : " + elapsedTime);
    }
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
