package eda;

public class Venda {
    private int idFunc;
    private int id;
    private String data;
    private int idCliente;
    private Pagamento tipo;
    private int codigo;
    private int quantidade;
    
    public Venda(int id, int codigo, int idFunc, String data, int idCliente,  Pagamento tipo, int quantidade){
        this.id = id;
        this.idFunc = idFunc;
        this.data = data;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public Pagamento getTipo() {
        return tipo;
    }

    public void setTipo(Pagamento tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
