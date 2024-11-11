package modelo;

public class DatosCliente {
     private String nombre;
     private int rut;

     public DatosCliente(String nombre, int rut) {
          this.nombre = nombre;
          this.rut = rut;
     }

     public int getRut() {
          return rut;
     }

     public void setRut(int rut) {
          this.rut = rut;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
}
