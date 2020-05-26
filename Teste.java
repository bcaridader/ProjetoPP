package Classes;

import java.time.LocalDate; 



public class Teste {
    public static void main(String[]args) {
        
        Hospital h1 = new Hospital("Sa carneiro","12574","Norte");
        Hospital h2 = new Hospital("Zaparata","12555","Norte");
        Hospital h3 = new Hospital("Alberto Carneiro","13455","Sul");
        Hospital h4 = new Hospital("Carlos Magalhaes","7584","Centro");
        Doente d1 = new Doente("B1248","Bruno Caridade","Braga","Cuidados Intensivos",69,LocalDate.of(2020, 5, 20));
        Doente d2 = new Doente("A7575","Carlos Beiramar","Braga","Cuidados Intensivos",69,LocalDate.of(2020, 4, 20));
        Doente d3 = new Doente("A9345","Carlos Baixo","Braga","Cuidados Intensivos",69,LocalDate.of(2020, 3, 20));
        Equipamento e1 = new Equipamento("A11","Seringa","UC");
        Equipamento e2 = new Equipamento("A12","Maca","Urgências");
        
        ListaDoente listaDoente = new ListaDoente();
        
        
        listaDoente.adicionar(d1);
        listaDoente.adicionar(d2);
        listaDoente.adicionar(d3);
        d1.setEstadoDoenca(Gravidade.MODERADO);
        d2.setEstadoDoenca(Gravidade.MUITO_GRAVE);
        
        
        ListaHospital listaHospital = new ListaHospital();
        
        listaHospital.adicionar(h1);
        listaHospital.adicionar(h2);
        listaHospital.adicionar(h3);
        listaHospital.adicionar(h4);
        
        ListaEquipamento listaEquipamento = new ListaEquipamento();
        
        listaEquipamento.adicionar(e1);
        listaEquipamento.adicionar(e2);
        listaEquipamento.UtilizarEquip(e2, d1);
        
        //System.out.println(listaEquipamento.toString());
        
        System.out.println(listaDoente.OrdenarGravidade());
        
        
       
        
        
        
       //System.out.println(listaHospital.OrdenarAlfaDesc());
        
       
       
       //System.out.println(listaDoente.OrdenarAlfaDesc());
       //System.out.println(listaHospital.getListaHospital().toString());
       //System.out.println(listaHospital.OrdenarAlfaDesc());
        }
        
        
        
}
