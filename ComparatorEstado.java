package Classes;

import java.util.Comparator;

public class ComparatorEstado implements Comparator<Doente>{
    @Override
    public int compare(Doente A,Doente B) {
        //if(A.getEstado()- B.getEstado());
        return A.getEstadoDoenca().getEstado() - B.getEstadoDoenca().getEstado();
        }
    }
