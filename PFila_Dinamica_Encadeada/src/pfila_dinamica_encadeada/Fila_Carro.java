package pfila_dinamica_encadeada;

public class Fila_Carro {
    static Carro head, tail;

    public Fila_Carro() {
        head = tail = null;
        System.out.println("Fila Criada com sucesso!");
    }

    public static void push(Carro carro){
        if (vazia())
        {
            head = tail = carro;
        }
        else
        {
            tail.setProximo(carro);
            tail = carro;
        }
    }
    
    private static boolean vazia()
    {
        if ( (head == null) && (tail==null) )
            return (true); //Esta vazia
        else
            return (false); // Existe algum elemento na fila
    }
    
    public static void print()
    {
        if (vazia())
        {
            System.out.println("Fila Vazia!");
        }
        else
        {
            Carro aux = head;
            do
            {
                System.out.println(aux.toString());
                aux = aux.getProximo();
            }while(aux!=null);
        }
    }
 
    public static void pop()
    {
        if (vazia())
        {
            System.out.println("Impossivel Remover! Fila Vazia!");
        }
        else
        {
            head = head.getProximo();
            System.out.println("Elemento Removido!");
            if (head == null)
                tail = null; //Fila ficou vazia
        }
    }
    
}
