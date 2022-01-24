
import java.util.Scanner;
public class ReverseInteger {
    public static int reverse(int n){
        int reversed = 0;
        while(n>0){
            int c = n % 10;
            reversed = reversed * 10 + c;
            n = n / 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = num.nextInt();
        System.out.println(reverse(n));
    }
}
