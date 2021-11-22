package DSA18;
import java.util.Stack;

public class STACKEXAMPLE {
public static void main(String[] args) {
		
		Stack<Integer> stk=new Stack<>();
		
		stk.push(6);
		stk.push(8);
		stk.push(10);
		stk.push(20);
		
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.peek());
	}
}
