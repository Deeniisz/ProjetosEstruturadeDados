package pfila_dinamica_encadeada;

public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private Carro proximo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Carro(String placa, String marca, String modelo, int ano, String cor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.proximo = null;
    }

    public Carro getProximo() {
        return proximo;
    }

    public void setProximo(Carro proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + '}';
    }
    
    
    
    
    
    
}
