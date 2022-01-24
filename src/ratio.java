import java.util.Scanner;
public class ratio {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int c = num.nextInt();
        int [] arr = new int[c];
        int j = 0;
        int k = 0;
        int l = 0;
        for(int i=0; i<c; i++){
            arr[i] = num.nextInt();
        }
        for(int i=0; i<c; i++){
            if(arr[i] > 0){
                j++;
            }
            else if(arr[i] < 0){
                k++;
            }
            else{
                l++;
            }
        }
        System.out.println((float) j/c);
        System.out.println((float) k/c);
        System.out.println((float) l/c);
    }
}
