public class TestJuego {
    public static void main(String[] args) {
        robot robot = new robot();

        hombre hombre1 = new hombre("Juan");
        System.out.println("Hombre 1: Juan juega con el robot ***");
        hombre1.jugarConRobot(robot);

        hombre hombre2 = new hombre("Pedro");
        if (robot.estaDormido()) {
            robot.despertar();
        }
        System.out.println(" Hombre 2: Pedro juega con el robot ***");
        hombre2.jugarConRobot(robot);

        System.out.println("Fin del juego.");
    }
}
