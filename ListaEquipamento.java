package Classes;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ListaEquipamento {

    private final HashMap<String, Equipamento> listaEquipamento;
    
    public ListaEquipamento(){
        this.listaEquipamento = new HashMap<>();
        }
    
    //Adicionar equipamento a lista,identificado pelo seu código
    public void adicionar (Equipamento equipamento) {
        if(existe(equipamento.getCodigo())){
            throw new RuntimeException("O" + equipamento.getTipo() + "que está a inserir já existe!" );
        }
        listaEquipamento.put(equipamento.getCodigo(), equipamento);
    }
    
    //Remover equipamento da lista,identificado pelo seu código
    public void remover(String codigo){
        if(existe(codigo)){
            listaEquipamento.remove(codigo);
        } else {
            throw new RuntimeException ("O equipamento que pretende remover não existe!");
        }
    }
    
    //Verificar se determinado Equipamento existe
    public boolean existe(String codigo){
        return listaEquipamento.containsKey(codigo);
    }
    
    public HashMap<String, Equipamento> getListaEquipamento() {
        return listaEquipamento;
    }
    public Set<Equipamento> OrdenarAlfabeticamente(){
        Set<Equipamento> equipamento = new TreeSet<>();
        this.listaEquipamento.forEach((key,value)-> equipamento.add(value));
        return equipamento;
    }
    //Verifica a ocupação de um equipamento,caso este se encontre livre o profissional de Saude pode utilizá-lo e associa-o ao Código de o doente onde o equipamento será utilizado
    public void UtilizarEquip(Equipamento equipamento,Doente doente){
        Equipamento e = this.listaEquipamento.get(equipamento.getCodigo());
        if(e != null){
            if(equipamento.getOcupacao() == false){
            equipamento.setOcupacao(true);
                equipamento.setCod_doente(doente.getCodigo());
        }else{
            throw new RuntimeException("O" + equipamento.getTipo() + "já está associado a um doente");
    }
        }else{
            throw new RuntimeException("O" + equipamento.getTipo() + "não existe");
        }
    }

    @Override
    public String toString() {
        return "ListaEquipamento{" + "listaEquipamento=" + listaEquipamento + '}';
    }
    
}
