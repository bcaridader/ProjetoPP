

public abstract class ProfissionaldeSaude implements Comparable <ProfissionaldeSaude> {
    
    private String codigo;
    private String nome;
    
    public ProfissionaldeSaude() {
    }

    public ProfissionaldeSaude(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return "\t\t\tncodigo=" + codigo + "\n\t\t\tnome=" + nome;
    }
    
    @Override
    public int compareTo(ProfissionaldeSaude PS) {
      return this.nome.compareTo(PS.getNome()); 
    }



}
