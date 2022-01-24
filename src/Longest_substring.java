import java.util.Scanner;
public class Longest_substring {
    public static int max(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static int differentSubstrings(String s,int place){
        int index = 1;
        for (int i = place; i < s.length()-1; i++) {
            if (s.charAt(place) == s.charAt(i+1)) {
                    return index;
            }
            index++;
        }
        return index;
    }
    public static int substring(String s){
        int [] arr = new int[s.length()];
        for(int k = 0; k<s.length(); k++){
            arr[k] = differentSubstrings(s,k);
        }
        return max(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The longest substring is of length :- " + substring(s));
    }
}
