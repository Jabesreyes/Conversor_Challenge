package alura.converter;

import java.util.Scanner;

public class Principal {
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
        System.out.println("-Jabesrey-");


        System.out.println("**********************************************");
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            do{
                menu();
                var opcion = sc.nextInt();

                if(opcion == 7){
                    System.out.println("Infectando Computadora... Vuelva Pronto");

                    break;
                }
                System.out.println("Que cantidad quiere convertir?");
                var amount = Double.valueOf(sc.nextLine());


            }while(true);

        } catch (Exception e) {
            System.out.println("Finalizando aplicación...");
            throw new RuntimeException(e);
        }


    }
}




