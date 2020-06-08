import java.util.Comparator;

//Comparator para o estado da doença
public class ComparatorEstado implements Comparator<Doente>{
    @Override
    public int compare(Doente A,Doente B) {
        return A.getEstadoDoenca().getEstado() - B.getEstadoDoenca().getEstado();
        }
    }
