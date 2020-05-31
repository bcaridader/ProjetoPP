
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaHospital {
    
    private final HashMap<String, Hospital> listaHospital;
    
    public ListaHospital(){
        
        this.listaHospital = new HashMap<>();
        }
    
    //Adiciona um Hospital
    public void adicionar(Hospital hospital) {
        if(existe(hospital.getCodigo())){
            throw new RuntimeException("O" + hospital.getNome() + "já existe!");
            }
        listaHospital.put(hospital.getCodigo(), hospital);
    }
    
    //Remove um Hospital
    public void remover(String nome) {
        listaHospital.remove(nome);
    }
    
    //Verifica a existência de um Hospital
    public boolean existe(String nome) {
        return listaHospital.containsKey(nome);
    }
    
    //Ordena Hospitais por Alfabeto Ascendente
    public Set<Hospital> OrdenarAlfaAsc(){
        Set<Hospital> hospitais = new TreeSet<>();
        this.listaHospital.forEach((key,value)-> hospitais.add(value));
        return hospitais;
    }
    
    //Ordena Hospitais por Alfabeto Descendente
    public Set<Hospital> OrdenarAlfaDesc(){
        TreeSet<Hospital> hospitais = new TreeSet<>(this.listaHospital.values());
        Set<Hospital> hospitais1 =  hospitais.descendingSet();
        return hospitais1;
    }
    
    //Retorna na Integra a Lista de Hospitais
    public List<Hospital> getHospitais(){
        return new ArrayList<>(listaHospital.values());
    }

    //Retorna o tamanho da Lista
    public int size () {
        return listaHospital.size();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Hospital h : listaHospital.values()){
            sb.append(h);
        }
        return sb.toString();
    }
}
