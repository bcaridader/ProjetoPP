package Classes;

import Classes.ProfissionaldeSaude;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ListaProfissionaldeSaude {

    private final HashMap<String, ProfissionaldeSaude> listaProfissionaldeSaude;
    
    public ListaProfissionaldeSaude () {
        this.listaProfissionaldeSaude = new HashMap<>();
    }
    
    public void adicionar(ProfissionaldeSaude profissionaldeSaude){
        this.listaProfissionaldeSaude.putIfAbsent(profissionaldeSaude.getCodigo(), profissionaldeSaude);
    }
    
    public void remover(String codigo){
        this.listaProfissionaldeSaude.remove(codigo);
    }

    public HashMap<String, ProfissionaldeSaude> getListaProfissionaldeSaude() {
        return listaProfissionaldeSaude;
    }
    
    public Set<ProfissionaldeSaude> OrdenarAlfabeticamente(){
        Set<ProfissionaldeSaude> profissionais = new TreeSet<>();
        this.listaProfissionaldeSaude.forEach((key,value)-> profissionais.add(value));
        return profissionais;
    }
    
}
