package eda;

public class Fornecedor extends Pessoa{
    private Endereco endereco;
    
    public Fornecedor(int id,int codigo, String nome, String telefone, Endereco endereco){
        super(id,codigo, nome, telefone);
        this.endereco = endereco;     
        
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}

