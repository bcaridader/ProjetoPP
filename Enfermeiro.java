package Classes;

public class Enfermeiro extends ProfissionaldeSaude{
    
    private String enfermaria;
    
    
    public Enfermeiro(){
    }
   
    public Enfermeiro(String nome,String codigo,String enfermaria){
        super(codigo,nome);
        this.enfermaria = enfermaria;
        }
    
    
    public void setEnfermaria(String enfermaria){
        this.enfermaria = enfermaria;
    }
    
    
    public String getEnfermaria(){
        return enfermaria;
    }
    
    
    @Override
    public String toString() {
        return "Enfermeiro{" + "enfermaria=" + enfermaria + '}';
    }
 }

    
    
