import java.util.Scanner;
public class charAt {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int [] ar = new int[26];
        for(int i=0; i<26; i++){
            ar[i] = nu.nextInt();
        }
        String s = nu.next();
        int l = 0;
        for(int i=97; i<=122; i++){
            for(int j=0; j<s.length(); j++){
              if(s.charAt(j)== i){
                  if(ar[i-97]>l){
                      l = ar[i-97];
                  }
                  break;
              }
            }
        }
        System.out.println(s.length()*l);

    }
}
