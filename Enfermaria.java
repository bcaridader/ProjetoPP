public class Enfermaria {

    
    private String codigo;
    private String tipo;
    private int nCamas;
    private ListaProfissionaldeSaude funcionarios;
    private ListaDoente doentes;
    private ListaEquipamento equipamentos;
    
   
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

    public ListaEquipamento getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ListaEquipamento equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nCódigo: ").append(codigo).append("\n").append("Tipo: ").append(tipo).append("\n").append("Numero de camas total: ").append(nCamas + doentes.size())
                .append("\nNumero de camas livres: ").append(nCamas).append("\n").append("funcionarios: ").append(funcionarios).
                append("\ndoentes: ").append(doentes).append("\n");
        return sb.toString();
    }
}
