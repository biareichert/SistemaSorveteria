package dao;

import eda.*;
import java.util.ArrayList;

public interface DAOInterface {
    
    public Administrador getAdministrador(int login, int senha);
    public Funcionario getFuncionario(String login, String senha);
    public int Indice(String linha);
    public boolean cadastrarSorvete(Sorvete s);
    public boolean cadastrarAdm(Administrador a);
    public boolean cadastrarCliente(Cliente c);
    public boolean cadastrarFornecedor(Fornecedor f);
    public boolean cadastrarFuncionario(Funcionario f);
    public Fornecedor validarIdFornecedor(int id);
    public Sorvete validarSorvete(int cod);
    public Administrador validarAdm(int cod);
    public Funcionario validarFuncionario(int cod);
    public Cliente validarCliente(int cod);
    public boolean excluirSorvete(int cod);
    public boolean excluirAdm(int cod);
    public boolean excluirCliente(int cod);
    public boolean excluirFornecedor(int cod);
    public boolean excluirFunc(int cod);
    public ArrayList<Sorvete> listaSorvetes();
    public ArrayList<Administrador> listaAdm();
    public ArrayList<Cliente> listaCliente();
    public ArrayList<Fornecedor> listaFornecedor();
    public ArrayList<Funcionario> listaFuncionarios();
    public void addVenda(Venda v);
    public void atualizarVenda(int q, Sorvete s);
    public void save();
    
}
