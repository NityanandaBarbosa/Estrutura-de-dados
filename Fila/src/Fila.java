public class Fila {
	
	Integer[] valores = null;
	public int fim;
	public int tamanho;
	
	public Fila(int tamanho){
	 valores = new Integer[tamanho];
		fim = -1;
		this.tamanho = tamanho;
	}
	
	public boolean isEmpty() {
		if(fim == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(fim == tamanho) {
			return true;
		}else {
			return false;
		}
	}
	
	public void inserir(int elemento) {
		if(!isFull()) {
			fim++;
			valores[fim] = elemento;
		
		}else {
			System.out.println("Fila está cheia");
		}
	}
	
	public void retirar() {
		if(isEmpty()) {
			System.out.println("Fila vazia, não é possivel remover valor");
		}else {
			for(int i=0;i<fim;i++){
                valores[i]=valores[i+1];
			}
			valores[fim] = null;
			fim--;
		}
	}
	public void imprimir() {
		for(int i=0;i<valores.length;i++){
            System.out.println("["+valores[i]+"]");
        }
        System.out.println("");
	}
}

