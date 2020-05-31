

public class Hospital implements Comparable<Hospital>{

    private String nome;
    private String codigo;
    private String localidade;
    private ListaEnfermaria enfermarias;
    private ListaEquipamento equipamentos;
    private ListaDoente doentes;
    private ListaProfissionaldeSaude profissionais;

    public Hospital(){
    }
    
    public Hospital(String nome,String codigo,String localidade){
        this.nome = nome;
        this.codigo = codigo;
        this.localidade = localidade;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    public void setEnfermarias(ListaEnfermaria enfermarias) {
        this.enfermarias = enfermarias;
    }

    public ListaEnfermaria getEnfermarias() {
        return enfermarias;
    }

    public void setEquipamentos(ListaEquipamento equipamentos) {
        this.equipamentos = equipamentos;
    }

    public ListaEquipamento getEquipamentos() {
        return equipamentos;
    }

    public void setDoentes(ListaDoente doentes) {
        this.doentes = doentes;
    }

    public ListaDoente getDoentes() {
        return doentes;
    }

    public void setProfissionais(ListaProfissionaldeSaude profissionais) {
        this.profissionais = profissionais;
    }

    public ListaProfissionaldeSaude getProfissionais() {
        return profissionais;
    }

    @Override
    public String toString() {
        return "Hospital: \n" + "\tnome:" + nome+ "\n" + "\tcodigo:" + codigo + "\n" + "\tlocalidade:" + localidade + "\n" + "\tenfermarias:" + enfermarias + "\n" + "\tequipamentos:" + equipamentos + "\n" + "Doentes: " + doentes;
    }

    @Override
    public int compareTo(Hospital H) {
      return this.nome.compareTo(H.getNome()); 
    }
}

