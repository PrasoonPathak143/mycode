import java.util.Scanner;
import java.util.Stack;

public class infixtoPostfix {
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
                while (!st.isEmpty() && Precedence(c) <= Precedence(st.peek())) {
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
    public static void main(String[] args) {
        Scanner exp = new Scanner(System.in);
        System.out.print("Write the expression :- ");
        String infix = exp.next();
        System.out.print("Infix to Postfix :- ");
        System.out.println(infixToPostfix(infix));
    }
}
