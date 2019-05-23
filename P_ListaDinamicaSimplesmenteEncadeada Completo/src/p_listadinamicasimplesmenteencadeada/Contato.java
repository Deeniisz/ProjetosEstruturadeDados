package p_listadinamicasimplesmenteencadeada;

public class Contato {
    private String nome;
    private int telefone;
    private Contato proximo;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }

    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }
    
    
    
}
