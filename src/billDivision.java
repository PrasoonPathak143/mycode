import java.util.Scanner;
public class billDivision {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long k = num.nextLong();
        long[] arr = new long[(int) n];
        for(int i=0; i<n; i++){
            arr[i] = num.nextLong();
        }
        long sum = 0;
        for(int i=0; i<n; i++){
            if(i!=k) {
                sum = sum + arr[i];
            }
        }
        sum = sum/2;
        long b = num.nextLong();
        if(b==sum){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-sum);
        }
    }
}
