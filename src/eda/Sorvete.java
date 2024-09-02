package eda;

public class Sorvete {
    private int id;
    private int idForn;
    private String marca;
    private String sabor;
    private int quantidade;
    private String descricao;
    private double valor;
    private int codigo;
    
    public Sorvete(int id, int codigo,int idForn,String marca, String sabor, int quantidade, String descricao, double valor){
        this.id = id;
        this.idForn = idForn;
        this.codigo = codigo;
        this.marca = marca;
        this.sabor = sabor;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public int getIdForn() {
        return idForn;
    }

    public void setIdForn(int idForn) {
        this.idForn = idForn;
    }
}
