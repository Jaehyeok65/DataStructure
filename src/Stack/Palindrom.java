package Stack;

import java.util.*;


public class Palindrom {

	public static void main(String[] args) {
		
		StackPra stack = new StackPra();
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int k = st.countTokens();
		
		for(int i = 0; i < k; i++) {
			if(i < 3) {
				stack.push(st.nextToken());
			}
			else if(i == 3) {
				System.out.println(st.nextToken());
			}
			else if(i > 3) {
				/*System.out.println("토큰 : " + st.nextToken());
				System.out.println("피크 : " + stack.peek());*/
				if(st.nextToken().equals(stack.peek())) {
					System.out.println("하이");
					stack.pop();
				}
			}
		}
		
		stack.iter();
		
		// TODO Auto-generated method stub

	}

}
