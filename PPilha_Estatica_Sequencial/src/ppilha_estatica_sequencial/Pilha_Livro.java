package ppilha_estatica_sequencial;

public class Pilha_Livro {
    static int topo;
    static Livro elementos[] = new Livro[6];

    public Pilha_Livro() {
        topo = -1;
        for(int i=0; i< elementos.length;i++)
            elementos[i]=null;
        System.out.println("Pilha Criada com sucesso!");
    }
    
    private static boolean vazia()
    {
        if (topo==-1)
            return true;
        else
            return false;
    }
    
    private static boolean cheia()
    {
        if (topo == elementos.length -1)
            return true;
        else
            return false;
    }
    
    public static void push(Livro livro)
    {
        //if (cheia())
        //{
        //    System.out.println("Impossivel Inserir, Pilha Cheia!");
        //}
        //else
        //{
        //    topo++;
        //    elementos[topo]=livro;
        //}
        if (cheia())
            System.out.println("Impossivel Inserir, Pilha Cheia!");
        else
            elementos[++topo]=livro;
    }
    
    public static void print()
    {
        if (vazia())
        {
            System.out.println("Pilha Vazia!");
        }
        else
        {
            System.out.println("Os Elementos da Pilha são:");
            for (int i=0; i<=topo; i++)
            System.out.println(elementos[i]);
            
            //for(Livro livro : elementos)
            //    System.out.println(livro);
        }
    }
    
    public static void pop()
    {
        if (vazia())
            System.out.println("Impossivel remover, Pilha Vazia!");
        else
        {
            elementos[topo]=null;
            topo--;
            System.out.println("Elemento Removido!");
        }
    }
}
