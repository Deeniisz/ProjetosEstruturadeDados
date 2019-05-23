package pfila_dinamica_encadeada;

public class PFila_Dinamica_Encadeada {

    public static void main(String[] args) {
        Fila_Carro minha_fila = new Fila_Carro();
        minha_fila.print();
        //String placa, String marca, String modelo, int ano, String cor
        Carro c1 = new Carro("ABC1234", "VW", "PASSAT", 2019, "BRANCA");
        minha_fila.push(c1);
         c1 = new Carro("XYZ9999", "BMW", "740", 2019, "BRANCA");
        minha_fila.push(c1);
        minha_fila.print();
        minha_fila.pop();
        minha_fila.print();
        minha_fila.pop();
        minha_fila.print();
        minha_fila.pop();
    }
    
}
