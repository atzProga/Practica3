import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DIV_4 = 4;
        final int DIV_3 = 3;
        final int DIV_5 = 5;
        final int OPC_PARES = 1;
        final int OPC_IMPARES = 2;
        final int OPC_MULT5 = 3;
        boolean repetir = true;

        do {
            System.out.println("Ingresa un numero entero positivo N:");
            int n = sc.nextInt();
            while (n <= 0) {
                System.out.println("El numero debe ser positivo, ingresa otro:");
                n = sc.nextInt();
            }

            int suma_div4 = 0;
            int mult_3 = 0;
            int div_ambos = 0;
            int pares = 0;
            int suma_pares = 0;
            int impares = 0;
            int suma_impares = 0;
            int mult_5 = 0;
            int suma_mult5 = 0;

            for (int i = 1; i <= n; i++) {
                if (i % DIV_4 == 0) {
                    suma_div4 += i;
                }
                if (i % DIV_3 == 0) {
                    mult_3 += 1;
                }
                if (i % DIV_4 == 0 && i % DIV_3 == 0) {
                    div_ambos += 1;
                }
                if (i % 2 == 0) {
                    pares += 1;
                    suma_pares += i;
                } else {
                    impares += 1;
                    suma_impares += i;
                }
                if (i % DIV_5 == 0) {
                    mult_5 += 1;
                    suma_mult5 += i;
                }
            }

            System.out.println("Suma de numeros divisibles entre 4: " + suma_div4);
            System.out.println("Multiplos de 3: " + mult_3);
            System.out.println("Divisibles entre 3 y 4 a la vez: " + div_ambos);

            System.out.println("Que estadisticas quieres ver? 1) Pares 2) Impares 3) Multiplos de 5");
            int opcion = sc.nextInt();
            switch (opcion) {
                case OPC_PARES:
                    System.out.println("Pares: " + pares + " suma: " + suma_pares);
                    break;
                case OPC_IMPARES:
                    System.out.println("Impares: " + impares + " suma: " + suma_impares);
                    break;
                case OPC_MULT5:
                    System.out.println("Multiplos de 5: " + mult_5 + " suma: " + suma_mult5);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println("Analizar otro numero?: y/n");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                repetir = false;
            }
        } while (repetir == true);
    }
}