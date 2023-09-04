import java.util.Scanner;
import java.util.ArrayList;

public class Universidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
        ArrayList<Estudiante> estudiantes2 = new ArrayList<Estudiante>();
        ArrayList<Estudiante> estudiantes3 = new ArrayList<Estudiante>();
        Sede sede1 = new Sede("Altiplano", estudiantes1);
        Sede sede2 = new Sede("Central", estudiantes2);
        Sede sede3 = new Sede("Occidente", estudiantes3);

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
                printMensaje("Ingrese su carné");
                codigoUnico = scanner.nextInt();
                scanner.nextLine();
                printMensaje("Ingrese su fecha de nacimiento");
                fecha = scanner.nextLine();
                printMensaje("Ingrese su email");
                email = scanner.nextLine();
                printMensaje("Ingrese su sede \n 1: Altiplano \n 2: Central \n 3: Occidente");
                sede = scanner.nextInt();

                switch (sede) {
                    case 1:
                        sede1.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                        break;
                    case 2:
                        sede2.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                        break;
                    case 3:
                        sede3.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email));
                        break;
                }
            }

            else if (opcion == 2) {
                printMensaje("Ingrese su sede \n 1: Altiplano \n 2: Central \n 3: Occidente");
                sede = scanner.nextInt();

                switch (sede) {
                    case 1:
                        printLista("Altiplano", sede1);
                        break;
                    case 2:
                        printLista("Central", sede2);
                        break;
                    case 3:
                        printLista("Occidente", sede3);
                        break;
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

    public static void printLista(String sede, Sede sede10) {
        System.out.println("");
        System.out.println("");
        System.out.println("Lista de estudiantes de la sede " + sede);
        sede10.getEstudiantes();
        System.out.println();
        System.out.println("");
    }
}
