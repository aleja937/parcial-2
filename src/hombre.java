import java.util.Scanner;

public class hombre {
    private String hombre;

    public hombre(String nombre){
        this.hombre = nombre;
    }
    public void jugarConRobot (robot robot){
        Scanner scanner = new Scanner(System.in);int opcion;
    do{
        System.out.println("Menu de opciones");
        System.out.println("Avanzar una cantidad de pasos");
        System.out.println("retroceder una cantidad de pasos");
        System.out.println("Ver la energia actual");
        System.out.println("Dormir al robot");
        System.out.println("despertar al robot");
        System.out.println("recargar la bateria");
        System.out.print("Elija una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("¿Cuántos pasos desea avanzar?: ");
                int pasosAvanzar = scanner.nextInt();
                robot.avanzar(pasosAvanzar);
                break;
            case 2:
                System.out.print("¿Cuántos pasos desea retroceder?: ");
                int pasosRetroceder = scanner.nextInt();
                robot.retroceder(pasosRetroceder);
                break;
            case 3:
                System.out.println("Energía actual: " + robot.energiaActual());
                break;
            case 4:
                robot.dormir();
                break;
            case 5:
                robot.despertar();
                break;
            case 6:
                robot.recargar();
                break;
            default:
                System.out.println("Opción inválida.");
        }
    } while (!robot.estaDormido());
    }
}
