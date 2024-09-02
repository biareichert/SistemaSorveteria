package eda;

public class Cliente extends Pessoa{
    private String cpf;
    private String email;
    
    public Cliente(int id,int codigo, String nome, String telefone, String cpf, String email){
        super(id,codigo, nome, telefone);
        this.cpf = cpf;
        this.email = email;
     
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
