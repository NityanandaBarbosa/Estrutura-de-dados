public class PilhaEncadeada implements Pilha {
    No topo = null;
    
    @Override
    public boolean isFull() {
        return false;//A pilha nunca vai está cheia
    }

    @Override
    public boolean isEmpty() {
        if(topo==null){
            return true;//ELA ESTÁ VAZIA
        }else{    
            return false;//ELA NÃO ESTÁ VAZIA
        }
    }

    @Override
    public void push(int valor) { //Ela nunca fica cheia
        No novoNo = new No(); //Cria uma caixa vazia e recebe um valor de endereço de memoria(um numero inteiro e um ponteiro para a proxima caixinha), ainda não está na pilha
        novoNo.setValor(valor); //Colocou a variavel digitada na posição valor da caixinha
        novoNo.setProx(topo); //Pegar o valor topo e joga detro do prox do NovoNo
        topo = novoNo; //O topo vira o endereço de memoria do NovoNo, ai a caixa entra na pilha 
    }

    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("Pilha está vazia");
            return 0;
        }else{
            int valorRetornado =  topo.getValor(); //Está pegando o valor da caixinha
            topo = topo.getProx(); //Está pegando a referencia da caixinha
            return valorRetornado; //
        }
    }
    
    public void imprimir() {
    	No impressao = topo; 
    	boolean fim = false;
    	while(fim != true){
    		if(impressao.getProx() == null) {
    			System.out.println(impressao.getValor());
    			fim = true;
    		}else{
    			System.out.println(impressao.getValor());
    			impressao = impressao.getProx();
    		}
			
			
        }
    }
    
}
