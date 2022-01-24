import java.util.Scanner;
public class HeapSort2 {
    public static void HeapSorting(int[] input, int size){
        MaxHeap(input, size);
        for(int i = size; i>1; i--){
            int temp = input[1];
            input[1] = input[size];
            input[size] = temp;
            size--;
            Heapify(input,1, size);
        }
    }
    public static void MaxHeap(int []input, int size) {
        for (int i = size / 2; i > 0; i--) {
            Heapify(input, i, size);
        }
    }
    public static void Heapify(int []input, int a, int size){
        int Lchild = 2*a;
        int Rchild = Lchild+1;
        int largest = a;
        if(Lchild<=size && input[Lchild]>input[largest]){
            largest = Lchild;
        }
        if(Rchild<=size && input[Rchild]>input[largest]) {
            largest = Rchild;
        }
            if(largest!=a){
                int temp = input[a];
                input[a] = input[largest];
                input[largest] = temp;
                Heapify(input, largest, size);
            }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter no of entries :- ");
        int size = num.nextInt();
        System.out.println("Enter numbers :- ");
        int [] arr = new int[size+1];
        for(int i =1; i<size+1; i++){
            arr[i] = num.nextInt();
        }
        System.out.println("Sorted array is :- ");
        HeapSorting(arr, size);
        for(int i =1; i<size+1; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
