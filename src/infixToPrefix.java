import java.util.Scanner;
import java.util.Stack;
public class infixToPrefix {
        public static int Precedence(char c){
            if(c == '+' || c == '-'){
                return 1;
            }
            else if(c == '*' || c == '/'){
                return 2;
            }
            else if(c == '^'){
                return 3;
            }
            else{
                return -1;
            }
        }
        public static String infixToPostfix(String infix) {
            Stack<Character> st = new Stack<>();
            String output = "";
            for (int i = 0; i < infix.length(); i++) {
                char c = infix.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    output += c;
                }
                else if (c == '(') {
                    st.push(c);
                }
                else if (c == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        output += st.pop();
                    }
                    st.pop();
                }
                else {
                    while (!st.isEmpty() && Precedence(c) < Precedence(st.peek())) {
                        output += st.pop();
                    }
                    st.push(c);
                }
            }
            while (!st.isEmpty()) {

                if (st.peek() == '(')
                    return "Invalid Expression";
                output += st.pop();
            }
            return output;

        }
        public static String reverse(String s){
            byte[] strAsByteArray = s.getBytes();
            byte[] result = new byte[strAsByteArray.length];
            for (int i = 0; i < strAsByteArray.length; i++) {
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];
            }
            return new String(result);
        }
        public static String infixToPrefix(String input){
            input = reverse(input);
            int l = input.length();
            byte[] in = input.getBytes();
            for (int i = 0; i < l; i++)
            {
                if (in[i] == '(')
                {
                    in[i] = ')';
                    i++;
                }
                else if (in[i] == ')')
                {
                    in[i] = '(';
                    i++;
                }
            }
            input = new String(in);
            String result;
            result = infixToPostfix(input);
            result = reverse(result);
            return result;
        }

    public static void main(String[] args) {
        Scanner exp = new Scanner(System.in);
        System.out.print("Write the expression :- ");
        String infix = exp.next();
        System.out.print("Infix to Prefix :- ");
        System.out.println(infixToPrefix(infix));
        }
}
