public class ListaDuplamenteEncadeadaOrdenada implements ListaInterface{
    No inicio = null;
    No ultimo = null;
    No imprimirInverso = null;
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
        No Aux = inicio;
        if (posicao < quantidade && posicao >= 0) {
            for (int i = 0; i < posicao; i++) {
                if (posicao == 0) {
                    System.out.println(Aux.getValor());
                    return Aux.getValor();
                } else {
                    Aux = Aux.getProx();
                    System.out.println(Aux.getValor() + "  " + i);
                }
            }
            System.out.println(Aux.getValor());
            return Aux.getValor();
        } else {
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
        }else {
            ultimo = inicio;
            No Aux = inicio;
            No Aux2 = inicio;
            boolean mudar = false;
            if (imprimirInverso.getProx() == null && imprimirInverso.getValor() < valor) {
                imprimirInverso.setProx(novoNo);
                novoNo.setAnterior(imprimirInverso);
                imprimirInverso = novoNo;
                ultimo = imprimirInverso.getProx();
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
                    inicio.setAnterior(novoNo);
                    inicio = novoNo;
                }
                if(mudar == true){
                    Aux.setProx(novoNo);
                    novoNo.setAnterior(Aux);
                    novoNo.setProx(Aux2);
                    Aux2.setAnterior(novoNo);
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

    public void imprimir() {
        No initshow = inicio;
        String imprimirLista = "[";
        if(isEmpty()){
            System.out.println("Lista vazia");
        }else{
            imprimirLista += initshow.getValor() + ",";
            while(initshow.getProx()!=null){
                initshow=initshow.getProx();
                if(initshow.getProx() == null) {
                    imprimirLista += initshow.getValor() + "]";
                }else {
                    imprimirLista += initshow.getValor()+ ",";
                }
            }
        }
        System.out.println(imprimirLista);
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
