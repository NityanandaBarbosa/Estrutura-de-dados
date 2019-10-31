public class Main {
	public static void main(String[] args) {
		FilaEncadeada filaEnc = new FilaEncadeada();
		filaEnc.imprimir();
		filaEnc.inserir(55);
		filaEnc.inserir(45);
		filaEnc.inserir(88);
		filaEnc.imprimir();
		filaEnc.remover();
		filaEnc.imprimir();
		filaEnc.inserir(4855);
		filaEnc.imprimir();
	}
}
