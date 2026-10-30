import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SALIR = 5;
        int opcion;
        int numero;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1) Cuadrado de un numero");
            System.out.println("2) Cubo de un numero");
            System.out.println("3) Par o impar");
            System.out.println("4) Suma de 1 hasta un numero");
            System.out.println("5) Salir");
            System.out.println("Elige una opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero:");
                    numero = sc.nextInt();
                    if (numero > 0) {
                        long cuadrado = (long) numero * numero;
                        System.out.println("El cuadrado es: " + cuadrado);
                    } else {
                        System.out.println("El numero debe ser positivo");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa un numero:");
                    numero = sc.nextInt();
                    if (numero > 0) {
                        long cubo = (long) numero * numero * numero;
                        System.out.println("El cubo es: " + cubo);
                    } else {
                        System.out.println("El numero debe ser positivo");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa un numero:");
                    numero = sc.nextInt();
                    if (numero % 2 == 0) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("El numero es impar");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa un numero:");
                    numero = sc.nextInt();
                    if (numero > 0) {
                        long suma = 0;
                        for (int i = 1; i <= numero; i++) {
                            suma += i;
                        }
                        System.out.println("La suma de 1 hasta " + numero + " es: " + suma);
                    } else {
                        System.out.println("El numero debe ser positivo");
                    }
                    break;
                case SALIR:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (opcion != SALIR);
    }
}