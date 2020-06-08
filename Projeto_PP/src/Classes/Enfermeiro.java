package Classes;


public class Enfermeiro extends ProfissionaldeSaude {
 
    
    //Variáveis de instância
    private String enfermaria;
    
    //Construtor
    public Enfermeiro(String codigo, String nome, String enfermaria) {
        super (codigo, nome);
        this.enfermaria = enfermaria;
    }
    
    //Modificadores
    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }
    
    //Seletores
    public String getEnfermaria() {
        return enfermaria;
    }
    
    
    
}
