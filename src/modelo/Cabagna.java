package modelo;

public class Cabagna  extends Hospederia{
    private boolean chimenea;

    public Cabagna (int capacidad,boolean conDesayuno, String nombre, int rut, int valorBaseNoche, String temporada, int cantNoches, boolean esFumador, boolean chimenea) {
        super(capacidad, esFumador, nombre, rut, valorBaseNoche, temporada, cantNoches);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }
    public int incrementaValorBase(){
        int incrementa=0;
        if(capacidad>5){
            incrementa=  (this.valorBaseNoche * 18/100);
        }
        return this.valorBaseNoche + incrementa ;
    }

    @Override
    public int adicional() {
        return 0;
    }

    @Override
    public int valorACancelar() {
        return (this.subtotal() - this.bonoDescuento());
    }

    @Override
    public void getDatos() {
        System.out.println("Medio de alojamiento: CABAGNA");
        System.out.println("Capacidad de: "+ getCapacidad());
        System.out.println("Fuma: (true-false)" + isEsFumador());
        System.out.println("Nombre :" + getNombre());
        System.out.println("Rut: " + getRut());
        System.out.println("Valor: " + getValorBaseNoche());
        System.out.println("Temporada: " + getTemporada());
        System.out.println("Cantidad de noches: "+ getCantNoches());
        System.out.println("Chimenea : (true-false)" + isChimenea());
    }
}
