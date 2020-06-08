package Classes;


public class Doente {
    
    //Variáveis de instância
    private String codigo;
    private String nome;
    private String localidade;
    private String enfermaria;
    private float nCama;
    private int dataEntrada;
    private int dataSaida;
    private String estadoDoenca;
    
    //Construtor
    public Doente(){}
    
    public Doente(String codigo, String nome, String localidade, String enfermaria, float nCama, int dataEntrada, int dataSaida, String estadoDoenca) {
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.enfermaria = enfermaria;
        this.nCama = nCama;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.estadoDoenca = estadoDoenca;
    }
    
    //Modificadores
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

    public void setnCama(float nCama) {
        this.nCama = nCama;
    }

    public void setDataEntrada(int dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(int dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setEstadoDoenca(String estadoDoenca) {
        this.estadoDoenca = estadoDoenca;
    }
    
    //Seletores
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

    public float getnCama() {
        return nCama;
    }

    public int getDataEntrada() {
        return dataEntrada;
    }

    public int getDataSaida() {
        return dataSaida;
    }

    public String getEstadoDoenca() {
        return estadoDoenca;
    }
    
    
}
