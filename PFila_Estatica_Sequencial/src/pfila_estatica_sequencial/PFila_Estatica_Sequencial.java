package pfila_estatica_sequencial;

public class PFila_Estatica_Sequencial {

    public static void main(String[] args) {
        Fila_Pessoa mfp = new Fila_Pessoa();
        mfp.pop();
        mfp.print();
        Pessoa p1 = new Pessoa("Fabio","123.456.789-00", 'M');
        mfp.push(p1);
        mfp.print();
        mfp.pop();
        mfp.print();

    }
    
}
