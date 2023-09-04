import java.util.Scanner;
import java.util.ArrayList;

public class Universidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sede sede1 = new Sede();
        Sede sede2 = new Sede();
        Sede sede3 = new Sede();

        boolean go = true;

        while (go == true) {
            System.out.println("");
            System.out.println("**************************************");
            System.out.println("           Universidad 123");
            System.out.println("**************************************");
            System.out.println("Ingrese la opción que desee. \n 1: Ingresar datos \n 2: Estadísticas \n 3: Salir");
            System.out.println("");
            int opcion = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
