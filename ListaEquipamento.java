

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaEquipamento {

    private final HashMap<String, Equipamento> listaEquipamento;
    
    public ListaEquipamento(){
        this.listaEquipamento = new HashMap<>();
        }
    
    //Adicionar equipamento
    public void adicionar (Equipamento equipamento) {
        if(existe(equipamento.getCodigo())){
            throw new RuntimeException("O" + equipamento.getTipo() + "que está a inserir já existe!" );
        }
        listaEquipamento.put(equipamento.getCodigo(), equipamento);
    }
    
    //Remover equipamento
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

    //Retorna a Lista
    public List<Equipamento> getEquipamentos(){
        return new ArrayList<>(listaEquipamento.values());
    }

    //Ordena por ordem Alfabetica os equipamentos
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

    //Liberta a Ocupação de um Equipamento associado a um Doente
    public void LibertarEquip(Equipamento equipamento){
        Equipamento e = this.listaEquipamento.get(equipamento.getCodigo());
        if(e != null){
            equipamento.setOcupacao(false);
                equipamento.setCod_doente(null);
        }
    }

    //Lista os equipamentos
    public List<Equipamento> ListaEquip(){
        List<Equipamento> equipamentos = new ArrayList<>();
        for(Equipamento e:this.listaEquipamento.values()){
            if(e.getOcupacao()){
                equipamentos.add(e);
            }
        }
        return equipamentos;
    }

    //Retorna o tamanho da lista
    public int size () {
        return listaEquipamento.size();
    }

    //Número e percentagem de equipamentos ocupados, por cada tipo;
    public void DashboardEquipamento(EquipamentoTipo tipo,Hospital hospital){
        List<Equipamento> equipamentos = hospital.getEquipamentos().getEquipamentos();
        int equipOcup = 0;
        int count = 0;
        int equipNocup = 0;
        float equip_per;
        for(Equipamento e:equipamentos){
            if(e.getTipo() == tipo){
                count +=1;
                if(e.getOcupacao() == true)
                    equipOcup += 1;
            else equipNocup += 1;
            }
        }
        equip_per = ((float)equipOcup / count * 100);
        System.out.println("Tipo de Equipamento: " + tipo +"\n" + "O Número de equipamentos ocupados é: " + equipOcup + "\n" + "Percentagem de equipamentos ocupados deste tipo: " + equip_per + "%");

    }

    @Override
    public String toString() {
        return "Lista de Equipamentos: {" + listaEquipamento.values() + '}';
    }
}
