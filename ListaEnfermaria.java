package Classes;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ListaEnfermaria {
 
    private final HashMap<String, Enfermaria> listaEnfermaria;
    
    public ListaEnfermaria(){
        this.listaEnfermaria = new HashMap<>();
    }
    
    public void adicionar (Enfermaria enfermaria) {
        this.listaEnfermaria.putIfAbsent(enfermaria.getCodigo(), enfermaria);
    }
    
    public void remover (String codigo) {
        this.listaEnfermaria.remove(codigo);
    }
    
    public HashMap<String, Enfermaria> getListaEnfermaria() {
        return listaEnfermaria;
    }
    
    public Set<Enfermaria> OrdenarAlfabeticamente(){
        Set<Enfermaria> enfermarias = new TreeSet<>();
        this.listaEnfermaria.forEach((key,value)-> enfermarias.add(value));
        return enfermarias;
    }
}
