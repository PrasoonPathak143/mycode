public class AloPrasoonPathak_202051143 {
    public static int linearSearch(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int [] Arr, int a, int b, int n){
        if(a>b){
            return -1;
        }
        if(b>a){
            int mid = (a + b)/2;
            if(Arr[mid] == n){
                return mid;
            }
            else if(Arr[mid] > n){
               return binarySearch(Arr, a, mid, n);
            }
            else if(Arr[mid] < n){
                return binarySearch(Arr, mid+1, b, n);
            }
        }
        return -1;
    }

    public static void insertionSort(int [] arr){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];
            int a;
            for(a=firstUnsortedIndex; a>0 && arr[a-1]>newElement; a--){
                arr[a] = arr[a-1];
            }
            arr[a] = newElement;
        }
    }
    public static void selectionSort(int []arr){
        for(int i=0; i<arr.length; i++) {
            int min_index = i;
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubbleSort(int [] arr){
        for(int i = arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int [] c = new int[100000];      // c is a random array
        for(int i=0; i<c.length; i++){
            c[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        int [] c1 = new int[c.length];   // copying arrays to pas same inputs to all algorithms
        int [] c2 = new int[c.length];
        int [] c3 = new int[c.length];
        int [] c4 = new int[c.length];
        int [] c5 = new int[c.length];
        for(int i=0; i<c.length; i++){
            c1[i] = c2[i] = c3[i] = c4[i] = c5[i] = c[i];
        }
        System.out.println();
        selectionSort(c);
        int [] a = new int[c.length];        // a is sorted array in ascending order
        System.arraycopy(c, 0, a, 0, c.length);
        int [] b = new int[a.length];        // b is sorted array in descending order
        for(int i = 0; i<a.length; i++){
            b[i] = a[a.length-i-1];
        }

        int [] a1 = new int[a.length];   // copying arrays to pas same inputs to all algorithms
        int [] a2 = new int[a.length];
        int [] a3 = new int[a.length];
        int [] a4 = new int[a.length];
        for(int i=0; i<a.length; i++){
            a1[i] = a2[i] = a3[i] = a4[i] = a[i];
        }
        int [] b1 = new int[b.length];   // copying arrays to pas same inputs to all algorithms
        int [] b2 = new int[b.length];
        int [] b3 = new int[b.length];
        int [] b4 = new int[b.length];
        for(int i=0; i<b.length; i++){
            b1[i] = b2[i] = b3[i] = b4[i] = b[i];
        }
        System.out.println("Number of elements in array for this program :- " + a.length);
        System.out.println("Giving inputs to selection sort :- ");
        System.out.println();
        long start1 = System.nanoTime();
        selectionSort(a);
        long end1 = System.nanoTime();
        long elapsedTime1 = end1 - start1;
        System.out.println("Time for selection sort when input is array 'a' = " + elapsedTime1 + " ns");
        long start2 = System.nanoTime();
        selectionSort(b);
        long end2 = System.nanoTime();
        long elapsedTime2 = end2 - start2;

        System.out.println("Time for selection sort when input is array 'b' = " + elapsedTime2 + " ns");
        long start3 = System.nanoTime();
        selectionSort(c5);
        long end3 = System.nanoTime();
        long elapsedTime3 = end3 - start3;
        System.out.println("Time for selection sort when input is array 'c' = " + elapsedTime3 + " ns");
        System.out.println();
        System.out.println("Giving same inputs to bubble sort :- ");
        System.out.println();
        long start4 = System.nanoTime();
        bubbleSort(a1);
        long end4 = System.nanoTime();
        long elapsedTime4 = end4 - start4;
        System.out.println("Time for bubble sort when input is 'a' = " + elapsedTime4 + " ns");
        long start5 = System.nanoTime();
        bubbleSort(b1);
        long end5 = System.nanoTime();
        long elapsedTime5 = end5 - start5;
        System.out.println("Time for bubble sort when input is 'b' = " + elapsedTime5 + " ns");
        long start6 = System.nanoTime();
        bubbleSort(c1);
        long end6 = System.nanoTime();
        long elapsedTime6 = end6 - start6;
        System.out.println("Time for bubble sort when input is 'c' = " + elapsedTime6 + " ns");
        System.out.println();
        System.out.println("Giving same inputs to insertion sort :- ");
        System.out.println();
        long start7 = System.nanoTime();
        insertionSort(a2);
        long end7 = System.nanoTime();
        long elapsedTime7 = end7 - start7;
        System.out.println("Time for insertion sort when input is 'a' = " + elapsedTime7 + " ns");
        long start8 = System.nanoTime();
        insertionSort(b2);
        long end8 = System.nanoTime();
        long elapsedTime8 = end8 - start8;
        System.out.println("Time for insertion sort when input is 'b' = " + elapsedTime8 + " ns");
        long start9 = System.nanoTime();
        insertionSort(c2);
        long end9 = System.nanoTime();
        long elapsedTime9 = end9 - start9;
        System.out.println("Time for insertion sort when input is 'c' = " + elapsedTime9 + " ns");
        System.out.println();
        System.out.println("Giving input to linear search when number is present :- ");
        System.out.println();
        long start10 = System.nanoTime();
        int index1 = linearSearch(a3,20);
        long end10 = System.nanoTime();
        long elapsedTime10 = end10 - start10;
        System.out.println("Time for linear search when input is 'a' = " + elapsedTime10 + " ns");
        System.out.println("Index of element is :- " + index1);
        long start11 = System.nanoTime();
        int index2 = linearSearch(b3,20);
        long end11 = System.nanoTime();
        long elapsedTime11 = end11 - start11;
        System.out.println("Time for linear search when input is 'b' = " + elapsedTime11 + " ns");
        System.out.println("Index of element is :- " + index2);
        long start12 = System.nanoTime();
        int index3 = linearSearch(c3,20);
        long end12 = System.nanoTime();
        long elapsedTime12 = end12 - start12;
        System.out.println("Time for linear search when input is 'c' = " + elapsedTime12 + " ns");
        System.out.println("Index of element is :- " + index3);
        System.out.println();
        System.out.println("Giving input to linear search when number is not present :- ");
        System.out.println();
        long start13 = System.nanoTime();
        int index4 = linearSearch(a4,2);
        long end13 = System.nanoTime();
        long elapsedTime13 = end13 - start13;
        System.out.println("Time for linear search when input is 'a' = " + elapsedTime13 + " ns");
        System.out.println("Index of element is :- " + index4);
        long start14 = System.nanoTime();
        int index5 = linearSearch(b4,2);
        long end14 = System.nanoTime();
        long elapsedTime14 = end14 - start14;
        System.out.println("Time for linear search when input is 'b' = " + elapsedTime14 + " ns");
        System.out.println("Index of element is :- " + index5);
        long start15 = System.nanoTime();
        int index6 = linearSearch(c4,2);
        long end15 = System.nanoTime();
        long elapsedTime15 = end15 - start15;
        System.out.println("Time for linear search when input is 'c' = " + elapsedTime15 + " ns");
        System.out.println("Index of element is :- " + index6);
        System.out.println();
        System.out.println("Giving same input to binary search (We can only pass sorted array in binary search) :- ");
        System.out.println();
        System.out.println("When element is present :- ");
        long start16 = System.nanoTime();
        int index7 = binarySearch(a,0,a.length,20);
        long end16 = System.nanoTime();
        long elapsedTime16 = end16 - start16;
        System.out.println("Time for binary search when input is 'a' = " + elapsedTime16 + " ns");
        System.out.println("Index of element is :- " + index7);
        System.out.println();
        System.out.println("When element is not present :- ");
        long start17 = System.nanoTime();
        int index8 = binarySearch(a,0,a.length,2);
        long end17 = System.nanoTime();
        long elapsedTime17 = end17 - start17;
        System.out.println("Time for linear search when input is 'a' = " + elapsedTime17 + " ns");
        System.out.println("Index of element is :- " + index8);
    }
}
