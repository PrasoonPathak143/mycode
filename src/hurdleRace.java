import java.util.Scanner;
public class hurdleRace {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int k = num.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = num.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        if(max>k){
            System.out.println(max-k);
        }
        else{
            System.out.println("0");
        }
    }
}
