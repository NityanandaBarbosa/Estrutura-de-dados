public class Pilha {
	int elementos[];
	int topo;
	
	public Pilha() {
		elementos = new int[10];
		topo = -1;
	}
	
	public void push(int e) {
		if(isFull()) {
			System.out.println("ta cheio");
		}else {
		topo++;
		elementos[topo] = e;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Ta Vazio");
			return 0;
		}else {
		int e;
		e = elementos[topo];
		topo--;
		return e;
		}
	}
	
	public boolean isEmpty() {
		if(topo == -1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		if(topo == 9) {
			return true;
		}else {
			return false;
		}
	}
	
	public int top() {
		return elementos[topo];
	}
}
