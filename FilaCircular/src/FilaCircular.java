public class FilaCircular {
	Integer[] Fila = null;
	int inicio = 0;
	int fim = 0;
	int quantidade = 0;
	
	public FilaCircular(int tamanho){
        Fila = new Integer[tamanho];
    }
	
	public boolean isEmpty() {
		if(quantidade == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(quantidade == Fila.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public void inserir(int valor) {
		if(!isFull()) {
			Fila[fim] = valor;
			fim++;
			quantidade++;
			if(fim == Fila.length) {
				fim = 0;
			}
		}else {
			System.out.println("Fila tá cheia");
		}
		System.out.println(quantidade);
	}
	
	public void retirar() {
		if(isEmpty()) {
			System.out.println("Fila ta vazia");
		}else {
			Fila[inicio] = null;
			inicio++;
			quantidade--;
			if(inicio == Fila.length) {
				inicio = 0;
			}
			System.out.println(quantidade);
		}
	}
	
	public void imprimir() {
		for(int i = 0; i < Fila.length; i++) {
			System.out.println("["+Fila[i]+"]");
		}
		System.out.println();
	}	
}

