package pfila_estatica_sequencial;

public class Fila_Pessoa {
    static int head, tail;
    static Pessoa elementos[]= new Pessoa[6];

    public Fila_Pessoa() {
        this.head = -1;
        this.tail = -1;
        System.out.println("Fila Criada com sucesso!");
    }
    
    private static boolean vazia()
    {
        if ( (head==-1) && (tail==-1))
            return true;
        else 
            return false; 
    }
    
    private static boolean cheia()
    {
        if (tail == elementos.length-1)
            return true;
        else
            return false;
    }
    
    public static void push(Pessoa p)
    {
        if (cheia())
        {
            System.out.println("Fila Cheia!");
        }
        else
        {
            if (vazia())
                head=tail=0;
            else
                tail++;
            elementos[tail]=p;
        }
    }
    
    public static void print()
    {
        if (vazia())
        {   
            System.out.println("Fila Vazia!");
        }
        else
        {
            System.out.println("Os elementos sao:\n");
            for(int i=0; i<= tail; i++)
                System.out.println(elementos[i].toString()); 
        }
    }
    
    public static void pop()
    {
        if (vazia())
        {
            System.out.println("Impossivel Remover, Fila Vazia!");
        }
        else
        {
            for(int i=0 ; i<tail ; i++)
                elementos[i]=elementos[i+1];
            elementos[tail]=null;
            tail--;
            if (tail == -1)
                head = -1;
            System.out.println("Elemento Removido!");
        }
    }
}
