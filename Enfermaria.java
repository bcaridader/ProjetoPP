

public class Enfermaria {

    
    private String codigo;
    private String tipo;
    private int nCamas;
    private ListaProfissionaldeSaude funcionarios;
    private ListaDoente doentes;
    
   
    public Enfermaria() {
    }
    
    public Enfermaria(String codigo, String tipo, int nCamas) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nCamas = nCamas;
     }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnCamas() {
        return nCamas;
    }

    public void setnCamas(int nCamas) {
        this.nCamas = nCamas;
    }

    public ListaProfissionaldeSaude getFuncionarios(){
        return funcionarios;
    }
    

    public void setFuncionarios(ListaProfissionaldeSaude funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ListaDoente getDoentes() {
        return doentes;
    }

    public void setDoentes(ListaDoente doentes) {
        this.doentes = doentes;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\tCódigo: ").append(codigo).append("\n").append("\t\tTipo: ").append(tipo).append("\n").
                append("\t\tnCamas: ").append(nCamas).append("\n").append("\t\tfuncionarios: ").append(funcionarios).
                append("\t\ndoentes: ").append(doentes).append("\n");
        return sb.toString();
    }
}
