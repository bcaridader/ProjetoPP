package Classes;

import java.util.HashMap;

public class ListaEquipamentos {
 
    private final HashMap<String, Equipamento> listaEquipamentos;
    
   //Construtor 
   public ListaEquipamentos(){
       this.listaEquipamentos = new HashMap<>();
   }

   //Adicionar equipamento a lista, identificado pelo seu código
   public void adicionar (Equipamento equipamento) {
       if (existe(equipamento.getCodigo())){
          throw new RuntimeException("O " + equipamento.getTipo() + " que está a inserir já existe!");
      } 
       listaEquipamentos.put(equipamento.getCodigo(), equipamento);
      
    }
    
   //Remover equipamento da lista, identificado pelo seu código
   public void remover (String codigo){
      if (existe(codigo)){
       listaEquipamentos.remove(codigo);
      } else {
         //throw new RuntimeException ("O " + equipamento.getTipo() + " que pretende remover não existe");
         throw new RuntimeException ("O equipamento que pretende remover não existe!");
      }
    }
   
   //Verificar se determinado Equipamento já existe 
   public boolean existe (String codigo){
       return listaEquipamentos.containsKey(codigo);
   }

}
 