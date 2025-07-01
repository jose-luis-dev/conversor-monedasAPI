import java.util.Scanner;

public class PrincipalConversor {
    private static Scanner scanner = new Scanner(System.in);
    private static Double tasaARS, tasaBOB, tasaBRL,tasaCLP, tasaCOP;

    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.buscarMoneda();

        if (moneda == null){
            System.out.println("No se pudieron obtener los datos de las tasas de cambio. ");
            return;
        }

        inicializarTasas(moneda);

        while (true){
            mostrarMenu();
            int opcion = leerOpcion();
            if (opcion == 11){
                System.out.println("¡Gracias por usar el conversor de monedas! Hasta pronto.");
                break;
            }
            double monto = leerMonto();
            if (monto < 0) continue;
            procesarConversion(opcion, monto);
        }
        scanner.close();
    }


    private static void inicializarTasas(Moneda moneda){
        tasaARS = moneda.conversion_rates().get("ARS");
        tasaBOB = moneda.conversion_rates().get("BOB");
        tasaBRL = moneda.conversion_rates().get("BRL");
        tasaCLP = moneda.conversion_rates().get("CLP");
        tasaCOP = moneda.conversion_rates().get("COP");
    }

    private static void mostrarMenu(){
        System.out.println("*******************************");
        System.out.println("\n* Sea bienvenido/a al conversor de moneda*\n");
        System.out.println("1) Dólar =>> Peso argentino.");
        System.out.println("2) Peso argentino =>> Dólar.");
        System.out.println("3) Dólar =>> Peso colombiano");
        System.out.println("4) Peso colombiano =>> Dólar");
        System.out.println("5) Dólar =>> Real brasileño.");
        System.out.println("6) Real brasileño =>> Dólar.");
        System.out.println("7) Dólar =>> Peso chileno");
        System.out.println("8) Peso chileno =>> Dólar");
        System.out.println("9) Dólar =>> Boliviano");
        System.out.println("10) Boliviano =>> Dólar");
        System.out.println("11) Salir\n");
        System.out.println("Elija una opción valida: ");
        System.out.println("*******************************");
    }

    private static int leerOpcion(){
        int opcion;
        try {
            opcion = scanner.nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("Entrada inválida. Por favor, ingrese un número. ");
            scanner.nextLine();
            return -1; // Valor fuera del rango válido para forzar repertir el menú.
        }
        return opcion;
    }

    private static double leerMonto(){
        System.out.println("Ingrese el valor que desea convertir: ");
        double monto;
        try {
            monto = scanner.nextDouble();
        }catch (java.util.InputMismatchException e){
            System.out.println("Entrada inválida. Por favor, ingrese un número decimal.");
            scanner.nextLine();
            return -1;
        }
        return monto;
    }

    private static void procesarConversion(int opcion, double monto){
        switch (opcion) {
            case 1 -> System.out.printf("El valor %.2f [USD] corresponde a %.2f [ARS]\n", monto, monto * tasaARS);
            case 2 -> System.out.printf("El valor %.2f [ARS] corresponde a %.2f [USD]\n", monto, monto / tasaARS);
            case 3 -> System.out.printf("El valor %.2f [USD] corresponde a %.2f [COP]\n", monto, monto * tasaCOP);
            case 4 -> System.out.printf("El valor %.2f [COP] corresponde a %.2f [USD]\n", monto, monto / tasaCOP);
            case 5 -> System.out.printf("El valor %.2f [USD] corresponde a %.2f [BRL]\n", monto, monto * tasaBRL);
            case 6 -> System.out.printf("El valor %.2f [BRL] corresponde a %.2f [USD]\n", monto, monto / tasaBRL);
            case 7 -> System.out.printf("El valor %.2f [USD] corresponde a %.2f [CLP]\n", monto, monto * tasaCLP);
            case 8 -> System.out.printf("El valor %.2f [CLP] corresponde a %.2f [USD]\n", monto, monto / tasaCLP);
            case 9 -> System.out.printf("El valor %.2f [USD] corresponde a %.2f [BOB]\n", monto, monto * tasaBOB);
            case 10 -> System.out.printf("El valor %.2f [BOB] corresponde a %.2f [USD]\n", monto, monto / tasaBOB);
            // Opción invalida
            default -> System.out.println("Opción inválida. Por favor, seleccione un número del 1 al 11.");
        }
    }
}
