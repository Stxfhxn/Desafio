package src;

import java.util.Scanner;

public class Principal {
    // Tasas de cambio fijas (1 USD a la moneda local)
    private static final double USD_TO_CLP = 800.0; // Peso chileno
    private static final double USD_TO_ARS = 240.0; // Peso argentino
    private static final double USD_TO_MXN = 17.0;  // Peso mexicano
    private static final double USD_TO_BRL = 4.9;   // Real brasileño
    private static final double USD_TO_PEN = 3.7;   // Sol peruano

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero en USD:");
        double usdAmount = scanner.nextDouble();

        System.out.println("Seleccione el país al que desea convertir el dinero:");
        System.out.println("1. Chile (CLP)");
        System.out.println("2. Argentina (ARS)");
        System.out.println("3. México (MXN)");
        System.out.println("4. Brasil (BRL)");
        System.out.println("5. Perú (PEN)");

        int choice = scanner.nextInt();
        double convertedAmount = 0.0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = usdAmount * USD_TO_CLP;
                currency = "CLP";
                break;
            case 2:
                convertedAmount = usdAmount * USD_TO_ARS;
                currency = "ARS";
                break;
            case 3:
                convertedAmount = usdAmount * USD_TO_MXN;
                currency = "MXN";
                break;
            case 4:
                convertedAmount = usdAmount * USD_TO_BRL;
                currency = "BRL";
                break;
            case 5:
                convertedAmount = usdAmount * USD_TO_PEN;
                currency = "PEN";
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }

        System.out.printf("El monto en USD %.2f convertido a %s es: %.2f %s%n", usdAmount, currency, convertedAmount, currency);
    }
}