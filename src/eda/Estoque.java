package eda;

public class Estoque {
    private int id;
    private int codigo;
    private int idSorvete;
    
    public Estoque(int id, int codigo, int idSorvete){
        this.id = id;
        this.codigo = codigo;
        this.idSorvete = idSorvete;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSorvete() {
        return idSorvete;
    }

    public void setIdSorvete(int idSorvete) {
        this.idSorvete = idSorvete;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
