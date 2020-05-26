package Classes;


import Classes.ProfissionaldeSaude;

public class Medico extends ProfissionaldeSaude {
    
    private String enfermaria;
    private String pacientesAtribuidos;
    private String especialidade;
    
    
    public Medico(){
    }
    
    public Medico(String codigo,String nome,String enfermaria,String pacientesAtribuidos,String especialidade){
        super(codigo,nome);
        this.enfermaria = enfermaria;
        this.pacientesAtribuidos = pacientesAtribuidos;
        this.especialidade = especialidade;
    }
    
    
    public void setEnfermaria(String enfermaria){
        this.enfermaria = enfermaria;
    }
    
    public void setPacientesAtribuidos(String pacientesAtribuidos){
        this.pacientesAtribuidos = pacientesAtribuidos;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public String getEnfermaria(){
        return enfermaria;
    }
    
    public String getPacientesatribuidos(){
        return pacientesAtribuidos;
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    

    public String toString() {
        return "Medico{" + "enfermaria=" + enfermaria + ", pacientesAtribuidos=" + pacientesAtribuidos + ", especialidade=" + especialidade + '}';
    }
    
    
    
}