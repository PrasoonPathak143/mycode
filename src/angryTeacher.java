import java.util.Scanner;
public class angryTeacher {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int t = num.nextInt();
        while(t!=0){
            int n= num.nextInt();
            int k= num.nextInt();
            int [] arr = new int [n];
            for(int i=0; i<n; i++){
                arr[i] = num.nextInt();
            }
            int p=0;
            int q=0;
            for(int i=0; i<n; i++){
                if(arr[i]<=0){
                    p++;
                }
                else{
                    q++;
                }
            }
            if(p>=k){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
