import java.util.Scanner;
public class utopianTree {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        while(t!=0){
            int h =1;
            int n = num.nextInt();
            if(n==0){
                h = 1;
            }
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    h=h*2;
                }
                else{
                    h=h+1;
                }
            }
            System.out.println(h);
            t--;
        }
    }
}
