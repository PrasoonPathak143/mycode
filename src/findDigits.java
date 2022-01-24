import java.util.Scanner;
public class findDigits {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        while(t!=0){
            long n = num.nextLong();
            long d = n;
            long i = 0;
            while(n>0){
                if(n%10==0){
                    n=n/10;
                }
                else if(d%(n%10)==0){
                    i++;
                    n=n/10;
                }
                else{
                    n=n/10;
                }
            }
            System.out.println(i);
            t--;
        }
    }
}
