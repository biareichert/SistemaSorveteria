package eda;

public class Funcionario extends Pessoa{
    private int idade;
    private String login;
    private String senha;
    private double salario;
    
    public Funcionario(int id, int codigo, String nome, String telefone, int idade, String login, String senha, double salario){
        super(id, codigo, nome, telefone);
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
