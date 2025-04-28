public class robot {
    private bateria bateria;
    private boolean dormido;

    public robot(){
        this.bateria = new bateria(1000);
        this.dormido = false;
    }
    public void avannzar(int pasos) {
        if (dormido){
            System.out.println(" El robot esta dormido y no puede avanzar");
            return;
        }
        if (bateriaVacia()){
            System.out.println("La bateria esta vacia, tienes que recargar el robot");
            return;
        }
        int energiaConsumida = ( pasos /100) * 10;
        int nuevaCarga = bateria.getCarga() - energiaConsumida;
        if (nuevaCarga < 0) nuevaCarga = 0;
        bateria.setCarga(nuevaCarga);
        System.out.println("El robot avanzo unos pasos");

    }
    public void retroceder(int retroceder){
        if (dormido){
            System.out.println("El robot esta dormido y no se puede retroceder");
            return;
        }
        if (bateriaVacia()){
            System.out.println("Bateria vacia recargue el robot.");
            return;
        }
        int energiaConsumida = ( pasos / 100) *10;
        int nuevaCarga = bateria.getCarga()- energiaConsumida;
        if nuevaCarga (nuevaCarga < 0) nuevaCarga = 0;
    }

}
