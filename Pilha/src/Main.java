public class Main {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.pop();
		//p.push(3);
		//p.push(7);
		//p.push(-2);
		
		while(!p.isEmpty()){
			int elemento = p.pop();
			System.out.println(elemento);
		}
	}
}
	
		
