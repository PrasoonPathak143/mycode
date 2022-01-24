import java.util.Scanner;

public class catAndMouse {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int [] arr = new int[3];
        while(n!=0){
            for(int i=0; i<3; i++){
                arr[i] = num.nextInt();
            }
            if(Math.abs(arr[2]-arr[0]) > Math.abs(arr[2]-arr[1])){
                System.out.println("Cat B");
            }
            else if(Math.abs(arr[2]-arr[0]) < Math.abs(arr[2]-arr[1])) {
                System.out.println("Cat A");
            }

                else{
                    System.out.println("Mouse C");
                }

            n--;
        }

    }
}
