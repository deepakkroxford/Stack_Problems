import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        /*
         * Coding exercise
         * 
         * You are building a message processing system that handles incoming messages
         * in a specific format. Each message is a string containing characters and
         * numbers. The system needs to process these messages according to the
         * following rules: Numbers in the message represent the count of times the
         * immediately preceding character should be repeated. For example, 'a3' becomes
         * 'aaa'. However, if a character is followed by a 0, it should be removed from
         * the final output. The system should process the message from left to right,
         * handling multiple number occurrences correctly. Special characters and spaces
         * should be treated as normal characters.
         * 
         * EXAMPLE 1
         * 
         * Input:a2b3c0d1
         * 
         * Output:aabbbd
         * 
         * Explanation: 'a2' becomes 'aa', 'b3' becomes 'bbb', 'co' removes c, 'd1'
         * becomes 'd'
         * 
         * EXAMPLE 2
         * 
         * Input:x3y0z2 1
         * 
         * Output:xxxzz
         * 
         * Explanation: 'x3' becomes 'xxx', 'yo'
         * 
         * removes y, 'z2' becomes 'zz', space followed by 1 remains as single space
         */
       
        Stack<Character> ch = new Stack<>();
        String s = "x3y0z2 1";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
            {
                ch.push(s.charAt(i));
            }
            else if(s.charAt(i)==' ')
            {
                continue;
            }
            else if(Character.isDigit(s.charAt(i)) && !ch.isEmpty()){
                int x = Character.getNumericValue(s.charAt(i));
                while(x!=0)
                {
                    sb.append(ch.peek());
                    x--;
                }
                ch.pop();
            }
        }
        System.out.println(sb);
    }
}
