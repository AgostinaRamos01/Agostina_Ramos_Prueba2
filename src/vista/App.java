package vista;
import controlador.Controlador;
import modelo.Carpa;
import modelo.Hotel;
import modelo.Cabagna;

public class App {
    public static void main(String[] args) {
        int opcion;
        Controlador alojamiento = new Controlador();

        do{
            opcion = menu ();

            switch (opcion){
                case 1: //Ingresar medio alojamiento
                    ingresarAlojamiento(alojamiento);
                    break;
                case 2: //Mostrar medios de alojamiento
                    alojamiento.mostrarMediosDeAlojamiento();
                    break;
                case 3: //Mostrar datos del cliente (donde se aloja y datos asociados)
                    mostrarDatosCliente(alojamiento);
                    break;
                case 4: //Mostrar total adicional
                    System.out.println("Total adicional: " + alojamiento.totalAdicional());
                    break;
                case 5: //Mostrar total bono descuento
                    System.out.println("Total bono descuento: " + alojamiento.totalBonoDescuento());
                    break;
                case 6: //Mostrar cantidad de medios de alojamiento
                    System.out.println("Cantidad de medios de alojamientos " + alojamiento.cantMediosAlojamiento());
                    break;
                case 7: //Valor a cancelar por un cliente
                    System.out.println("Valor a cancelar: " + mostrarValorACancelar(alojamiento));
                    break;
                case 8: //Aplicar incremento del valor base
                    System.out.println("Incremento del valor base: " + alojamiento.incrementarValorBase());
                    break;
            }
        } while (opcion !=9);
}

        public static int menu (){
            System.out.println(" Sistema de Alojamiento ");
            System.out.println("1.\t Ingresar medio de alojamiento: ");
            System.out.println("2.\t Mostrar medios de alojamiento: ");
            System.out.println("3.\t Datos de un cliente: ");
            System.out.println("4.\t Total adicional: ");
            System.out.println("5.\t Total bono descuento: ");
            System.out.println("6.\t Cantidad medios de alojamiento: ");
            System.out.println("7.\t Valor a cancelar por un cliente: ");
            System.out.println("8.\t Aplicar incremento del valor base: ");
            System.out.println("9.\t Salir.");
            System.out.println("---------------------------------");
            System.out.println("Por favor ingrese una opcion!");
            return Leer.datoInt();
        }

    public static void ingresarAlojamiento(Controlador alojamiento){
        System.out.println("Nombre del cliente: ");
        String nombre = Leer.dato();
        System.out.println("Rut del cliente: ");
        int rut = Leer.datoInt();
        System.out.println("¿Que tipo de alojamiento desea? (1-Carpa, 2-Hotel 3-Cabagna) ");
        int tipoAlojamiento= Leer.datoInt();
        System.out.println("Valor Base: ");
        int valorBaseNoche = Leer.datoInt();
        System.out.println("Cantidad de noches: ");
        int cantNoches = Leer.datoInt();
        System.out.println("Temporada (Baja,Media,Alta)");
        String temporada = Leer.dato();

        switch (tipoAlojamiento){
            case 1:
                System.out.println("Cantidad de personas: ");
                int cantPersonas = Leer.datoInt();
                Carpa carpa1 = new Carpa(cantPersonas,nombre,rut,valorBaseNoche,temporada,cantNoches);
                alojamiento.ingresarMedioAlojamiento(carpa1);
                break;
            case 2:
                System.out.println("Con desayuno: (true-false)");
                boolean conDesayuno = Leer.datoBoolean();
                System.out.println("Capacidad: ");
                int capacidad = Leer.datoInt();
                System.out.println("Es fumador: (true-false)");
                boolean esFumador = Leer.datoBoolean();
                Hotel hotel1 = new Hotel (conDesayuno,capacidad,esFumador,nombre,rut,valorBaseNoche,temporada,cantNoches);
                alojamiento.ingresarMedioAlojamiento(hotel1);
                break;
            case 3:
                System.out.println("Con desayuno: ");
                boolean desayuno = Leer.datoBoolean();
                System.out.println("Capacidad: ");
                int cappacidad = Leer.datoInt();
                System.out.println("Fuma : (true-false)");
                boolean fumador = Leer.datoBoolean();
                System.out.println("Con chimenea: (true-false)");
                boolean chimenea = Leer.datoBoolean();
                Cabagna cabagna1 = new Cabagna (cappacidad,desayuno,nombre,rut,valorBaseNoche,temporada,cantNoches,fumador,chimenea);
                alojamiento.ingresarMedioAlojamiento(cabagna1);
                break;
        }

    }
    public static void mostrarDatosCliente(Controlador alojamiento){
        System.out.println("Ingrese rut del cliente: ");
        int rut = Leer.datoInt();
        System.out.println("Ingrese nombre del cliente: ");
        String nombre = Leer.dato();
        alojamiento.mostrarDatosCliente(rut, nombre);
    }
    public static int mostrarValorACancelar(Controlador alojamiento){
        System.out.println("Ingrese rut del cliente: ");
        int rut = Leer.datoInt();
        return alojamiento.valorACancelarCliente(rut);
    }
}
