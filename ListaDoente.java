

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;



public class ListaDoente {
    
    private final HashMap<String, Doente> listaDoente;
    private Object LocalDateTime;

    public ListaDoente(){
        this.listaDoente = new HashMap<>();
    }
    
    //Adiciona um Doente
    public void adicionar(Doente doente) {
        if(existe(doente.getCodigo())){
            throw new RuntimeException(" O paciente " + doente.getNome() + " já se encontra registado");
        }
        if (listaDoente != null) {
            for(Doente d:listaDoente.values()){
                if(d.getnCama() == doente.getnCama())
                    throw new RuntimeException("Essa cama já se encontra ocupada");
            }
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

    //Retorna uma Lista com Values da HashMap Doente
    public List<Doente> getDoentes(){
        return new ArrayList<>(listaDoente.values());
    }

    //Retorna o tamanho da lista
    public int size () {
        return listaDoente.size();
    }
    
    //Ordena Alfabeticamente por ordem Ascendente
    public Set<Doente> OrdenarAlfa(){
        Set<Doente> doentes = new TreeSet<>();
        this.listaDoente.forEach((key,value)-> doentes.add(value));
        return doentes;
    }
    
    //Ordena Alfabeticamente por ordem Descendente
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
    
    //Ordena por Estado da Doença(De menor Gravidade para maior)
    public Set<Doente> OrdenarGravidade(){
        Set<Doente> doentes = new TreeSet<>(new ComparatorEstado());
        for (Doente D:this.listaDoente.values()){
            doentes.add(D);
        }
        return doentes;
    }

    //Alterar o estado do Doente e se obtiver Alta fornecer a data de Saida
    public void AlterarEstado(Doente doente,Gravidade gravidade){
        doente.setEstadoDoenca(gravidade);
        if(doente.getEstadoDoenca() == Gravidade.ALTA){
            doente.setDataSaida(LocalDate.now());
            System.out.println(" O doente obteve Alta na data " + doente.getDataSaida());
        }
    }

    //Filtra listagem por Enfermaria TODO Falta verificar existencia da Enfermaria
    public List<Doente> FiltrarEnfer(Enfermaria enfermaria){
       List<Doente> doentes = new ArrayList<>();
        for(Doente d:this.listaDoente.values()){
            if(enfermaria.getDoentes().existe(d.getCodigo())){
                doentes.add(d);
            }
        }
        return doentes;
    }

    //Filtra listagem de doentes por localidade
    public List<Doente> FiltrarLocalidade(String localidade){
        List<Doente> doentes = new ArrayList<>();
        for(Doente d:this.listaDoente.values()){
            if(d.getLocalidade().equals(localidade)){
                doentes.add(d);
            }
        }
        return doentes;
    }

    //Filtra listagem de doentes por Estado da Doença
    public List<Doente> FiltrarEstado(Gravidade estadoDoenca){
        List<Doente> doentes = new ArrayList<>();
        for(Doente d:this.listaDoente.values()){
            if(d.getEstadoDoenca() == estadoDoenca){
                doentes.add(d);
            }
        }
        return doentes;
    }

    //Filtra listagem de doentes por Data de Entrada
    public List<Doente> FiltrarDataEntr(LocalDate dataEntrada){
        List<Doente> doentes = new ArrayList<>();
        for(Doente d:this.listaDoente.values()){
            if(d.getDataEntrada().equals(dataEntrada)){
                doentes.add(d);
            }
        }
        return doentes;
    }

    //Cria uma Dashboard para o número e percentagem de doentes,em estado Grave e muito Grave
    public void DashboardDoentes(Hospital hospital){
        List<Doente> doentes = hospital.getDoentes().getDoentes();
        int nGrave = 0, nMuitoGrave = 0;
        float nGrave_per = 0, nMuitoGrave_per = 0;
        for(Doente d:doentes){
            if(d.getEstadoDoenca() == Gravidade.GRAVE){
                nGrave += 1;
            }if(d.getEstadoDoenca() == Gravidade.MUITO_GRAVE){
                nMuitoGrave += 1;
            }
        }
        nGrave_per = ((float) nGrave / doentes.size()) * 100;
        nMuitoGrave_per = ((float) nMuitoGrave / doentes.size()) * 100;
        System.out.println("Doentes em estado grave: " + nGrave + "\n" + "Percentagem de Doentes em estado grave: " + nGrave_per +"%");
        System.out.println("Doentes em estado muito grave: " + nMuitoGrave + "\n" + "Percentagem de Doentes em estado muito grave: " + nMuitoGrave_per +"%");
    }

    @Override
    public String toString() {
        return "\t\t\tLista de Doentes: "+ listaDoente.values();
    }
}
