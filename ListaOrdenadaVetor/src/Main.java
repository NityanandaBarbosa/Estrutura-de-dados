public class Main {
    public static void main(String[] args) {
        ListaOrdenadaVetor l1 = new ListaOrdenadaVetor(5);
        l1.inserir(1);
        l1.imprimirLista();
        l1.inserir(56);
        l1.inserir(11);
        l1.inserir(10);
        l1.imprimirLista();
        l1.remover(2);
        l1.inserir(0);
        l1.size();
        l1.imprimirLista();
        
    }
}
