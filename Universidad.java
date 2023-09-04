import java.util.Scanner;
import java.util.ArrayList;

public class Universidad {
    public static void main(String[] args) {
        //Configuración de sedes
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
        ArrayList<Estudiante> estudiantes2 = new ArrayList<Estudiante>();
        ArrayList<Estudiante> estudiantes3 = new ArrayList<Estudiante>();
        Sede sede1 = new Sede("Altiplano", estudiantes1);
        Sede sede2 = new Sede("Central", estudiantes2);
        Sede sede3 = new Sede("Occidente", estudiantes3);

        //Configuración de exámenes
        ArrayList<String> examenes = new ArrayList<String>();
        examenes.add("Matemática");
        examenes.add("Lenguaje");
        examenes.add("Química");
        examenes.add("Física");
        examenes.add("Comprensión Lectora");
        examenes.add("Estadística");

        //Variables para guardar datos del estudiante
        String nombre;
        String apellido;
        int codigoUnico;
        String fecha;
        String email;
        int sede;
        int num;
        int examen;
        int nota;
        ArrayList<Examen> examenesObj = new ArrayList<Examen>();
        

        boolean go = true;

        while (go == true) { // Ciclo del programa principal
            printMenu(); // Menú principal
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) { // Opción para agregar un estudiante con sus exámenes
                examenesObj.clear();

                printMensaje("Ingrese el nombre");
                nombre = scanner.nextLine();
                printMensaje("Ingrese el apellido");
                apellido = scanner.nextLine();
                printMensaje("Ingrese el carné");
                codigoUnico = scanner.nextInt();
                scanner.nextLine();
                printMensaje("Ingrese la fecha de nacimiento");
                fecha = scanner.nextLine();
                printMensaje("Ingrese el email");
                email = scanner.nextLine();
                printMensaje("Ingrese la sede \n 1: Altiplano \n 2: Central \n 3: Occidente");
                sede = scanner.nextInt();
                scanner.nextLine();
                printMensaje("Ingrese el número de exámenes del estudiante");
                num = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < num; i++) {
                    printPreguntaExamenes(examenes);
                    examen = scanner.nextInt();
                    scanner.nextLine();

                    preguntarNota();
                    nota = scanner.nextInt();
                    scanner.nextLine();



                    switch (examen) {
                        case 0:
                            examenesObj.add(new Examen("Matemática", nota));
                            break;
                        case 1:
                            examenesObj.add(new Examen("Lenguaje", nota));
                            break;
                        case 2:
                            examenesObj.add(new Examen("Química", nota));
                            break;
                        case 3:
                            examenesObj.add(new Examen("Física", nota));
                            break;
                        case 4:
                            examenesObj.add(new Examen("Compresión Lectora", nota));
                            break;
                        case 5:
                            examenesObj.add(new Examen("Estadística", nota));
                            break;

                    }
                }

                switch (sede) {
                    case 1:
                        sede1.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email, examenesObj));
                        break;
                    case 2:
                        sede2.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email, examenesObj));
                        break;
                    case 3:
                        sede3.setEstudiantes(new Estudiante(nombre, apellido, codigoUnico, fecha, email, examenesObj));
                        break;
                }
            }
            
            else if (opcion == 2) { // Opción para mostrar la lista de estudiantes de cada sede
                printMensaje("Ingrese la sede \n 1: Altiplano \n 2: Central \n 3: Occidente");
                sede = scanner.nextInt();
                scanner.nextLine();

                switch (sede) {
                    case 1:
                        printSedes("Altiplano", sede1);
                        break;
                    case 2:
                        printSedes("Central", sede2);
                        break;
                    case 3:
                        printSedes("Occidente", sede3);
                }
            }

            else if (opcion == 3) { // Opción de estadísticas
                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Promedio");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getPromedio(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Promedio");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getPromedio(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Promedio");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getPromedio(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Mediana");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMediana(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Mediana");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMediana(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Mediana");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMediana(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Moda");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getModa(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Moda");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getModa(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Moda");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getModa(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Desviación Estándar");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getDesviacionEstandar(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Desviación Estándar");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getDesviacionEstandar(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Desviación Estándar");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getDesviacionEstandar(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Max");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMax(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Max");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMax(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Max");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMax(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Altiplano - Min");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMin(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Central - Min");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMin(examenes.get(i)));
                }

                System.out.println("");
                System.out.println("");
                System.out.println("Sede Occidente - Min");
                System.out.println("");
                for (int i = 0; i < examenes.size(); i ++) {
                    System.out.println(examenes.get(i) + ": " + sede1.getMin(examenes.get(i)));
                }
            }

            else if (opcion == 4) { // Opción para salir
                go = false;
            }
        }
    }

    public static void printMenu() {
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("           Universidad 123");
        System.out.println("**************************************");
        System.out.println("Ingrese la opción que desee. \n 1: Ingresar examenes de un estudiante \n 2: Desplegar lista de estudiantes de cada sede \n 3: Estadísticas \n 4: Salir");
        System.out.println("");
    }

    public static void printMensaje(String mensaje) {
        System.out.println("");
        System.out.println("");
        System.out.println(mensaje);
        System.out.println("");
    }

    public static void printSedes(String sede, Sede sede10) {
        System.out.println("");
        System.out.println("");
        System.out.println("Lista de estudiantes de la sede " + sede);
        sede10.getEstudiantes();
        System.out.println();
        System.out.println("");
    }

    public static void printPreguntaExamenes(ArrayList<String> examenes1) {
        System.out.println("");
        System.out.println("");
        System.out.println("Seleccione un examen");
        System.out.println("");

        for (int i = 0; i < examenes1.size(); i ++) {
            System.out.println(i + ": " + examenes1.get(i));
        }

        System.out.println();
        System.out.println("");
    }

    public static void preguntarNota() {
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese la nota");
        System.out.println("");
    }
}
