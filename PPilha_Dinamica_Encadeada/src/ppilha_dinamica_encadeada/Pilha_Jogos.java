package ppilha_dinamica_encadeada;

public class Pilha_Jogos {
    static Jogo topo;
    
    
    Pilha_Jogos ()
    {
        topo = null;
        System.out.println("PILHA CRIADA!");
    }
    
    public static void push(Jogo jogo)
    {
        jogo.setAnterior(topo);
        topo = jogo;
    }
    
    public static void print()
    {
        if (topo == null)
            System.out.println("PILHA VAZIA!");
        else
        {
            Jogo aux = topo;
            
            do{
                System.out.println(aux.getId());
                System.out.println(aux.getNome());
                System.out.println(aux.getGenero());
                aux = aux.getAnterior();
            }while(aux != null);
        }
    }
    
    public static void pop()
    {
        if (topo == null)
            System.out.println("Pilha Vazia! Impossível Remover!");
        else
        {
            topo = topo.getAnterior();
            System.out.println("Elemento Removido!");
        }
    }
}
