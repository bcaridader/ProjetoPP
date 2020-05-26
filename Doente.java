package Classes;
import java.time.LocalDate;

public class Doente implements Comparable<Doente>{

    private String codigo;
    private String nome;
    private String localidade;
    private String enfermaria;
    private int nCama;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Gravidade estadoDoenca;
    
    public Doente() {
    }

    public Doente(String codigo, String nome, String localidade, String enfermaria, int nCama, LocalDate dataEntrada){
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.enfermaria = enfermaria;
        this.nCama = nCama;
        this.dataEntrada = dataEntrada;
        this.dataSaida = null;
        this.estadoDoenca = Gravidade.POR_DIAGNOSTICAR;
    }
    
    /*public Doente(Doente D){
        this.codigo = D.getCodigo();
        this.nome = D.getNome();
        this.localidade = D.getLocalidade();
        this.enfermaria = D.getEnfermaria();
        this.nCama = D.getnCama();
        this.dataEntrada = D.getDataEntrada();
        this.dataSaida = D.getDataSaida();
        this.estadoDoenca = D.getEstadoDoenca();
        
    }*/
    

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
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

    public String getEnfermaria() {
        return enfermaria;
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
        return "Doente{" + "codigo=" + codigo + ", nome=" + nome + ", localidade=" + localidade + ", enfermaria=" + enfermaria + ", nCama=" + nCama + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", estadoDoenca=" + estadoDoenca + '}';
    }
    
    @Override
    public int compareTo(Doente D) {
      return this.nome.compareTo(D.getNome()); 
    }
    
}
