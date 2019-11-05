public class Pilha {
	int elementos[];
	int topo;
	int tamanho;
	
	public Pilha(int tamanho) {
		elementos = new int[tamanho];
		topo = -1;
		this.tamanho = tamanho;
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
		if(topo == this.tamanho-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public int top() {
		return elementos[topo];
	}
	
	public void imprimir() {
		int i = topo;
		while(i != -1){
			System.out.println(elementos[i]);
			i--;
		}
		System.out.println();
	}
}
