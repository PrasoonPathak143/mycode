import java.util.Scanner;
public class RecursiveReverse {
    public static void reverse(int n){
        if(n<10){
            System.out.print(n);
        }
        else {
            System.out.print(n%10);
            n = n / 10;
            reverse(n);
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = num.nextInt();
        System.out.println("Reversed number is:- ");
        reverse(n);
    }
}
