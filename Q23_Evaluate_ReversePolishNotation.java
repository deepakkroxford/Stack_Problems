import java.util.Stack;

class Evaluate {
    public int ReversePolishNotation(String[] tokens) {
        Stack<Integer> ans = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isnumber(tokens[i])) {
                ans.push(Integer.parseInt(tokens[i])); // it is like converting the string into integer
            } else {
                int b = ans.pop();
                int a = ans.pop();

                switch (tokens[i]) {
                    case "+":
                        ans.push(a + b);
                        break;
                    case "-":
                        ans.push(a - b);
                        break;

                    case "*":
                        ans.push(a * b);
                        break;

                    case "/":
                        ans.push(a / b);
                        break;

                    default:
                        break;
                }
            }
        }
        return ans.peek();
    }
    // now we have to create a method that check this string array element is number
    // or not

    // public static boolean isNumber(String s) {
    // try {
    // Integer.parseInt(s);
    // return true;
    // } catch (NumberFormatException e) {
    // return false;
    // }
    // }

    // we can aslo use in simple way to check it is digit or not
    public static boolean isnumber(String s) {
        if (s.length() == 1) // so here we are checking "+" "-" beacuse these two can make number is pos or
                             // neagtive if the length is one
        // no need to check it is not a number
        {
            if (s.charAt(0) == '+' || s.charAt(0) == '-') {
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++) // here we are checking number like "-15" so if first charcter is opertor
                                             // so we move and then check for
        // next one if there is not a digit so we return false otherwise true;
        {
            char ch = s.charAt(i);
            if (i == 0 && (ch == '+' || ch == '-')) {
                continue;
            } else if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}

public class Q23_Evaluate_ReversePolishNotation {
    public static void main(String[] args) {
        /*
         * leetcode -150
         * You are given an array of strings tokens that represents an arithmetic
         * expression in a Reverse Polish Notation.
         * 
         * Evaluate the expression. Return an integer that represents the value of the
         * expression.
         * 
         * Note that:
         * 
         * The valid operators are '+', '-', '*', and '/'.
         * Each operand may be an integer or another expression.
         * The division between two integers always truncates toward zero.
         * There will not be any division by zero.
         * The input represents a valid arithmetic expression in a reverse polish
         * notation.
         * The answer and all the intermediate calculations can be represented in a
         * 32-bit integer.
         * 
         * 
         * Example 1:
         * 
         * Input: tokens = ["2","1","+","3","*"]
         * Output: 9
         * Explanation: ((2 + 1) * 3) = 9
         * Example 2:
         * 
         * Input: tokens = ["4","13","5","/","+"]
         * Output: 6
         * Explanation: (4 + (13 / 5)) = 6
         * Example 3:
         * 
         * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
         * Output: 22
         * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
         * = ((10 * (6 / (12 * -11))) + 17) + 5
         * = ((10 * (6 / -132)) + 17) + 5
         * = ((10 * 0) + 17) + 5
         * = (0 + 17) + 5
         * = 17 + 5
         * = 22
         */

        /*
         * Note this question is similar to postfix but in this we have to deal with
         * neagtive number so
         * this is little bit complex;
         */

        Evaluate ans = new Evaluate();
        String[] tokens1 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println("after evaluation the value is -->" + ans.ReversePolishNotation(tokens1));

        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println("after evaluation the value is -->" + ans.ReversePolishNotation(tokens2));

        String[] tokens3 = { "2", "1", "+", "3", "*" };
        System.out.println("after evaluation the value is -->" + ans.ReversePolishNotation(tokens3));

    }
}
