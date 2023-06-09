package main.SegundaParte;

public class Coche {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.añadirPuertas();

        System.out.println("Número de puertas del coche: " + miCoche.getNumeroPuertas());
    }

    private int numeroPuertas;
    public Coche() {
        numeroPuertas = 0;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void añadirPuertas() {
        numeroPuertas++;
    }

}
