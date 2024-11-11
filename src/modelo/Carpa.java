package modelo;

public class Carpa extends MedioDeAlojamiento {
    private int cantPersonas;

    public Carpa(int cantPersonas, String nombre, int rut, int valorBaseNoche, String temporada, int cantNoches) {
        super(nombre, rut, valorBaseNoche, temporada, cantNoches);
        this.cantPersonas = cantPersonas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public int adicional() {
        return 0;
    }

    @Override
    public int valorACancelar() {
        return 0;
    }
    @Override
    public void getDatos() {
        System.out.println("Medio de alojamiento: CARPA");
        System.out.println("Nombre :" + getNombre());
        System.out.println("Rut: " + getRut());
        System.out.println("Personas: " + getCantPersonas());
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
