public class Administrador extends Utilizador {
    
    
    public Administrador(){
    }
    
    public Administrador(String username,String nome,String password){
        super(username,nome,password);
      }

    @Override
    public String toString() {
        return "Administrador{" + '}';
    }   
}

