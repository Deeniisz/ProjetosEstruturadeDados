package pcadastro;

import java.text.ParseException;

public class PCadastro {

    public static void main(String[] args) throws ParseException {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Fabio");
        
        System.out.println(p1.getNome());
        System.out.println(p1.getCpf());
        
        //Pessoa p2 = new Pessoa("Joao Henrique", "123.456.789-00");
        Pessoa p2;
        
        p2 = new Pessoa();
        
        Empregado e1 = new Empregado();
        System.out.println(e1.getNome());
        System.out.println(e1.getSalario());
        
        Cliente c1 = new Cliente();
        System.out.println(c1.getNascimento());
    }
    
}
