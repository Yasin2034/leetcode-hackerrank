import java.util.Stack;

public class BalancedBrackets {
/*
Explanation

The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
The string {[(])} is not balanced because the brackets enclosed by the matched pair { and } are not balanced: [(]).
The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
 */

	    // Complete the isBalanced function below.
	    public  String isBalanced(String s) {
	        Stack<Character> stack = new Stack<Character>();
	           
	           for(Character i : s.toCharArray()){
	               switch(i){
	                   case '(':
	                   case '{':
	                   case '[':
	                        stack.push(i);
	                   break;
	                   case ']':
	                        if(stack.empty() || stack.peek() !=  '[') return "NO";
	                        stack.pop();
	                   break;
	                   case '}':
	                        if(stack.empty() || stack.peek() !=  '{') return "NO";
	                        stack.pop();
	                   break;
	                   case ')':
	                        if(stack.empty() || stack.peek() !=  '(') return "NO";
	                        stack.pop();
	                   break;
	                   
	               }
	           }
	           if(!stack.empty()) return "NO";

	           return "YES";

	    }
}

