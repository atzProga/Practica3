import java.util.Scanner;

public class amigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int OPC_SUMAS = 1;
        final int OPC_RESULTADO = 2;
        boolean repetir = true;

        do {
            System.out.println("Ingresa el primer numero:");
            int a = sc.nextInt();
            while (a <= 0) {
                System.out.println("Debe ser positivo, ingresa otro:");
                a = sc.nextInt();
            }

            System.out.println("Ingresa el segundo numero:");
            int b = sc.nextInt();
            while (b <= 0) {
                System.out.println("Debe ser positivo, ingresa otro:");
                b = sc.nextInt();
            }

            int suma_a = 0;
            int suma_b = 0;
            int divisores_a = 0;
            int divisores_b = 0;

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    suma_a += i;
                    divisores_a += 1;
                }
            }
            for (int i = 1; i < b; i++) {
                if (b % i == 0) {
                    suma_b += i;
                    divisores_b += 1;
                }
            }

            System.out.println("Que deseas mostrar? 1) Suma de divisores y resultado 2) Solo resultado");
            int opcion = sc.nextInt();
            switch (opcion) {
                case OPC_SUMAS:
                    System.out.println("Divisores propios de " + a + ": " + divisores_a + " suma: " + suma_a);
                    System.out.println("Divisores propios de " + b + ": " + divisores_b + " suma: " + suma_b);
                    break;
                case OPC_RESULTADO:
                    break;
                default:
                    System.out.println("Opcion no valida, se mostrara solo el resultado");
            }

            if (suma_a == b && suma_b == a) {
                System.out.println(a + " y " + b + " son numeros amigos");
            } else {
                System.out.println(a + " y " + b + " NO son numeros amigos");
            }

            System.out.println("Analizar otra pareja?: y/n");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                repetir = false;
            }
        } while (repetir == true);
    }
}