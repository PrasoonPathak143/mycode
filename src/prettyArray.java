import java.util.Scanner;
public class prettyArray {
    public static void main(String[] args) {
        int z=1;
        System.out.print("Enter the length of array : ");
        Scanner n = new Scanner(System.in);
        int l = n.nextInt();
        System.out.println("Enter the array elements : ");
        int [] arr = new int[l];
        for(int i=0; i<l; i++){
            System.out.printf("Enter element arr[%d] : ", i);
            arr[i] = n.nextInt();
        }
        System.out.println("The array is ");
        for(int i=0; i<l; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=1; i<l; i++){
            if(arr[0] != 0){
                z=0;
                break;
            }
            else if(arr[i] % i != 0){
                z=0;
                break;
            }
        }
        if(z==0){
            System.out.println("This is not a pretty array.");
        }
        else{
            System.out.println("This is a pretty array.");
        }
    }
}
