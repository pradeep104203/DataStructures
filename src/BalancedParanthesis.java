import java.util.*;
public class BalancedParanthesis<T> {

    Deque<Character> stack = new ArrayDeque<Character>();

    public char c='\0';
    public boolean balanced(String exp) {

        for (int i = 0; i < exp.length(); i++)
        {
            c = exp.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
            continue;
        }

            if (stack.isEmpty())
                return false;

            switch (c) {
                case ')':
                    stack.pop();
                    if (c == '}' || c == ']')
                        return false;
                    break;

                case '}':
                    stack.pop();
                    if (c == ')' || c == ']')
                        return false;
                    break;


                case ']':
                    stack.pop();
                    if (c == '}' || c == ')')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String args[])
    {
        BalancedParanthesis bps=new BalancedParanthesis();
        String s="([{}])";
        bps.balanced(s);
        if(bps.balanced(s))
            System.out.println("balanced");
        else
            System.out.println("not balanced");

    }
}
