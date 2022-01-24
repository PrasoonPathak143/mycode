import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = n.nextInt();
        for(int i=row; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("❤ ");
            }
            System.out.println();
            if(i==1){
                break;
            }
            for(int j=0; j<=row-i; j++){
                System.out.print(" ");
            }
        }
        for(int i=1; i<row; i++){
            for(int j=1; j<row-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("❤ ");
            }
            System.out.println();
        }
    }
}
