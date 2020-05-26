package Classes;

public class Enfermaria {

    
    private String codigo;
    private String tipo;
    private int nCamas;
    
   
    public Enfermaria() {
    }
    
    public Enfermaria(String codigo, String tipo, int nCamas) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nCamas = nCamas;
    }
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setnCamas(int nCamas) {
        this.nCamas = nCamas;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getnCamas() {
        return nCamas;
    }
    
}
