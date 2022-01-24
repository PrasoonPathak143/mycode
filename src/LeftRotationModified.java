// to modify
import java.util.Scanner;
public class LeftRotationModified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long d = sc.nextLong();
        long[] arr = new long[(int) n];
        for (long i = 0; i < n; i++) {
            arr[(int) i] = sc.nextLong();
        }
        for(long i =0; i<n; i++){
            arr[(int) ((int) (i+n-d)%n)] = arr[(int) i];
        }
        for(long i = 0; i<n; i++){
            System.out.print(arr[(int) i] + " ");
        }
    }
}
