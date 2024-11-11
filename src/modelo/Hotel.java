package modelo;

public class Hotel extends Hospederia {
    private boolean conDesayuno;

    public Hotel(boolean conDesayuno, int capacidad, boolean esFumador,String nombre, int rut, int valorBaseNoche, String temporada, int cantNoches) {
        super(capacidad, esFumador,nombre, rut, valorBaseNoche, temporada, cantNoches);
        this.conDesayuno = conDesayuno;
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno){
        this.conDesayuno = conDesayuno;
    }

    public int adicional(){
        if (this.esFumador && this.conDesayuno){
            return this.subtotal() *30/100;
        }
        return 0;
    }

    @Override
    public int valorACancelar() {
      return (this.subtotal() - this.bonoDescuento() + adicional());
    }

    @Override
    public void getDatos() {
        System.out.println("Medio de alojamiento: HOTEL");
        System.out.println("Tiene desayuno: " + isConDesayuno());
        System.out.println("Capacidad de: "+ getCapacidad());
        System.out.println("Fuma: (true-false)" + isEsFumador());
        System.out.println("Nombre :" + getNombre());
        System.out.println("Rut: " + getRut());
        System.out.println("Valor: " + getValorBaseNoche());
        System.out.println("Temporada: " + getTemporada());
        System.out.println("Cantidad de noches: "+ getCantNoches());
    }

    @Override
    public int incrementaValorBase() {
        System.out.println("No se incrementa valor base en este alojamiento");
        return 0;
    }
}
