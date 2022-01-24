import java.util.Scanner;
public class pickingNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = num.nextInt();
        }
        int l=0;
        for(int i = 0; i<n; i++){
            int k = 0;
            for(int j = 0; j<n; j++){
                if((arr[i] - arr[j])==1 || arr[i]==arr[j]){
                    k++;
                }
            }
            if(k>l){
                l=k;
            }
        }
        System.out.println(l);
    }
}
