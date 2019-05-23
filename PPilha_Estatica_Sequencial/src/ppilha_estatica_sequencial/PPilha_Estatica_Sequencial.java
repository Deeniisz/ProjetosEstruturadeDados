package ppilha_estatica_sequencial;

public class PPilha_Estatica_Sequencial {

    public static void main(String[] args) {
        Pilha_Livro mpl = new Pilha_Livro();
        
        mpl.print();
        
        Livro livro1 = new Livro("Poeira em alto mar", "Morcego", 0);
        mpl.push(livro1);
        
        System.out.println(livro1);
        mpl.print();
        
        Livro livro2 = new Livro("abc", "joao", 123);
        System.out.println(livro2);
    }
    
}
