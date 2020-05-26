package Classes;


public class Equipamento {
    
    private String codigo;
    private String enfermaria;
    private String tipo;
    private boolean ocupacao;
    private String cod_doente;
    
    
    public Equipamento(){
    }

    public Equipamento(String codigo,String tipo, String enfermaria) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.enfermaria = enfermaria;
        this.ocupacao = false;
        this.cod_doente = null;
    }

    

    public void setCod_doente(String cod_doente) {
        this.cod_doente = cod_doente;
    }
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }

    public void setOcupacao(boolean ocupacao) {
        this.ocupacao = ocupacao;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEnfermaria() {
        return enfermaria;
    }

    public boolean getOcupacao() {
        return ocupacao;
    }
    public String getCod_doente() {
        return cod_doente;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "codigo=" + codigo + ", tipo=" + tipo + ", enfermaria=" + enfermaria + ", ocupacao=" + ocupacao + ", cod_doente=" + cod_doente +'}';
    }
    
}

