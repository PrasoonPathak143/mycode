// basic method i.e. brute force approach

import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        long [] arr = new long[(int) n];
        for(int i =0; i<n; i++){
            arr[ i] = sc.nextLong();
        }
        for(int i = 0; i<d; i++){
            long temp = arr[0];
            if (n - 1 >= 0) System.arraycopy(arr, 1, arr, 0, (int) (n - 1));
            arr[(int) (n-1)] = temp;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[ i] + " ");
        }
    }
}
