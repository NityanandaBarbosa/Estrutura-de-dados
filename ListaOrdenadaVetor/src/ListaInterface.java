public interface ListaInterface {
	public boolean isFull();
	public boolean isEmpty();
	public int size();
	public boolean buscar(Integer chave);
	public Integer get(int posicao);
	public void inserir(Integer valor);
	public Integer remover(int posicao);
	public void imprimirLista();
}
