import java.util.Arrays;
import java.util.Scanner;
public class MiniMaxSum {
   /* static int[] miniMaxSum(int[] arr){
        int min = arr[0] + arr[1] + arr[2] + arr[3];
        int max = 0;
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = 0;
            for(int j=0; j<5; j++){
                sum = sum + arr[j];
            }
            sum = sum - arr[i];
            if(sum < min){
                min = sum;
            }
            else if(sum > max){
                max = sum;
            }
        }
        return new int[]{min, max};
    }*/
    public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = num.nextInt();
        }
        //int [] c = miniMaxSum(arr);
        int min = arr[0] + arr[1] + arr[2] + arr[3];
        int max = 0;
        int sum = 0;
        for(int i=0; i<5; i++){
            sum = 0;
            for(int j=0; j<5; j++){
                sum = sum + arr[j];
            }
            sum = sum - arr[i];
            if(sum < min){
                min = sum;
            }
            else if(sum > max){
                max = sum;
            }
        }
        //for(int i = 0; i<2; i++){
            System.out.print(min + " " + max);
        //}
    }
}
