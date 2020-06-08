package Classes;


public class Medico extends ProfissionaldeSaude {
    
    
    //Variáveis de instância
    private String enfermaria;
    private String pacientesAtribuidos;
    private String especialidade;

    //Construtor
    public Medico(String codigo, String nome, String enfermaria, String pacientesAtribuidos, String especialidade) {
        super(codigo, nome);
        this.enfermaria = enfermaria;
        this.pacientesAtribuidos = pacientesAtribuidos;
        this.especialidade = especialidade;
        
    }
    
    //Modificadores
    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }

    public void setPacientesAtribuidos(String pacientesAtribuidos) {
        this.pacientesAtribuidos = pacientesAtribuidos;
    }

    //Seletores
    public String getEnfermaria() {
        return enfermaria;
    }

    public String getPacientesAtribuidos() {
        return pacientesAtribuidos;
    }
    
    
}
