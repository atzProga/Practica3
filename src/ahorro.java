import java.util.Scanner;

public class ahorro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double INTERES = 0.01;
        boolean repetir = true;

        do {
            System.out.println("Cantidad inicial de dinero:");
            double inicial = sc.nextDouble();
            while (inicial <= 0) {
                System.out.println("Debe ser positivo, ingresa otra cantidad:");
                inicial = sc.nextDouble();
            }

            System.out.println("Meta de ahorro:");
            double meta = sc.nextDouble();
            while (meta <= 0) {
                System.out.println("Debe ser positiva, ingresa otra meta:");
                meta = sc.nextDouble();
            }

            System.out.println("Ahorro mensual fijo:");
            double ahorro_mensual = sc.nextDouble();
            while (ahorro_mensual <= 0) {
                System.out.println("Debe ser positivo, ingresa otro ahorro:");
                ahorro_mensual = sc.nextDouble();
            }

            int plazo = 0;
            while (plazo == 0) {
                System.out.println("Plazo de simulacion: 1) 6 meses 2) 12 meses 3) 24 meses");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        plazo = 6;
                        break;
                    case 2:
                        plazo = 12;
                        break;
                    case 3:
                        plazo = 24;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

            double saldo = inicial;
            double intereses = 0;
            int meses_meta = 0;

            for (int mes = 1; mes <= plazo; mes++) {
                saldo += ahorro_mensual;
                double interes_mes = saldo * INTERES;
                saldo += interes_mes;
                intereses += interes_mes;
                if (saldo >= meta && meses_meta == 0) {
                    meses_meta = mes;
                }
            }

            System.out.println("Saldo final: " + saldo);
            System.out.println("Intereses generados: " + intereses);
            if (meses_meta > 0) {
                System.out.println("Meta alcanzada en " + meses_meta + " meses");
            } else {
                System.out.println("No se alcanzo la meta");
            }

            System.out.println("Realizar otra simulacion?: y/n");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                repetir = false;
            }
        } while (repetir == true);
    }
}