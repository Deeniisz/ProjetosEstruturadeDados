package p_listadinamicasimplesmenteencadeada;

public class Lista_Contato {
   static private Contato head, tail;

    public Lista_Contato() {
        head = tail =  null;
        System.out.println("Lista Criada com sucesso!");
    }
  
    private static boolean vazia()
    {
        if ((head==null)&&(tail==null))
            return true;
        else
            return false;
    }
    
    public static void print()
    {
        if(vazia())
            System.out.println("Lista de Contatos VAZIA!");
        else
        {
            Contato aux = head;
            System.out.println("Os dados dos contatos sao:");
            do
            {
                System.out.println(aux.toString());
                aux = aux.getProximo();
            }while(aux!=null);
        }
    }
    
    public static void push(Contato contato)
    {
        //Orderm alfabetica por nome
        if(vazia())
        {
            head = tail = contato;
        }
        else
        {
            //Se for antes do primeiro...
            if(head.getNome().compareTo(contato.getNome())>=0)
            {
                contato.setProximo(head);
                head = contato;
            }
        }
    }
    
}
