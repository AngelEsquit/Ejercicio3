import java.util.Scanner;
import java.util.ArrayList;

public class Universidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sede sede1 = new Sede();
        Sede sede2 = new Sede();
        Sede sede3 = new Sede();

        sede1.setNombre("Altiplano");
        sede2.setNombre("Central");
        sede3.setNombre("Occidente");

        String nombre;
        String apellido;
        int codigoUnico;
        String fecha;
        String email;
        int sede;

        boolean go = true;

        while (go == true) {
            printMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                printMensaje("Ingrese su nombre");
                nombre = scanner.nextLine();
                printMensaje("Ingrese su apellido");
                apellido = scanner.nextLine();
                printMensaje("Ingrese su fecha de nacimiento");
                codigoUnico = scanner.nextInt();
                printMensaje("Ingrese su carné");
                fecha = scanner.nextLine();
                printMensaje("Ingrese su email");
                email = scanner.nextLine();
                printMensaje("Ingrese su sede \n 1: Altiplano \n 2: Central \n 3: Occidente");
                sede = scanner.nextInt();
                switch (sede) {
                    case 1:
                        sede1.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                    case 2:
                        sede2.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                    case 3:
                        sede3.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("           Universidad 123");
        System.out.println("**************************************");
        System.out.println("Ingrese la opción que desee. \n 1: Ingresar datos del estudiante \n 2: Ingresar notas \n 3: Estadísticas \n 4: Salir");
        System.out.println("");
    }

    public static void printMensaje(String mensaje) {
        System.out.println("");
        System.out.println("");
        System.out.println(mensaje);
        System.out.println("");
    }
}
