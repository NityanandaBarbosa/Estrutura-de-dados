public interface Pilha {
    public boolean isFull();
    public boolean isEmpty();
    public void push(int valor); //Empilhar
    public int pop(); //Deseempilhar
    public void imprimir();
}