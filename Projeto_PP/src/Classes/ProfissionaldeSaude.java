package Classes;


public class ProfissionaldeSaude {

// Variáveis de instância
private String codigo;
private String nome;
 
 
//Construtor
public ProfissionaldeSaude (String nome, String codigo) {
    this.nome = nome;
    this.codigo = codigo;
}
 
//modificadores
public void setNome (String nome) {
    this.nome = nome;
}
 
public void setCodigo (String codigo) {
   this.codigo = codigo;
 
}
 
//Selectores
 
public String getCodigo () {
    return codigo;
}
 
public String getNome () {
    return codigo;
}
 
}
