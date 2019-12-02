public interface ListaInterface {
	public boolean isFull();
	public boolean isEmpty();
	public void size();
	public boolean buscar(Integer chave);
	public Integer get(int posicao);
	public void inserir(Integer valor);
	public Integer remover(int posicao);
	public void imprimir();
}
