package modelo;

public abstract class Hospederia extends MedioDeAlojamiento {
    protected int capacidad;
    protected boolean esFumador;

    public Hospederia(int capacidad, boolean esFumador, String nombre, int rut, int valorBaseNoche, String temporada, int cantNoches){
        super(nombre, rut, valorBaseNoche, temporada, cantNoches);
        this.capacidad = capacidad;
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public  abstract int valorACancelar();
}
