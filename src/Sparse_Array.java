import java.util.Scanner;
public class Sparse_Array {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        String[] input = new String[n];
        for(int i=0; i<n; i++){
            input[i] = num.next();
        }
        int q = num.nextInt();
        String[] query = new String[q];
        for(int i = 0; i<q; i++){
            query[i] = num.next();
        }
        int[] output = new int[q];
        for(int i =0; i<q; i++){
            int total =0;
            for(int j=0; j<n; j++){
                if(query[i].equals(input[j])){
                    total++;
                }
            }
            output[i] = total;
        }
        for(int i = 0; i<q; i++){
            System.out.println(output[i] + " ");
        }
    }
}
