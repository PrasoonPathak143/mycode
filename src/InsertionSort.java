import java.util.Random;
import java.util.Scanner;
public class InsertionSort {
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
        System.out.println();
        System.out.println("Sorted array in random to descending order :-");
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int a;
            for(a=firstUnsortedIndex; a>0 && arr[a-1]<newElement; a--){
                arr[a] = arr[a-1];
            }
            arr[a] = newElement;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       System.out.println("Sorting from descending to ascending order :-");
        long start = System.nanoTime();
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int a;
            for(a=firstUnsortedIndex; a>0 && arr[a-1]>newElement; a--){
                arr[a] = arr[a-1];
            }
            arr[a] = newElement;
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Time taken to this algorithm is : " + elapsedTime);

    }
}
