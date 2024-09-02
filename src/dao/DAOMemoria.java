package dao;

import eda.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOMemoria implements DAOInterface{
    static DAOMemoria instancia = null;
    
    ArrayList<Administrador> administrador = new ArrayList<>();
    ArrayList<Cliente> cliente = new ArrayList<>();
    ArrayList<Estoque> estoque = new ArrayList<>();
    ArrayList<Fornecedor> fornecedor = new ArrayList<>();
    ArrayList<Funcionario> funcionario = new ArrayList<>();
    ArrayList<Sorvete> sorvete = new ArrayList<>();
    ArrayList<SorveteVenda> sorveteVenda = new ArrayList<>();
    ArrayList<Venda> venda = new ArrayList<>();
       
    private DAOMemoria() throws FileNotFoundException, IOException{
        init();
    }
     
    public static DAOMemoria getInstance() {
        try{
            if( instancia==null ){
                instancia = new DAOMemoria();
                return instancia;
            }
                
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return instancia;
    }
    
    /**
     * Este método lê todos os dados do arquivo e armazena em ArrayLists.
     * @throws IOException 
     */
    private void init() throws IOException{
        //Id = 1 para administrador, 2 - para cliente, 3 - para estoque, 4 - para fornecedor
        //5 - para sorvete, 6 - para venda e 7 - para funcionario
        try{
            FileInputStream input = new FileInputStream("C:\\Users\\beatr\\Desktop\\arquivo.txt");
            InputStreamReader reader = new InputStreamReader( input );
            BufferedReader in = new BufferedReader( reader );
            String linha; 
            Endereco end;
            int id, idForn;
            Pagamento tipo = null;
            String nome, telefone,cpf,email, rua, bairro,marca,sabor, descricao,data,l,s;
            int codigo,idade, login, senha,idSorvete,numero,quantidade,idFunc, idCliente;
            double valor,salario;
            
            while( in.ready() ){   
                linha = in.readLine();
                id = (Integer.parseInt(linha));
                
                if(id == 1){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    nome = in.readLine();
                    linha = in.readLine();
                    idade = (Integer.parseInt(linha));
                    telefone = in.readLine();
                    linha = in.readLine();
                    login = (Integer.parseInt(linha));
                    linha = in.readLine();
                    senha = (Integer.parseInt(linha));
                    Administrador a = new Administrador(id,codigo,nome,idade,telefone,login,senha);
                    administrador.add(a);
                    
                } 
                if(id == 2){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    nome = in.readLine();
                    cpf = in.readLine();
                    email = in.readLine();
                    telefone = in.readLine();
                    Cliente c = new Cliente(id,codigo, nome, telefone,cpf,email);
                    cliente.add(c);
                }
                if(id == 3){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    linha = in.readLine();
                    idSorvete = (Integer.parseInt(linha));
                    Estoque est = new Estoque(id,codigo, idSorvete);
                    estoque.add(est);
                }
                if(id == 4){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    nome = in.readLine();
                    telefone = in.readLine();
                    rua = in.readLine();
                    bairro = in.readLine();
                    linha = in.readLine();
                    numero = Integer.parseInt(linha);
                    end = new Endereco(rua,bairro,numero);
                    Fornecedor f = new Fornecedor(id,codigo, nome, telefone, end);
                    fornecedor.add(f);
                    
                }
                if(id == 5){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    linha = in.readLine();
                    idForn = (Integer.parseInt(linha));
                    marca = in.readLine();
                    sabor = in.readLine();
                    linha = in.readLine();
                    quantidade = Integer.parseInt(linha);
                    descricao = in.readLine();
                    linha = in.readLine();
                    valor = Double.parseDouble(linha);
                    Sorvete sv = new Sorvete(id,codigo,idForn,marca,sabor,quantidade,descricao,valor);
                    sorvete.add(sv);
                }
                if(id == 6){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    linha = in.readLine();
                    idFunc = Integer.parseInt(linha);
                    data = in.readLine();
                    linha = in.readLine();
                    idCliente = Integer.parseInt(linha);
                    linha = in.readLine();
                    int x = Indice(linha);
            
                    switch(x){
                        case 1:
                            tipo = Pagamento.CARTAO;
                            break;
                        case 2:
                            tipo = Pagamento.DINHEIRO;
                            break;
                        case 3:
                            tipo = Pagamento.CHEQUE;
                            break;
                    }
                    linha = in.readLine();
                    int q = Integer.parseInt(linha);
                    Venda v = new Venda(id,codigo, idFunc, data, idCliente, tipo,q);
                    venda.add(v);
                }
                if(id == 7){
                    linha = in.readLine();
                    codigo = (Integer.parseInt(linha));
                    nome = in.readLine();
                    linha = in.readLine();
                    idade = Integer.parseInt(linha);
                    telefone = in.readLine();
                    l = in.readLine();
                    s = in.readLine();
                    linha = in.readLine();
                    salario = Double.parseDouble(linha);
                    Funcionario fu = new Funcionario(id,codigo,nome,telefone,idade,l,s,salario);
                    funcionario.add(fu);
                }
                if(id == 0){
                    break;
                }
            }

            in.close();    
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);   
        }
    }
    
    /**
     * Este método salva todos os dados dos ArrayLists para o arquivo.
     */
    @Override
    public void save() {
        File arquivo = new File("C:\\Users\\beatr\\Desktop\\arquivo.txt");
        FileOutputStream output = null;
        
        try {
            output = new FileOutputStream(arquivo, false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Administrador a : administrador){
            String salvar =  1 + "\r\n" + a.getCodigo() + "\r\n" + a.getNome() +"\r\n" + a.getIdade()+
                    "\r\n" + a.getTelefone()+"\r\n"+a.getLogin()+"\r\n"+a.getSenha()+"\r\n" ;
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(Cliente a : cliente){
            String salvar = 2 + "\r\n" + a.getCodigo() + "\r\n" + a.getNome() +"\r\n" + a.getCpf()+
                    "\r\n" + a.getEmail()+"\r\n"+a.getTelefone()+"\r\n" ;
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(Estoque a : estoque){
            String salvar = 3 + "\r\n" + a.getCodigo() + "\r\n" + a.getIdSorvete()+"\r\n";
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(Fornecedor a : fornecedor){
            String salvar = 4 + "\r\n" + a.getCodigo() + "\r\n" + a.getNome() +"\r\n" + a.getTelefone()+
                    "\r\n" + a.getEndereco().getRua()+"\r\n"+a.getEndereco().getBairro()+"\r\n"+a.getEndereco().getNumero()+"\r\n";
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(Sorvete a : sorvete){
            String salvar = 5 + "\r\n" + a.getCodigo() + "\r\n" + a.getIdForn() +"\r\n" + a.getMarca()+
                    "\r\n" + a.getSabor()+"\r\n"+a.getQuantidade()+"\r\n"+a.getDescricao()+"\r\n"+a.getValor()+"\r\n";
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(Venda a : venda){
            String salvar = 6 + "\r\n" + a.getCodigo() + "\r\n" + a.getIdFunc() +"\r\n" + a.getData()+
                    "\r\n" + a.getIdCliente()+"\r\n"+a.getTipo()+"\r\n"+a.getQuantidade()+"\r\n";
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(Funcionario a : funcionario){
            String salvar = 7 + "\r\n" + a.getCodigo() + "\r\n" + a.getNome() +"\r\n" + a.getIdade()+
                    "\r\n" + a.getTelefone()+"\r\n"+a.getLogin()+"\r\n"+a.getSenha()+"\r\n";
            
            try {
                output.write(salvar.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String salvar = ""+0;
        try {
            output.write(salvar.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(DAOMemoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    /**
     * Este método verifica o que está escrito no arquivo é Cartão, Dinheiro ou Cheque
     * @param linha string que é lida do arquivo.
     * @return 1 para cartao, 2 para dinheiro e 3 para cheque.
     */
    @Override
    public int Indice(String linha){
        switch(linha){
            case "CARTAO":
                return 1;
            case "DINHEIRO":
                return 2;
            case "CHEQUE":
                return 3;
           
            default:
                return 0;
        }
    }

    /**
     * Este método valida se o login e a senha do administrador estão corretos, ou seja, estão no arrayList.
     * @param login
     * @param senha
     * @return a conta do administrador.
     */
    @Override
    public Administrador getAdministrador(int login, int senha) {
        for(Administrador a : administrador){
            if(a.getLogin() == login && a.getSenha() == senha){
                return a;
            }
                
        }
        return null;
    }

    /**
     * Este método valida se o login e a senha do funcionário estão corretos, ou seja, estão no arrayList.
     * @param login
     * @param senha
     * @return a conta do funcionário.
     */
    @Override
    public Funcionario getFuncionario(String login, String senha) {
        for(Funcionario f : funcionario){
            if(f.getLogin().equals(login) && f.getSenha().equals(senha))
                return f;
        }
        return null;
    }

    /**
     * Este método adiciona o sorvete no ArrayList.
     * @param s
     * @return true porque deu certo.
     */
    @Override
    public boolean cadastrarSorvete(Sorvete s) {
       sorvete.add(s);
       return true;
        
    }

    /**
     * Este método verifica se o código do fornecedor está certo, ou seja, está no arrayList.
     * @param id
     * @return null se não existe, caso contrário retorna o fornecedor.
     */
    @Override
    public Fornecedor validarIdFornecedor(int id) {
        for(Fornecedor f : fornecedor){
            if(f.getCodigo() == id){
                return f;
            }
        }
        return null;
    }

    /**
     * Este método verifica se o código do sorvete está certo, ou seja, está no arrayList.
     * @param cod
     * @return null se não existe, caso contrário retorna o sorvete.
     */
    @Override
    public Sorvete validarSorvete(int cod) {
        for(Sorvete s : sorvete){
            if(s.getCodigo() == cod){
                return s;
            }
        }
        return null;
    }
    

    /**
     * Este método procura no arraylist o sorvete e exclui o sorvete do arrayList.
     * @param cod
     * @return true se deu certo.
     */
    @Override
    public boolean excluirSorvete(int cod) {
        for(Sorvete s : sorvete){
            if(s.getCodigo() == cod){
                sorvete.remove(s);
                return true;
            }
        }
     
        return false;
    }

    /**
     * Este método adiciona o administrador no arrayList.
     * @param a
     * @return true porque deu certo.
     */
    @Override
    public boolean cadastrarAdm(Administrador a) {
        administrador.add(a);
        return true;
    }

    /**
     * Este método adiciona o cliente no arrayList.
     * @param c
     * @return true porque deu certo.
     */
    @Override
    public boolean cadastrarCliente(Cliente c) {
        cliente.add(c);
        return true;
    }

    /**
     * Este método adiciona o fornecedor no arrayList.
     * @param f
     * @return true porque deu certo.
     */
    @Override
    public boolean cadastrarFornecedor(Fornecedor f) {
        fornecedor.add(f);
        return true;
    }

    /**
     * Este método adiciona o funcionário no arrayList.
     * @param f
     * @return true porque deu certo.
     */
    @Override
    public boolean cadastrarFuncionario(Funcionario f) {
        funcionario.add(f);
        return true;
    }

    /**
     *
     * @return o arrayList de sorvetes. 
     */
    @Override
    public ArrayList<Sorvete> listaSorvetes() {
        return sorvete;
    }

    /**
     * Este método verifica se o código do funcionário está certo, ou seja, está no arrayList.
     * @param cod
     * @return null se não existe, caso contrário retorna o funcionário.
     */
    @Override
    public Funcionario validarFuncionario(int cod) {
        for(Funcionario s : funcionario){
            if(s.getCodigo() == cod){
                return s;
            }
        }
        return null;
    }

    /**
     * Este método verifica se o código do cliente está certo, ou seja, está no arrayList.
     * @param cod
     * @return null se não existe, caso contrário retorna o cliente.
     */
    @Override
    public Cliente validarCliente(int cod) {
        for(Cliente s : cliente){
            if(s.getCodigo() == cod){
                return s;
            }
        }
        return null;
    }

    /**
     * Este método adiciona a venda no arrayList.
     * @param v 
     */
    @Override
    public void addVenda(Venda v) {
        venda.add(v);
    }

    /**
     * Este método verifica se o código do Administrador está certo, ou seja, está no arrayList.
     * @param cod
     * @return null se não existe, caso contrário retorna o administrador.
     */
    @Override
    public Administrador validarAdm(int cod) {
        for(Administrador a : administrador){
            if(a.getCodigo() == cod){
                return a;
            }
        }
        return null;
    }

    /**
     * 
     * @return o arrayList do administrador.
     */
    @Override
    public ArrayList<Administrador> listaAdm() {
        return administrador;
    }

    /**
     * Este método verifica se o código do administrador está corrreto, se sim, o administrador é removido do arrayList.
     * @param cod
     * @return true se deu certo.
     */
    @Override
    public boolean excluirAdm(int cod) {
        for(Administrador a : administrador){
            if(a.getCodigo() == cod){
                administrador.remove(a);
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @return o arrayList de clientes. 
     */
    @Override
    public ArrayList<Cliente> listaCliente() {
        return cliente;
    }

    /**
     * Este método verifica se o código do cliente existe no arrayList, se sim, o cliente é removido do arrayList.
     * @param cod
     * @return true se deu certo.
     */
    @Override
    public boolean excluirCliente(int cod) {
        for(Cliente c : cliente){
            if(c.getCodigo() == cod){
                cliente.remove(c);
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @return o arrayList dos fornecedores. 
     */
    @Override
    public ArrayList<Fornecedor> listaFornecedor() {
        return fornecedor;
    }

    /**
     * Esté método verifica se o código do fornecedor existe no arrayList, se sim, o fornecedor é excluido do arrayList.
     * @param cod
     * @return  true se deu certo.
     */
    @Override
    public boolean excluirFornecedor(int cod) {
        for(Fornecedor f : fornecedor){
            if(f.getCodigo() == cod){
                fornecedor.remove(f);
                return true;
            }
        }
        return false;
    }
    

    /**
     * 
     * @return o arrayList de funcionarios. 
     */
    @Override
    public ArrayList<Funcionario> listaFuncionarios() {
        return funcionario;
    }
    

    /**
     * Este método verifica se o código co funcionario existe no arrayList, se sim, o funcioário é excluido do arrayList.
     * @param cod
     * @return true se deu certo.
     */
    @Override
    public boolean excluirFunc(int cod) {
        for(Funcionario f : funcionario){
            if(f.getCodigo() == cod){
                funcionario.remove(f);
                return true;
            }
        }
        return false;
    }

    /**
     * Este método atualiza a quantidade de sorvetes.
     * @param q
     * @param s 
     */
    @Override
    public void atualizarVenda(int q, Sorvete s) {
        int total;
        total = s.getQuantidade() - q;
        s.setQuantidade(total);
    }
    
   
  
}


