package p_listadinamicasimplesmenteencadeada;

public class P_ListaDinamicaSimplesmenteEncadeada {

    public static void main(String[] args) {
        Lista_Contato minha_lista = new Lista_Contato();
        Contato c1 = new Contato("Fabio", 190);
        minha_lista.push(c1);
        Contato c2 = new Contato("Daniela", 193);
        minha_lista.push(c2);
        Contato c3 = new Contato("Bruna", 911);
        minha_lista.push(c3);
        minha_lista.print();
    }
    
}
