public class ListaEncadeada {
	No inicio = null;
    int quantidade = 0;
    
    public boolean isFull() {
    	return false;//Uma lista encadeada nunca fica cheia
    }
    
    public boolean isEmpty() {
    	if(quantidade == 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    
    public void size() {
    	System.out.println("Tamanho da lista é " + quantidade);
    }
    
    public boolean buscar(Integer chave) {
    	No Aux = inicio;
    	for(int i = 0;i<quantidade; i++) {
    		if(Aux.getValor() == chave) {
    			return true;
    		}else {
    			Aux = Aux.getProx();
    		}
    	}
    	return false;
    }
    
    public Integer get(int posicao) {
    	if(posicao < quantidade && posicao >=0) {
    		No Aux = inicio;
    		for(int i = 0; i < quantidade; i++) {
    			Aux = Aux.getProx();
    		}
    		return Aux.getValor();
    	}else {
    		System.out.println("Posição invalida !");
    		return null;
    	}	
    }
    
    public void inserir(Integer valor) {
    	No novoNo = new No();
	    novoNo.setValor(valor);
	    novoNo.setProx(null);
	    if(isEmpty() == true) {
	    	inicio = novoNo;
	    }else{
            No ultimo = inicio;
            while(ultimo.getProx()!=null){
                ultimo=ultimo.getProx();
            }
            ultimo.setProx(novoNo); 
        }
        quantidade++;
    }
    
    public void inserir(int posicao, Integer valor) {
    	if(!isEmpty()) {
			No novoNo = new No();
			novoNo.setValor(valor);
			novoNo.setProx(null);
			if(posicao>=0 && posicao<=quantidade) {
				No aux = inicio;
				No anterior = null;
				for(int i = 0; i < posicao; i++) {
					anterior = aux;
					aux = aux.getProx();
				}
				novoNo.setProx(aux);
				if(aux == inicio) {
					inicio = novoNo;
				}else {
					anterior.setProx(novoNo);
				}
				quantidade++;
			}else {
				System.out.println("Posição invalida!");
			}
    	}
    }
    
    public Integer remover(int posicao) {
    	return 0;
    }
    
    public void imprimir() {
    	No initshow = inicio;
    	String imprimirLista = "[";
		 if(isEmpty()){
	            System.out.println("Lista vazia");
	        }else{
	            imprimirLista += initshow.getValor() + ",";
	            while(initshow.getProx()!=null){
	            	//System.out.println(inicio.getProx());
	                initshow=initshow.getProx();
	                if(initshow.getProx() == null) {
	                	imprimirLista += initshow.getValor() + "]";
	                }else {
	                	imprimirLista += initshow.getValor()+ ",";
	                }
	            }
	        }  
		 System.out.println(imprimirLista);
		 initshow = null;
    }
    
}
