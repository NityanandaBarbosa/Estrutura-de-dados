public class Main {
	public static void main(String[] args) {
		ListaDuplamenteEncadeadaOrdenada l1 = new ListaDuplamenteEncadeadaOrdenada();
		l1.inserir(100);
        l1.inserir(101);
        l1.inserir(125);
        l1.inserir(45);
        l1.inserir(4);
        l1.inserir(8);
        l1.inserir(3);
        l1.inserir(55);
        l1.inserir(60);
        l1.size();
        l1.imprimir();
        l1.remover(0);
        l1.size();
        l1.imprimir();
        l1.remover(8);
        l1.size();
        l1.remover(5);
        l1.imprimir();
        l1.imprimirInverso();
        l1.size();
	}
	

}
