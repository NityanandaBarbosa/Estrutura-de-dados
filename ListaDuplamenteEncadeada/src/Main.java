public class Main {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada l1 = new ListaDuplamenteEncadeada();
		l1.inserir(55);
		l1.inserir(99);
		l1.inserir(999);
		l1.size();
		l1.imprimir();
		//l1.imprimirInverso();
		l1.remover(2);
		l1.imprimir();
		l1.inserir(1);
		l1.inserir(1999);
		l1.inserir(-10);
		l1.inserir(4, 30);
		l1.imprimir();
		l1.size();
		l1.remover(0);
		l1.size();
		l1.imprimir();
		l1.imprimirInverso();

	}
	

}
