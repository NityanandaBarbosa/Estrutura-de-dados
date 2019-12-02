public class ListaDuplamenteEncadeada implements ListaInterface{
	No inicio = null;
	No imprimirInverso = null;
	No ultimo = null;
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
    			System.out.println("Busca = True");
    			return true;
    		}else {
    			Aux = Aux.getProx();
    		}
    	}
    	System.out.println("Busca = False");
    	return false;
    }
    
    public Integer get(int posicao) {
    	No Aux = inicio;
    	if(posicao < quantidade && posicao >=0) {
    		for(int i = 0; i < posicao; i++) {
    			if(posicao == 0) {
    				System.out.println(Aux.getValor());
    	    		return Aux.getValor();
    			}else {
    				Aux = Aux.getProx();
        			System.out.println(Aux.getValor() + "  " + i);
    			}
    		}
    		System.out.println(Aux.getValor());
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
	    	imprimirInverso = novoNo;
	    }else{
	    	  imprimirInverso.setProx(novoNo);
	    	  novoNo.setAnterior(imprimirInverso);
	    	  imprimirInverso = novoNo;
        }
        quantidade++;
    }
    
    public void inserir(int posicao, Integer valor) {
    	if(!isEmpty()) {
			No novoNo = new No();
			novoNo.setValor(valor);
			novoNo.setProx(null);
			if(posicao>=0 && posicao<=quantidade) {
				ultimo = inicio;
				No aux = inicio;
				for(int i = 0; i < posicao; i++) {
					ultimo = ultimo.getProx();
					aux = ultimo.getProx();
				}
				if(aux == inicio) {
					novoNo.setProx(ultimo);
					inicio = novoNo;
				}else {
					if(ultimo == imprimirInverso) {
						ultimo.setProx(novoNo);
						novoNo.setAnterior(ultimo);
					}else {
						novoNo.setProx(aux);
						novoNo.setAnterior(ultimo);
						aux.setAnterior(novoNo);
						ultimo.setProx(novoNo);
					}
				}
				while(ultimo.getProx() != null) {
					ultimo = ultimo.getProx();
				}
				imprimirInverso = ultimo;
				quantidade++;
			}else {
				System.out.println("Posição invalida!");
			}
    	}
    }
    
    public Integer remover(int posicao) {
    	Integer retorno = null;
        No Aux = null;
        ultimo = inicio;
        if(isEmpty() == true) {
            System.out.println("Lista Vazia!!");
        }else {
            if(posicao >= quantidade || posicao < 0) {
                System.out.println("Posição invalida !!");
            }else {
                for(int i = 0; i < posicao-1; i++) {
                        ultimo = ultimo.getProx();
                }
                if(posicao > 0 && posicao <= quantidade){
                    Aux = ultimo.getProx();
                    System.out.println(Aux.getValor());
                    retorno = Aux.getValor();
                    if(Aux.getProx() == null){
                        ultimo.setProx(null);
                        imprimirInverso = ultimo;
                    }else {
                        Aux = Aux.getProx();
                        ultimo.setProx(Aux);
                        Aux.setAnterior(ultimo);
                        while(Aux.getProx() != null){
                            Aux = Aux.getProx();
                        }
                        imprimirInverso = Aux;
                    }
                }if(posicao == 0){
                    retorno = inicio.getValor();
                    inicio = inicio.getProx();
                    inicio.setAnterior(null);
                    Aux = inicio;
                    while(Aux.getProx() != null){
                        Aux = Aux.getProx();
                    }
                    imprimirInverso = Aux;
                }
                quantidade--;
            }
        }
        return retorno;
    }
        
    public void imprimir() { //
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
    
    public void imprimirInverso() {
    	String imprimirLista = "[";
    	imprimirLista += imprimirInverso.getValor() + ",";
    	while(imprimirInverso.getAnterior() !=null){
            imprimirInverso=imprimirInverso.getAnterior();
            if(imprimirInverso.getAnterior() == null) {
            	imprimirLista += imprimirInverso.getValor() + "]";
            }else {
            	imprimirLista += imprimirInverso.getValor()+ ",";
            }
        }
    	System.out.println(imprimirLista);
    }  
    
}
