package List;

public class Listpra <E> {
	private E a[];
	private int size;
	
	
	
	public Listpra() {
		a = (E[]) new Object[1];
		size = 0;
	}
	
	public void resize(int newSize) {
		Object[] b = new Object[newSize]; //새로운 크기의 배열을 생성
		
		for(int i = 0; i < size; i++) {
			b[i] = a[i];
		}
		a = (E[]) b;
		
	}
	
	public E peek(int k) {
		return a[k];
		
	}
	
	public void insert(E item) {
		if(a.length == size) {
			resize(a.length * 2);
		}
		a[++size] = item;
	}
	
	public void insert(E item, int k) {
		if(size == a.length) {
			resize(a.length * 2);
		}
		for(int i = size-1; i >= k; i--) {
			a[i+1] = a[i]; 
		}
		a[k] = item;
		size++;
	}
	
	public static void delete(int k, int[] a, int size) {
		for(int i = k; i < size; i++) {
			a[i] = a[i+1];
		}
	}

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		delete(2,arr, 7);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// TODO Auto-generated method stub
		
		
	}

}
