public class ListaOrdenadaVetor {

    private Integer[] Lista; //Vetor de Interger
    private int quantidade=0;

    public ListaOrdenadaVetor(int tamanho){
        Lista = new Integer[tamanho]; //Criando o vetor de posições determinadas
    }

    public boolean isFull() {
        if(quantidade==Lista.length/*Se a quantidade de elementos for igual o tamanho da minha lista*/){ //Tá cheia
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if(quantidade == 0) {
            return true;
        }else {
            return false;
        }
    }

    public int size() {
        return quantidade;
    }

    public boolean buscar(Integer chave) {
        for(int i=0; i < quantidade; i++) {
            if(Lista[i] == chave) {
                return true;
            }
        }
        return false;
    }

    public Integer get(int posicao) {
        if(posicao < quantidade && posicao >=0) {
            return Lista[posicao];
        }else {
            System.out.println("Posição inválida!");
            return null;
        }
    }

    public void inserir(Integer valor) {
        if(!isFull()) {
        	if(quantidade == 0) {
            Lista[quantidade] = valor;
            quantidade++;
        	}else {
        		int posOrdem = 0;
        		while(posOrdem < quantidade) {
        			if(Lista[posOrdem] <= valor) {
        				posOrdem++;
        			}else {
        				break;
        			}
        		}
        		for(int i = (quantidade - 1); i >= posOrdem; i--) {
        			Lista[i+1] = Lista[i];
        		}
        		Lista[posOrdem] = valor;
        		quantidade++;
        	}
        }else {
            System.out.println("Lista ta cheia !");
        }
    }

    public Integer remover(int posicao){
        Integer Aux = null;
        if(!isEmpty()){
            if(posicao>=0 && posicao<=quantidade) {
                Aux = Lista[posicao];
                for(int i = posicao; i <= quantidade; i++){
                    Lista[i] = Lista[i+1];
                }
                Lista[quantidade - 1] = null;
                quantidade--;
                return Aux;
            }else{
                System.out.println("Posição Invalida!");
            }
        }else{
            System.out.println("Lista está vazia !");
        }
        return Aux;
    }

    public void imprimirLista(){
        int i = 0;
        String imprimirListaV;
        imprimirListaV = ("[");
        for(; i<quantidade-1; i++){
            imprimirListaV += (Lista[i]+",");
        }
        imprimirListaV += (Lista[i]+"]");
        System.out.println(imprimirListaV);
    }

}
