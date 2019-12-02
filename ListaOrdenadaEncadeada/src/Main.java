public class Main {
	public static void main(String[] args) {
		ListaOrdenadaEncadeada l1 = new ListaOrdenadaEncadeada();
		l1.inserir(54);
		l1.inserir(50);
		l1.inserir(57);
		l1.inserir(49);
		l1.inserir(0);
		l1.inserir(90);
		l1.inserir(91);
		l1.inserir(-1);
		l1.inserir(3);
		l1.imprimir();
		l1.inserir(100);
		l1.inserir(4);
		l1.inserir(56);
		l1.imprimir();
		l1.size();
		l1.remover(0);
		l1.imprimir();
		l1.size();
		l1.remover(10);
		l1.imprimir();
		l1.size();

	}
}
