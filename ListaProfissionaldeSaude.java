

import java.util.*;
import java.util.stream.Collectors;

public class ListaProfissionaldeSaude {

    private final HashMap<String, ProfissionaldeSaude> listaProfissionaldeSaude;
    
    public ListaProfissionaldeSaude () {
        this.listaProfissionaldeSaude = new HashMap<>();
    }

    //Adiciona um profissional de saude a lista de profissionais de saude
    public void adicionar(ProfissionaldeSaude profissionaldeSaude){
        //this.listaProfissionaldeSaude.putIfAbsent(profissionaldeSaude.getCodigo(), profissionaldeSaude);
        if(existe(profissionaldeSaude.getCodigo())){
            throw new RuntimeException(" O Profissional de Saude " + profissionaldeSaude.getNome() + " já existe!");
                    }
        listaProfissionaldeSaude.put(profissionaldeSaude.getCodigo(),profissionaldeSaude);
    }

    //Remove um profissional de saude da lista de profissionais de saude
    public void remover(String codigo){
        this.listaProfissionaldeSaude.remove(codigo);
    }

    //Verifica a existencia de um profissional de Saude
    public boolean existe (String codigo) {
        return listaProfissionaldeSaude.containsKey(codigo);
    }

    //Devolve a Lista de profissionais de Saude
    public List<ProfissionaldeSaude> getProfissionaldeSaude(){
        return new ArrayList<>(listaProfissionaldeSaude.values());
    }

    //Retorna o tamanho da lista
    public int size () {
        return listaProfissionaldeSaude.size();
    }

    //Retorna o Medico na Lista de Profissionais de Saude
    public List<Medico> getMedicos() {
        return listaProfissionaldeSaude.values().stream().filter(m -> m instanceof Medico).map(m ->(Medico)m).collect(Collectors.toList());
    }

    //Retorna o Enfermeiro na Lista de Profissionais de Saude
    public List<Enfermeiro> getEnfermeiros() {
        return listaProfissionaldeSaude.values().stream().filter(m -> m instanceof Enfermeiro).map(m ->(Enfermeiro)m).collect(Collectors.toList());
    }

    //Ordena alfabeticamente a lista de profissionais de saude
    public Set<ProfissionaldeSaude> OrdenarAlfabeticamente(){
        Set<ProfissionaldeSaude> profissionais = new TreeSet<>();
        this.listaProfissionaldeSaude.forEach((key,value)-> profissionais.add(value));
        return profissionais;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (ProfissionaldeSaude d : listaProfissionaldeSaude.values()){
            if (d instanceof Medico){
                sb.append( ((Medico) d).toString());
            }else{
                sb.append( ((Enfermeiro) d).toString());
            }
        }
        return sb.toString();
    }
}
