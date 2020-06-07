package Classes;

import java.util.*;

public class Equipamento {
    
    // Variáveis de instância
private String codigo;
private String tipo;
private String enfermaria;
private String ocupacao;
 
//Construtor
public Equipamento (String codigo, String tipo, String enfermaria, String ocupacao) {
this.codigo = codigo;
this.tipo = tipo;
this.enfermaria = enfermaria;
this.ocupacao = ocupacao;
}

//Construtor da copia 
public Equipamento (Equipamento Eq) {
    this.codigo = Eq.getCodigo();
    this.tipo = Eq.getTipo();
    this.enfermaria = Eq.getEnfermaria();
    this.ocupacao = Eq.getOcupacao();
}
 
//modificadores
 
public void setCodigo (String codigo) {
   this.codigo = codigo;
}
 
public void setTipo (String tipo) {
 this.tipo = tipo;
}
 
public void setEnfermaria (String enfermaria) {
this.enfermaria = enfermaria;
}
 
public void setOcupacao (String ocupacao) {
 this.ocupacao = ocupacao;
}
 
//Selectores
 
public String getCodigo () {
return codigo;
}
 
public String getTipo () {
return tipo;
}
 
public String getEnfermaria () {
return enfermaria;
}
 
public String getOcupacao () {
return ocupacao;
}

@Override
public Equipamento clone() {
    return new Equipamento(this);
}

}
