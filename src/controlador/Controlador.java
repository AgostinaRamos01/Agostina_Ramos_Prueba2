package controlador;
import modelo.MedioDeAlojamiento;
import java.util.ArrayList;

public class Controlador {

    ArrayList<MedioDeAlojamiento> alojamiento;

    public ArrayList<MedioDeAlojamiento> getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(ArrayList<MedioDeAlojamiento> alojamiento) {
        alojamiento = alojamiento;
    }

    public Controlador() {
        alojamiento = new ArrayList<MedioDeAlojamiento>();
    }

    //Metodo para ingresar nuevo alojamiento dependiendo si el cliente ya esta dentro de los alojamientos existentes

    public void ingresarMedioAlojamiento(MedioDeAlojamiento alojamientoNuevo) {
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamientoNuevo.getRut() == alojamiento.get(i).getRut()) {
                System.out.println("No es posible ingresar el nuevo alojamiento");
                return;
            }
        }
        alojamiento.add(alojamientoNuevo);
    }

    //Metodo para mostrar lista de alojamientos
    public void mostrarMediosDeAlojamiento() {
        for (int i = 0; i < alojamiento.size(); i++) {
            alojamiento.get(i).getDatos();
        }
    }

    public void mostrarDatosCliente(int rut, String nombre) {
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i).getRut() == rut && nombre.equalsIgnoreCase(alojamiento.get(i).getNombre())) {
                alojamiento.get(i).getDatos();
                return;
            }
        }
        System.out.println("El cliente no existe");
    }

    public int totalAdicional() {
        int totalAdicional = 0;
        for (int i = 0; i < alojamiento.size(); i++) {
            totalAdicional += (int) alojamiento.get(i).adicional();
        }
        return totalAdicional;
    }

    public int totalBonoDescuento() {
        int bonoDescuento = 0;
        for (int i = 0; i < alojamiento.size(); i++) {
            bonoDescuento += alojamiento.get(i).bonoDescuento();
        }
        return bonoDescuento;
    }

    public int cantMediosAlojamiento() {
        return alojamiento.size();
    }

    public int valorACancelarCliente(int rut) {
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i).getRut() == rut) {
                System.out.println("Datos del cliente: " + alojamiento.get(i).getRut() + " " + alojamiento.get(i).getNombre());
                return alojamiento.get(i).valorACancelar();
            }
        }
        System.out.println("El cliente no existe");
        return 0;
    }

    public int incrementarValorBase(){
        int incrementar = 0;
        for (int i = 0; i < alojamiento.size(); i++) {
            incrementar += alojamiento.get(i).incrementaValorBase();
        }
        return incrementar;
    }
}