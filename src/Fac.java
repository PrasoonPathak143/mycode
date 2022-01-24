import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int num = sc.nextInt();
            int n = 1;
            for(int i = 1; i<=num; i++){
                n = n * i;
            }
            System.out.println(n);
        }
    }
}