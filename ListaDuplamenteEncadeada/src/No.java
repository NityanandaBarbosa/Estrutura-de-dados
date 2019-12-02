public class No {
    private Integer valor;
    private No prox;
    private No anterior;
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public No getProx() {
            return prox;
    }
    public void setProx(No prox) {
            this.prox = prox;
    }
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
}
