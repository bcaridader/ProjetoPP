package Classes;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class ListaDoente {
    
    private final HashMap<String, Doente> listaDoente;
    
    public ListaDoente(){
        this.listaDoente = new HashMap<>();
    }
    
    //Adiciona um Doente
    public void adicionar(Doente doente) {
        if(existe(doente.getCodigo())){
            throw new RuntimeException(" O paciente " + doente.getNome() + " já se encontra registado");
        }
        listaDoente.put(doente.getCodigo(), doente);
    }
    
    //Remove um Doente
    public void remover(String codigo) {
        listaDoente.remove(codigo);
    }
    
    //Verifica a existência de um Doente
    public boolean existe(String codigo){
        return listaDoente.containsKey(codigo);
    }
    
    public HashMap<String, Doente> getListaDoente() {
        return listaDoente;
    }
    //Ordena Alfabeticamente Ascendente
    public Set<Doente> OrdenarAlfa(){
        Set<Doente> doentes = new TreeSet<>();
        this.listaDoente.forEach((key,value)-> doentes.add(value));
        return doentes;
    }
    
    //Ordena Alfabeticamente Descendente
    public Set<Doente> OrdenarAlfaDesc(){
        TreeSet<Doente> doentes = new TreeSet<>(this.listaDoente.values());
        Set<Doente> doentes1 = doentes.descendingSet();
        return doentes1;
    }
    
    //Ordena Doentes por Data de Entrada
    public Set<Doente> OrdenarDataEnt(){
        Set<Doente> doentes = new TreeSet<>(new DataComparatorEnt());
        for (Doente D:this.listaDoente.values()){
            doentes.add(D);
        }
        return doentes;
    }
    
    //Ordena Doentes por Data de Saída
    public Set<Doente> OrdenarDataExit(){
        Set<Doente> doentes = new TreeSet<>(new DataComparatorExit());
        for (Doente D:this.listaDoente.values()){
            if(D.getDataSaida() != null)
               doentes.add(D);
        }
        return doentes;
    }
    
    //Ordena por Estado da Doença
    public Set<Doente> OrdenarGravidade(){
        Set<Doente> doentes = new TreeSet<>(new ComparatorEstado());
        for (Doente D:this.listaDoente.values()){
            doentes.add(D);
        }
        return doentes;
    }
    
    @Override
    public String toString() {
        return "ListaDoente{" + "listaDoente=" + listaDoente + '}';
    }
    
    
}
