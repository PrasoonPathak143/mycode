import java.util.Scanner;
public class migratoryBird {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        int max = 0;
        long g =0;
        long h =0;
        long e =0;
        long f=0;
        long j= 0;
        int []arr = new int[(int)n];
        for(int i=0; i<n; i++){
            arr[i] = num.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]==5){
                j++;
            }
            if(arr[i]==1){
                e++;
            }
            if(arr[i]==2){
                f++;
            }
            if(arr[i]==3) {
                g++;
            }
            if(arr[i]==4){
                h++;
            }
        }
        if(j>e && j>g && j>h && j>f){
            max = 5;
        }
        else if(h>e && h>g && h>f && h>j){
            max = 4;
        }
        else if(g>e && g>=f && g>h && g>j){
            max = 3;
        }
        else if(f>e && f>g && f>h && f>j){
            max = 2;
        }
        else if(e>f && e>g && e>h && e>j){
            max = 1;
        }
        else if((e==f && e>g && e>h && e>j) || (e==g && e>f && e>h && e>j) || (e==h && e>g && e>f && e>j) || (e==j && e>g && e>h && e>f)){
            max = 1;
        }
        else if((f==g && f>e && f>h && f>j) || (f==h && f>g && f>e && f>j) || (f==j && f>g && f>h && f>e)){
            max = 2;
        }
        else if((g==h && g>f && g>e && g>j) || (g==j && g>f && g>h && g>e)){
            max = 3;
        }
        else if(h==j && h>f && h>g && h>e){
            max = 4;
        }
        else{
            max =5;
        }
        System.out.println(max);



    }
    }

