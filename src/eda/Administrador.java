package eda;

public class Administrador extends Pessoa{
    private int idade;
    private int login;
    private int senha;
    
    public Administrador(int id, int codigo, String nome, int idade, String telefone, int login, int senha){
        super(id, codigo,nome, telefone);
        this.idade = idade;
        this.login = login;
        this.senha = senha;
      
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
