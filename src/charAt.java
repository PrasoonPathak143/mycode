import java.util.Scanner;
public class charAt {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = num.nextInt();
        }
        String s = num.next();
        int l = 0;
        for(int i=97; i<=122; i++){
            for(int j=0; j<s.length(); j++){
              if(s.charAt(j)== i){
                  if(arr[i-97]>l){
                      l = arr[i-97];
                  }
                  break;
              }
            }
        }
        System.out.println(s.length()*l);

    }
}
