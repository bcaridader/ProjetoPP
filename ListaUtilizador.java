
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class ListaUtilizador implements Serializable {
    private TreeMap<String, Utilizador> lista;
    
    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() {}
        public UtilizadorNaoExistenteException(String message) {
        super(message);
        }
    }
 
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() {}
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }
    }
    
    
    public ListaUtilizador() {
        lista = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }
 
    public void adicionar(Utilizador utilizador) throws UtilizadorDuplicadoException {
        if (utilizador == null) {
            throw new NullPointerException("O utilizador não pode ser nulo.");
        }
        if (!lista.containsKey(utilizador.getUsername())) {
            lista.put(utilizador.getUsername(), utilizador);
        } else {
            throw new UtilizadorDuplicadoException(String.format("O utilizador ´%s´já existe na coleção.", utilizador.getUsername()));
        }
    }
    
    public boolean existe(String username) {
        return lista.containsKey(username);
    }
    
    public int size () {
        return lista.size();
    }
    
    public Utilizador getUtilizador(String username) throws UtilizadorNaoExistenteException {
        if (lista.containsKey(username)) {
            return lista.get(username);
        } else {
            throw new UtilizadorNaoExistenteException("O utilizador já existe na lista");
        }
    }
    
    public ArrayList<Utilizador> todos() {
        return new ArrayList<>(lista.values());
    }

    public Set<Utilizador> OrdenarAlfabeticamente(){
        Set<Utilizador> utilizadores = new TreeSet<>();
        this.lista.forEach((key,value)-> utilizadores.add(value));
        return utilizadores;
    }
}