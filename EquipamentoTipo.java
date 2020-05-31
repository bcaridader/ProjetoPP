public enum EquipamentoTipo {
    SERINGA(0),ZARAGATOA(1),BISTURI(2),ESTETOSCOPIO(3),VENTILADOR(4),TESOURA(5),GAZE(6),PENSOS(7),SORO(8),CATETER(9);
    public int estado;
    EquipamentoTipo(int est){
        this.estado = est;
    }
    public int getTipo(){
        return estado;
    }
}
