

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

    @Override
    public String toString() {
        return "\n\t\tLista de Enfermaria=" + listaEnfermaria.values();
    }
    
}

