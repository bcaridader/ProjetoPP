package Classes;


import Classes.ListaEquipamentos;
import Classes.Equipamento;


public class Teste {

public static void main (String[] args) {
    
    ListaEquipamentos listaEquipamentos = new ListaEquipamentos();
    
    listaEquipamentos.adicionar(new Equipamento ("123", "Óculos", "Enfermaria Norte", "Livre"));
    listaEquipamentos.remover("123");
    System.out.println(listaEquipamentos.existe("123"));    
    
}   
}
