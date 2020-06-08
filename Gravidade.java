public enum Gravidade {
        POR_DIAGNOSTICAR(0),MODERADO(1),GRAVE(2),MUITO_GRAVE(3),ALTA(4);
    public int estado;
        Gravidade(int est){
        this.estado = est;
        }
    public int getEstado(){
        return estado;
    }
}
   
