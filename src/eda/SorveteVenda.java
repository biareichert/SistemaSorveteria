package eda;

public class SorveteVenda {
    private int id;
    private double valorTotal;
    private int quantidade;
    private Venda idVenda;
    private Sorvete idSorvete;
    
    public SorveteVenda(int id, double valorTotal, int quantidade, Venda idVenda, Sorvete idSorvete){
        this.id = id;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
        this.idSorvete = idSorvete;
        this.idVenda = idVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda idVenda) {
        this.idVenda = idVenda;
    }

    public Sorvete getIdSorvete() {
        return idSorvete;
    }

    public void setIdSorvete(Sorvete idSorvete) {
        this.idSorvete = idSorvete;
    }
        
}
