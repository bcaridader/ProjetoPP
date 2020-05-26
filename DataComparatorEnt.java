package Classes;
import java.util.Comparator;

//Comparator Para DataDeEntrada
public class DataComparatorEnt implements Comparator<Doente>{
    @Override
    public int compare(Doente A,Doente B){
        return A.getDataEntrada().compareTo(B.getDataEntrada());
         }
    }

