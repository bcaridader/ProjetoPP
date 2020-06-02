

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class ListaEnfermaria {
 
    private final HashMap<String, Enfermaria> listaEnfermaria;
    
    public ListaEnfermaria(){
        this.listaEnfermaria = new HashMap<>();
    }

    //Adiciona uma enfermaria
    public void adicionar (Enfermaria enfermaria) {
        if(existe(enfermaria.getCodigo())){
            throw new RuntimeException("A" + enfermaria.getTipo() + "já existe!");
        }
        listaEnfermaria.put(enfermaria.getCodigo(), enfermaria);
    }
    //Remove uma enfermaria
    public void remover (String codigo) {
        this.listaEnfermaria.remove(codigo);
    }
    //Verifica a existencia de uma enfermaria
    public boolean existe(String codigo){
        return listaEnfermaria.containsKey(codigo);
    }

    //Retorna o tamanho da Lista
    public int size () {
        return listaEnfermaria.size();
    }

    //Imprime a lista de Enfermarias
    public List<Enfermaria> getEnfermarias(){
        return new ArrayList<>(listaEnfermaria.values());
    }
    
    //Ordena Alfabeticamente a Enfermaria
    public Set<Enfermaria> OrdenarAlfabeticamente(){
        Set<Enfermaria> enfermarias = new TreeSet<>();
        this.listaEnfermaria.forEach((key,value)-> enfermarias.add(value));
        return enfermarias;
    }

    //Lista os Profissionais de Saude de uma Enfermaria
    public ListaProfissionaldeSaude ListaProfissionais(String codigo){
        Enfermaria e = this.listaEnfermaria.get(codigo);
            return e.getFuncionarios();
    }
    
    //A enfermaria mais problemática, isto é, com o maior número de camas,ocupadas e o menor número de equipamentos livres.
    public void DashBoardEnferm(Hospital hospital){
        List<Enfermaria> enfermarias = hospital.getEnfermarias().getEnfermarias();
            int nCamaOcup = 0;
            int nEquipOcup = 0;
            int nCamaOcup1 = 0;
            int nEquiOcup1 = 0;
            String enfermaria_nCamas = "";
            String enfermaria_nEquip = "";
        for(Enfermaria e:enfermarias){
            if(e.getDoentes().size()> nCamaOcup){
                nCamaOcup = e.getDoentes().size();
                enfermaria_nCamas = e.getCodigo();
            }
            for(Equipamento equip:e.getEquipamentos().getEquipamentos()){
                if(equip.getOcupacao()){
                nEquipOcup += 1;
                }
            }
                if(nEquipOcup > nEquiOcup1){
                   nEquiOcup1 = nEquipOcup;
                   nEquipOcup = 0;
                   enfermaria_nEquip = e.getCodigo();
                }
        }
        System.out.println("O Numero de camas ocupadas: " +nCamaOcup + "\n" + "Enfermaria: " + enfermaria_nCamas + "\n" + "Numero de equipamentos Ocupados: " + nEquiOcup1 + "\n" + "Enfermaria:" + enfermaria_nEquip );
    }

    @Override
    public String toString() {
        return "\n\t\tLista de Enfermaria=" + listaEnfermaria.values();
    }
    
}

