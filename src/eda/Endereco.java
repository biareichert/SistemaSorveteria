package eda;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
        
    public Endereco(String rua, String bairro, int numero){
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
       
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
