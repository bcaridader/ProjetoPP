package Classes;



import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Sistema implements Serializable {
    private final ListaUtilizadores utilizadores;
    private final List<RegistoAcesso> listaEntradas;
    private Utilizador utilizadorLigado;

    public Sistema() {
        utilizadores = new ListaUtilizadores();   
        listaEntradas = new ArrayList<>();
    }                       

    public ListaUtilizadores getListaUtilizadores() {
        return utilizadores;
    }
    
    public List<RegistoAcesso> getListaEntradas() {
        return listaEntradas;
    }
    
    public boolean autenticarUtilizador(String username, String password) {        
        if (utilizadores.existe(username)) {
            try{
                Utilizador u = utilizadores.getUtilizador(username);                
                if (u.getPassword().equals(password)){
                    utilizadorLigado = u;
                    listaEntradas.add(new RegistoAcesso(u, LocalDateTime.now()));
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
    
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }
    
    public void inicializar() throws ListaUtilizadores.UtilizadorDuplicadoException {
        utilizadores.adicionar(new Administrador("admin", "admin", "Aministrador"));
        utilizadores.adicionar(new Utilizador("user1", "1234", "Utilizador 1"));
        utilizadores.adicionar(new Utilizador("user2", "1234", "Utilizador 2"));        
    }
    
    public void terminar() {
        System.exit(0);
    }
    
    
}
