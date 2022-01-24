import java.util.Scanner;
import java.util.Stack;
public class postfixEvaluation {
    public static int evaluation(String input){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
               st.push(c - '0');
            }
            else
            {
                int a = st.pop();
                int b = st.pop();

               switch(c)
                {
                    case '+':
                        st.push(a+b);
                        break;

                    case '-':
                        st.push(b - a);
                        break;

                    case '/':
                        st.push(b/a);
                        break;

                    case '*':
                        st.push(b*a);
                        break;
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        System.out.println("Enter Mathematical expression in postfix form :- ");
        Scanner exp = new Scanner(System.in);
        String input = exp.next();
        System.out.println(evaluation(input));

    }
}
