package Classes;

public class Hospital implements Comparable<Hospital>{

    private String nome;
    private String codigo;
    private String localidade;
    

    public Hospital(){
        }
    
    public Hospital(String nome,String codigo,String localidade){
        this.nome = nome;
        this.codigo = codigo;
        this.localidade = localidade;
        }
    

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    

    public String getNome(){
        return nome;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getLocalidade(){
        return localidade;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome=" + nome + ", codigo=" + codigo + ", localidade=" + localidade + '}';
    }
    
    @Override
    public int compareTo(Hospital H) {
      return this.nome.compareTo(H.getNome()); 
    }
    
    
}

