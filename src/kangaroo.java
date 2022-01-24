import java.util.Scanner;
public class kangaroo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x1 = num.nextInt();
        int v1 = num.nextInt();
        int x2 = num.nextInt();
        int v2 = num.nextInt();
        if(x1<x2 && v1<v2){
            System.out.println("NO");
        }
        else if(x2<x1 && v2<v1){
            System.out.println("NO");
        }
        else if(x1<x2 && v1==v2){
            System.out.println("NO");
        }
        else if(x2<x1 && v1==v2){
            System.out.println("NO");
        }

        else{
            int i = 1;
            while(i==1){
                x1=x1+v1;
                x2=x2+v2;
                if(x1==x2){
                    i=0;
                    System.out.println("YES");
                }
                else if(x1<x2 && v1<v2){
                    System.out.println("NO");
                    break;
                }
                else if(x2<x1 && v2<v1){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
