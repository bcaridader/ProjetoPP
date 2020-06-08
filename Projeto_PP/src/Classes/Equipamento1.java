package Classes;

import java.util.*;



public enum Equipamento1 {
    OCULOS("0000", "Enfermaria", "Ocupação"),
    BATAS("0000", "Enfermaria", "Ocupação");
   
    // Variáveis de instância
private String codigo;
private String enfermaria;
private String ocupacao;
 
//Construtor
private Equipamento1 (String codigo, String enfermaria, String ocupacao) {
this.codigo = codigo;
this.enfermaria = enfermaria;
this.ocupacao = ocupacao;
}

 
//modificadores
 
public void setCodigo (String codigo) {
   this.codigo = codigo;
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
 
 
public String getEnfermaria () {
return enfermaria;
}
 
public String getOcupacao () {
return ocupacao;
}


}
