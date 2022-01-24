import java.util.Random;
public class ThreeWay {
    public static void partition(int[] a, int low, int high){
        if(low>high){
            return;
        }
        int l=low;
        int r=high;
        int i=low+1;
        while(i<=r){
            if(a[i]<a[low]) {
                swap(a,i++,l++);
            }
            else if(a[i]>a[low]) {
                swap(a,i,r--);
            }
            else i++;
        }
        partition(a,low,l-1);
        partition(a,r+1,high);
    }
    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void print(int [] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {24, 8, 42, 75, 29, 77, 38, 57};
        partition(arr,0,arr.length-1);
        print(arr);
    }
}