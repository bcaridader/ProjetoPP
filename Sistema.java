

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Sistema {
    
    private final ListaUtilizador utilizadores;
    private final List<RegistoAcesso> listaRegisto;
    private Utilizador utilizadorConectado;


    
    public Sistema (){
        utilizadores = new ListaUtilizador();
        listaRegisto = new ArrayList<>();

    }
    
    public ListaUtilizador getListaUtilizador() {
        return utilizadores;
    }
    
    public List <RegistoAcesso> getListaRegisto() {
        return listaRegisto;
    }


    public boolean autenticarUtilizador(String username, String password) {
        if(utilizadores.existe(username)) {
            try{
                Utilizador u = utilizadores.getUtilizador( username);
                if (u.getPassword().equals(password)){
                    utilizadorConectado = u;
                    listaRegisto.add( new RegistoAcesso(u, LocalDateTime.now()));
                    return true;
                }
            }catch (Exception e){}
        }
    return false;
    }
    
    public Utilizador getUtilizadorConectado(){
        return utilizadorConectado;
    }
    public void Conectar() throws ListaUtilizador.UtilizadorDuplicadoException {
        utilizadores.adicionar(new Administrador("Admin","Admin","Administrador"));
        utilizadores.adicionar(new Utilizador("Utilizador1","Utilizador1","Utilizador1"));
        utilizadores.adicionar(new Utilizador("Utilizador2","Utilizador2","Utilizador2"));
    }
    
    public void terminar(){
        System.exit(0);
    }
} 
