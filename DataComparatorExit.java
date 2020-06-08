import java.util.Comparator;

//Comparator para DataDeSaida
public class DataComparatorExit implements Comparator<Doente> {
     @Override
    public int compare(Doente A,Doente B){
        return A.getDataSaida().compareTo(B.getDataSaida());
       }
    }
    
