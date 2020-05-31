

public class Medico extends ProfissionaldeSaude {

    private ListaDoente pacientesAtribuidos;
    private String especialidade;
    
    
    public Medico(){
    }
    
    public Medico(String codigo,String nome,String especialidade){
        super(codigo,nome);
        this.especialidade = especialidade;
    }

    public ListaDoente getPacientesAtribuidos() {
        return pacientesAtribuidos;
    }

    public void setPacientesAtribuidos(ListaDoente pacientesAtribuidos) {
        this.pacientesAtribuidos = pacientesAtribuidos;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\tMédico: \n").append(super.toString()).append("\n\t\t\tEspecialidade: ").append(especialidade).append("\n").append("\t\t\tNumero de pacientes: ").append(pacientesAtribuidos.size());
        return sb.toString();
    }
}