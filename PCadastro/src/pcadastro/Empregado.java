package pcadastro;

public class Empregado extends Pessoa{
    private double salario;

    public Empregado() {
        salario = 0.0;
    }

    public Empregado(double salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
