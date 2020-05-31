
import java.time.LocalDate;

public class Doente implements Comparable<Doente>{

    private String codigo;
    private String nome;
    private String localidade;
    private int nCama;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Gravidade estadoDoenca;
    
    public Doente() {
    }

    public Doente(String codigo, String nome, String localidade, int nCama, LocalDate dataEntrada){
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.nCama = nCama;
        this.dataEntrada = dataEntrada;
        this.dataSaida = null;
        this.estadoDoenca = Gravidade.POR_DIAGNOSTICAR;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setnCama(int nCama) {
        this.nCama = nCama;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setEstadoDoenca(Gravidade estadoDoenca) {
        this.estadoDoenca = estadoDoenca;
    }
 
    
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }


    public int getnCama() {
        return nCama;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public Gravidade getEstadoDoenca() {
        return estadoDoenca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tCódigo: ").append(codigo).append("\n").append("\t\t\t\tNome: ").append(nome).append("\n").append("\t\t\t\tLocalidade: ").append(localidade).append("\n")
                .append("\t\t\t\tCama: ").append(nCama).append("\n").append("\t\t\t\tCheck-in: ").append(dataEntrada).append("\n").append("\t\t\t\tCheck-out: ").append(dataSaida).append("\n")
                .append("\t\t\t\tEstado: ").append(estadoDoenca).append("\n");
        return sb.toString();
    }
    
    @Override
    public int compareTo(Doente D) {
      return this.nome.compareTo(D.getNome()); 
    }
    
}
