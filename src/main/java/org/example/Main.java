package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> historialConversiones = new ArrayList<>();
    private static LocalDateTime fecha = LocalDateTime.now();
    static String tiempo = fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConversorDeMoneda conversor = new ConversorDeMoneda();
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("****************************************\n\n" +
                    "Sea bienvenido/a al Conversor de Moneda!\n" +
                    "" +
                    "1) Dólar ==> Peso Argentino\n" +
                    "2) Peso argentino ==> Dólar\n" +
                    "3) Dólar ==> Real brasileño\n" +
                    "4) Real brasileño ==> Dólar\n" +
                    "5) Dólar ==> Peso colombiano\n" +
                    "6) Peso colombiano ==> Dólar\n" +
                    "7) Salir\n" +
                    "8) Mostrar historial de conversiones\n" +

                    "Elija una opción válida:\n\n" +
                    "****************************************");

            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el monto a convertir");
                        var monto = sc.nextDouble();
                        String resultado = conversor.convertirMoneda("USD", "ARS", monto).conversion_result() + " [ARS]";
                        System.out.println("El valor " + monto + " [USD] corresponde al valor final de ==> " + resultado);
                        historialConversiones.add("Dólar ==> Peso Argentino: " + monto + " [USD] ==> " + resultado + " Fecha de conversión: " + tiempo);
                        break;
                    case 2:
                        System.out.println("Ingrese el monto a convertir");
                        var monto1 = sc.nextDouble();
                        String resultado1 = conversor.convertirMoneda("ARS", "USD", monto1).conversion_result() + " [USD]";
                        System.out.println("El valor " + monto1 + " [ARS] corresponde al valor final de ==> " + resultado1);
                        historialConversiones.add("Peso argentino ==> Dólar: " + monto1 + " [ARS] ==> " + resultado1 + " Fecha de conversión: " + tiempo);
                        break;
                    case 3:
                        System.out.println("Ingrese el monto a convertir");
                        var monto2 = sc.nextDouble();
                        String resultado2 = conversor.convertirMoneda("USD", "BRL", monto2).conversion_result() + " [BRL]";
                        System.out.println("El valor " + monto2 + " [USD] corresponde al valor final de ==> " + resultado2);
                        historialConversiones.add("Dólar ==> Real brasileño: " + monto2 + " [USD] ==> " + resultado2 + " Fecha de conversión: " + tiempo);
                        break;
                    case 4:
                        System.out.println("Ingrese el monto a convertir");
                        var monto3 = sc.nextDouble();
                        String resultado3 = conversor.convertirMoneda("BRL", "USD", monto3).conversion_result() + " [USD]";
                        System.out.println("El valor " + monto3 + " [BRL] corresponde al valor final de ==> " + resultado3);
                        historialConversiones.add("Real brasileño ==> Dólar: " + monto3 + " [BRL] ==> " + resultado3 + " Fecha de conversión: " + tiempo);
                        break;
                    case 5:
                        System.out.println("Ingrese el monto a convertir");
                        var monto4 = sc.nextDouble();
                        String resultado4 = conversor.convertirMoneda("USD", "COP", monto4).conversion_result() + " [COP]";
                        System.out.println("El valor " + monto4 + " [USD] corresponde al valor final de ==> " + resultado4);
                        historialConversiones.add("Dólar ==> Peso colombiano: " + monto4 + " [USD] ==> " + resultado4 + " Fecha de conversión: " + tiempo);
                        break;
                    case 6:
                        System.out.println("Ingrese el monto a convertir");
                        var monto5 = sc.nextDouble();
                        String resultado5 = conversor.convertirMoneda("COP", "USD", monto5).conversion_result() + " [USD]";
                        System.out.println("El valor " + monto5 + " [COP] corresponde al valor final de ==> " + resultado5);
                        historialConversiones.add("Peso colombiano ==> Dólar: " + monto5 + " [COP] ==> " + resultado5 + " Fecha de conversión: " + tiempo);
                        break;
                    case 7:
                        System.out.println("Gracias por utilizar el conversor de monedas. ¡Hasta pronto!");
                        break;
                    case 8:
                        mostrarHistorialConversiones();
                        break;
                    default:
                        System.out.println("El valor ingresado no es una opción válida.");
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
        sc.close();
    }

    private static void mostrarHistorialConversiones() {
        if (!historialConversiones.isEmpty()){
            System.out.println("Historial de conversiones:");
            for (String conversion : historialConversiones) {
                System.out.println(conversion);
            }
        } else {
            System.out.println("No se han realizado conversiones aún.");
        }
    }
}