package main.Tema4;

public class Main {

    public static void main(String[] args) {
        // usando If
        int  numeroIf = -8;

        if (numeroIf < 0){
            System.out.println("El numemeroIf: "+numeroIf+ " es negativo");
        }
        else if (numeroIf > 0){
            System.out.println("El numemeroIf: "+numeroIf+ " es positivo");
        }
        else{
            System.out.println("El numemeroIf: "+numeroIf+ " es cero");
        }

        //usando while
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("el numeroWhile: "+numeroWhile);
        }

        //usando do While
        int numeroDoWhile = 0;

        do{
            numeroDoWhile++;
            System.out.println("el numeroDoWhile: "+numeroDoWhile);
        }while (numeroDoWhile < 3);

        //Usando For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("el numeroFor: "+numeroFor);
        }

        //Usando Switch

        String estacion="Otoño";

        switch (estacion){
            case "Verano":
                System.out.println("La estadion es: "+estacion);
                break;
            case "Otoño":
                System.out.println("La estadion es: "+estacion);
                break;
            case "Invierno":
                System.out.println("La estadion es: "+estacion);
                break;
            case "Primavera":
                System.out.println("La estadion es: "+estacion);
                break;
            default:
                System.out.println("No es estasion");
        }

    }
}
