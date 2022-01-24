import java.util.Scanner;
public class saveThePrisoner {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        while(t!=0){
            long n = num.nextLong();
            long m = num.nextLong();
            long s = num.nextLong();
            long d = 0;
            if(n>=m){
                d = m+s-1;
                if(d>n){
                    d = d-n;
                }
            }
            if(n<m){
                d = m%n+s-1;
                if(d>n){
                    d = d-n;
                }
                if(d==0){
                    d = n;
                }
            }
            System.out.println(d);
            t--;
        }
    }
}
