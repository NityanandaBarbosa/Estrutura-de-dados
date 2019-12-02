public class ListaOrdenadaEncadeada implements ListaInterface {
	No inicio = null;
	No ultimo = null;
	No fim = null;
    int quantidade = 0;
    
    public boolean isFull() {
    	return false;
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
        if(isEmpty() == true) {
            inicio = novoNo;
            fim = novoNo;
        }else {
            ultimo = inicio;
            No Aux = inicio;
            No Aux2 = inicio;
            boolean mudar = false;
            if (fim.getProx() == null && fim.getValor() < valor) {
                fim.setProx(novoNo);
                fim = novoNo;
                ultimo = fim.getProx();
            }else {
                while (ultimo.getProx() != null) {
                    if (ultimo.getValor() < valor && ultimo.getProx() != null) {
                        Aux = ultimo;
                        Aux2 = ultimo.getProx();
                        mudar = true;
                    }
                    ultimo = ultimo.getProx();
                }
                if (inicio.getValor() > valor) {
                    novoNo.setProx(inicio); 
                    inicio = novoNo;
                }
                if(mudar == true){
                    Aux.setProx(novoNo);
                    novoNo.setProx(Aux2);
                }
            }
        }
        quantidade++;
    }
        
    public Integer remover(int posicao) {
    	Integer retorno = null;
    	No Aux = null;
    	ultimo = inicio;
    	if(isEmpty() == true) {
    		System.out.println("Lista Vazia!!");
    	}else {
    		if(posicao >= quantidade) {
    			System.out.println("Posição invalida !!");
    		}else {
    			for(int i = 0; i < posicao-1; i++) {
    				ultimo = ultimo.getProx();
    			}
    			if(posicao == 0) {
					retorno = inicio.getValor();
					inicio = inicio.getProx();
				}else {
					Aux = ultimo.getProx();
	    			System.out.println(Aux.getValor());
	    			retorno = Aux.getValor();
	    			Aux = Aux.getProx();
	    			ultimo.setProx(Aux);	
				}
    			quantidade--;
    		}
    	}
    	return retorno;
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