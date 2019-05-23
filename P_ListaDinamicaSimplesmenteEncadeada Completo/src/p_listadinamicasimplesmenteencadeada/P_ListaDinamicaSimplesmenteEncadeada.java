package p_listadinamicasimplesmenteencadeada;

public class P_ListaDinamicaSimplesmenteEncadeada {

    public static void main(String[] args) {
        Lista_Contato minha_lista = new Lista_Contato();
        Contato c1 = new Contato("Fabio", 190);
        minha_lista.push(c1);
        Contato c2 = new Contato("Bruna", 3332);
        minha_lista.push(c2);
        Contato c3 = new Contato("Carla", 9999);
        minha_lista.push(c3);
        minha_lista.push(new Contato("Diego", 8888));
        minha_lista.push(new Contato("Zulma", 9873));
        minha_lista.print();
    }
    
}
