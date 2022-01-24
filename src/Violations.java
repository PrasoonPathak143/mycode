import java.util.Scanner;
public class Violations {
    public static int countViolation(int [] arr, int index, int noOfViolation){
        if(index==arr.length){
            return noOfViolation;
        }
        for(int i=0; i<arr.length-index-1; i++){
            if(arr[i]>arr[i+1]){
                noOfViolation++;
            }
        }
    return countViolation(arr, index+1, noOfViolation);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array :- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = countViolation(arr,0,0);
        System.out.println("Number of violations in array are :- " + x);
    }
}
