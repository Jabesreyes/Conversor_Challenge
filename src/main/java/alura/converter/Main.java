package alura.converter;

import java.util.Scanner;

public class Main {
    private static void menu(){
        System.out.println("**********************************************");
        System.out.println("Bienvenido al Challenge Conversor de Monedas\n");

        System.out.println("1) Dólar =>> Peso Argentino");
        System.out.println("2) Peso Argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real Brasileño");
        System.out.println("4) Real Brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso Colombiano");
        System.out.println("6) Peso Colombiano =>> Dólar\n");

        System.out.println("7) Salir del programa");
        System.out.println("-ELIJA UNA OPCION VALIDA-\n");


        System.out.println("**********************************************");
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            do{
                menu();
                int opcion = sc.nextInt();

                if(opcion == 7){
                    System.out.println("Infectando Computadora... Vuelva Pronto");

                    break;
                }
                System.out.println("Que cantidad quiere convertir?");
                double cantidad = sc.nextDouble();

                new typeOfCurrency(opcion, cantidad);

            }while(true);

        } catch (Exception e) {
            System.out.println("Finalizando aplicación...");
            throw new RuntimeException(e);
        }


    }
}




