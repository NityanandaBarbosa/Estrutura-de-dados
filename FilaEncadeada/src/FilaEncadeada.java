public class FilaEncadeada {
	 No fim = null;
	 No inicio = null;
	 
	 public boolean isFull() {
		 return false;//A fila nunca vai está cheia
		 }

	 public boolean isEmpty() {
		 if(fim==null){
			 return true;//ELA ESTÁ VAZIA
		 }else{    
	            return false;//ELA NÃO ESTÁ VAZIA
		 }
	 }
	    
	 public void inserir(Integer valor) {
		 No novoNo = new No();//Cria um espaço na memoria(Instancia alguem na memoria)
	     novoNo.setValor(valor);//Coloco o valor na memoria
	     novoNo.setProx(null);//Inicializo o setProx como null
		 if(isEmpty()) {
			 fim = novoNo; 
			 inicio = novoNo;
		 }else {
			 fim.setProx(novoNo);//Primeiro linco o endereço de memoria do anterior com o proximo/Primeiro seto o proximo
	         fim=novoNo;
		 }		 
	 }
	 
	 public Integer remover() {
		 Integer aux=null;
		 if(isEmpty()) {
			 System.out.println("Fila está vazia !");
		 }else{ 
			 if(inicio.getProx()!=null){
				 aux = inicio.getValor();
	             inicio=inicio.getProx();
			 }
		 }
		 return aux;
	 }
	 
	 public void imprimir() {
		 No initshow = inicio;
		 if(isEmpty()){
	            System.out.println("Fila ta vazia");
	        }else{
	            System.out.println(initshow.getValor());
	            while(initshow.getProx()!=null){
	            	//System.out.println(inicio.getProx());
	                initshow=initshow.getProx();
	                System.out.println(initshow.getValor());
	            }
	        }  
		 System.out.println();
		 initshow = null;
	 }
}
