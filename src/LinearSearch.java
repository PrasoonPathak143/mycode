import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int a){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of elements in array :- ");
        int n = num.nextInt();
        System.out.println("Enter " + n + " the elements in the array :- ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = num.nextInt();
        }
        System.out.println("Enter the number to find :- ");
        int a = num.nextInt();
        System.out.println("Index of the element is :- " + linearSearch(arr,a));

    }
}
