public class Main {
    public static void main(String[] args) {
        Pilha p1 = new PilhaEncadeada();
        System.out.println(p1.isEmpty());
        p1.push(9);
        p1.push(3);
        p1.push(5);
        p1.imprimir();
        
    }
}
