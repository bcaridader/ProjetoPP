

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


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Enfermeiro: \n").append(super.toString()).append("\n").
                append("Enfermaria: ").append(enfermaria).append("\n");
        return sb.toString();
    }
 }

    
    
