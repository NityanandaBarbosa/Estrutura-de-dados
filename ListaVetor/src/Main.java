public class Main {
    public static void main(String[] args) {
        ListaVetor l1 = new ListaVetor(5);
        l1.inserir(55);
        l1.inserir(58);
        l1.inserir(2, 45);
        l1.imprimirLista();
        l1.get(2);
    }
}
