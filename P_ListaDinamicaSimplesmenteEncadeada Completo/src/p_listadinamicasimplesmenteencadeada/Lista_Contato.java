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
    
    public static void push(Contato novo_contato)
    {
        //Orderm alfabetica por nome
        if(vazia())
        {
            head = tail = novo_contato;
        }
        else
        {
            //Se for antes do primeiro...
            if(head.getNome().compareTo(novo_contato.getNome())>=0)
            {
                novo_contato.setProximo(head);
                head = novo_contato;
            }
            else
            {   // Inserir após o último elemento
                if (tail.getNome().compareTo(novo_contato.getNome())<0)
                {
                    tail.setProximo(novo_contato);
                    tail = novo_contato;
                }
                else
                {
                    // No meio da Lista
                    Contato aux = head;
                    Contato ant;
                    do
                    {
                        ant = aux;
                        aux = aux.getProximo();
                        if(aux.getNome().compareTo(novo_contato.getNome())>=0)
                        {
                            ant.setProximo(novo_contato);
                            novo_contato.setProximo(aux);
                            break;
                        }
                    }while(true);
                }
            }
        }
    }
    
}
