import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String base_code = "";
        String target_code = "";

        while (true) {
            int opcion = 0;
            System.out.println("**************************");
            System.out.println("BIENVENIDO AL CONVERSOR DE MONEDAS");
            System.out.println("1) Dolar -> Peso Argentino\n" +
                    "2) Peso Argentino -> Dolar \n" +
                    "3) Dolar -> Real Brasileño \n" +
                    "4) Real Brasileño -> Dolar \n" +
                    "5) Dolar -> Peso Colombiano \n" +
                    "6) Peso Colombiano -> Dolar\n" +
                    "7) Salir\n");

            System.out.println("**************************");
            System.out.println("ELIGE LA CONVERSION");

            try {
                opcion = sc.nextInt();

                if (opcion == 7) {
                    System.out.println("Programa finalizado.");
                    break;
                }

                switch (opcion) {
                    case 1:
                        base_code = "USD";
                        target_code = "ARS";
                        break;
                    case 2:
                        base_code = "ARS";
                        target_code = "USD";
                        break;
                    case 3:
                        base_code = "USD";
                        target_code = "BRL";
                        break;
                    case 4:
                        base_code = "BRL";
                        target_code = "USD";
                        break;
                    case 5:
                        base_code = "USD";
                        target_code = "COP";
                        break;
                    case 6:
                        base_code = "COP";
                        target_code = "USD";
                        break;
                    default:
                        System.out.println("Elige otra opción");
                        continue; // Volver al inicio del bucle para pedir la opción nuevamente
                }

                System.out.println("Ingrese el monto de " + base_code + " que va a convertir a " + target_code);
                double amount = sc.nextDouble();
                BusquedaAPi busqueda = new BusquedaAPi();
                Moneda moneda = busqueda.CambioDivisa(base_code, target_code, amount);

                System.out.println("La cantidad de " + amount + " corresponde a " + moneda.conversion_result()+ target_code);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");

            }
        }

        sc.close();
    }
}

