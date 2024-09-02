package negocio;

import dao.*;
import eda.*;
import java.util.ArrayList;

public class NegocioFacade {
    static DAOInterface DAO = DAOMemoria.getInstance();
    
    public static Administrador validarConta(int login, int senha){
        Administrador ad = DAO.getAdministrador( login, senha );
        return ad;   
    }
    
    public static Funcionario validarConta(String login, String senha){
        Funcionario f = DAO.getFuncionario(login, senha);
        return f;
    }
    
    public static boolean cadastrar(Sorvete s){
        boolean i = DAO.cadastrarSorvete(s);
        return i;
    }
    
    public static boolean cadastrar(Administrador a){
        boolean i = DAO.cadastrarAdm(a);
        return i;
    }
    
    public static boolean cadastrar(Fornecedor f){
        boolean i = DAO.cadastrarFornecedor(f);
        return i;
    }
    
    public static Fornecedor validarIdFornecedor(int id){
        Fornecedor i = DAO.validarIdFornecedor( id);
        return i;
    }
    
    public static Sorvete validarSorvete(int cod){
        Sorvete s = DAO.validarSorvete(cod);
        return s;
    }
    
    public static boolean excluirSorvete(int cod){
        boolean i = DAO.excluirSorvete(cod);
        return i;
    }
    
    public static boolean excluirAdm(int cod){
        boolean i = DAO.excluirAdm(cod);
        return i;
    }
    
    public static boolean excluirCliente(int cod){
        boolean i = DAO.excluirCliente(cod);
        return i;
    }
    
    public static boolean excluirFornecedor(int cod){
        boolean i = DAO.excluirFornecedor(cod);
        return i;
    }
    
    public static boolean excluirFunc(int cod){
        boolean i = DAO.excluirFunc(cod);
        return i;
    }
    
    public static boolean cadastrar(Cliente c){
        boolean i = DAO.cadastrarCliente(c);
        return i;
    }
    
    
    public static boolean cadastrar(Funcionario f){
        boolean i = DAO.cadastrarFuncionario(f);
        return i;
    }
    
    public static ArrayList<Sorvete> listaSorvetes(){
        ArrayList<Sorvete> sorvetes = DAO.listaSorvetes();
        return sorvetes;
    }
    
    public static ArrayList<Administrador> listaAdm(){
        ArrayList<Administrador> adm = DAO.listaAdm();
        return adm;
    }
    
    public static ArrayList<Cliente> listaCliente(){
        ArrayList<Cliente> cliente = DAO.listaCliente();
        return cliente;
    }
    
    public static ArrayList<Fornecedor> listaFornecedor(){
        ArrayList<Fornecedor> fornecedor = DAO.listaFornecedor();
        return fornecedor;
    }
    
    public static ArrayList<Funcionario> listaFuncionarios(){
        ArrayList<Funcionario> f = DAO.listaFuncionarios();
        return f;
    }
    
    public static Funcionario validarFuncionario(int cod){
        Funcionario s = DAO.validarFuncionario(cod);
        return s;
    }
    
    public static Cliente validarCliente(int cod){
        Cliente s = DAO.validarCliente(cod);
        return s;
    }
    
    public static Administrador validarAdministrador(int cod){
        Administrador a = DAO.validarAdm(cod);
        return a;
    }
    
    public static void atualizarQuantidade(int q, Sorvete s){
        DAO.atualizarVenda(q,s);
       
    }
    
    public static void addVenda(Venda v){
        DAO.addVenda(v);
    }
    
    public static void salvar(){
        DAO.save();
    }
}
