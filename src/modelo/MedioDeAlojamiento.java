package modelo;

public abstract class  MedioDeAlojamiento  extends DatosCliente {
    protected int valorBaseNoche;
    protected String temporada;
    protected int cantNoches;

    public MedioDeAlojamiento(String nombre, int rut, int valorBaseNoche, String temporada, int cantNoches) {
        super(nombre, rut);
        this.valorBaseNoche = valorBaseNoche;
        this.temporada = temporada;
        this.cantNoches = cantNoches;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public void setCantNoches(int cantNoches) {
        this.cantNoches = cantNoches;
    }

    public int subtotal() {
        return (this.cantNoches * this.valorBaseNoche);
    }
    public int bonoDescuento(){
        int descuento = 0;
        if(this.temporada.equalsIgnoreCase("Baja")){
           descuento = (this.subtotal() * 25/100);
        } else if (this.temporada.equalsIgnoreCase("Media")){
            descuento = (int) Math.round(this.subtotal() * 12.5 / 100);
        }
        return descuento;
    }
    public abstract int adicional();
    public abstract int valorACancelar();
    public abstract void getDatos();
    public abstract int incrementaValorBase();


}
