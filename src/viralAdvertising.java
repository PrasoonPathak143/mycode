import java.util.Scanner;
public class viralAdvertising {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = 5;
        int b = 0;
        int c = 0;
        int n = num.nextInt();
        for(int i=0; i<n; i++){
            c = a/2 + c;
            b = a/2;
            a = b*3;
        }
        System.out.println(c);
    }
}
