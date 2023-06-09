package main.PrimeraParte;

public class Suma {

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 15;
        int resultado = sumar(numero1, numero2, numero3);
        System.out.println("La suma de los tres números es: " + resultado);
    }
    public static int sumar(int a, int b, int c) {
        return a+b+c;
    }

}
