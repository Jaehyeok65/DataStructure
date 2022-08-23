package Stack;

import java.util.*;




public class StackPra <E> {
	
	public class Node <E> {
		private E item;
		private E next;
		
		public Node(E item, E next) {
			this.item = item;
			this.next = next;
		}
		
		public E getItem() {
			return item;
		}
		
		public E getNext() {
			return next;
		}
		
		
	}
	
	private Node<E> top;
	private int size;
	
	
	public StackPra() { //생성자
		top = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E peek() {
		if(isEmpty()) {
			System.out.print("에러발생");
		}
		
		return top.getItem();
	}
	
	public void push(E newitem) { //새로운 아이템을 추가
		Node newNode = new Node(newitem, top); //새로운 아이템과 기존의 top을 next로 하는 newNode를 만듬
		top = newNode;
		size++;
	}
	
	public E pop() {
		E newNode = top.getItem();
		top = (StackPra<E>.Node<E>) top.getNext();
		size--;
		return newNode;
	}
	
	public void iter() {
		while(top != null) {
			System.out.print(top.getItem() + "  ");
			top = (StackPra<E>.Node<E>) top.getNext();
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		StackPra stack = new StackPra();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '{' || s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == '}' || s.charAt(i) == ')') {
				stack.pop();
			}
		}
		
		stack.iter();
		
	
		
		
		// TODO Auto-generated method stub

	}

}
