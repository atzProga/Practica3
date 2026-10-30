import java.util.Scanner;

public class resistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int RONDAS = 5;
        final double LIMITE_BAJO = 2;
        final double LIMITE_ALTO = 4;
        boolean repetir = true;

        do {
            System.out.println("Cantidad de participantes:");
            int participantes = sc.nextInt();
            while (participantes <= 0) {
                System.out.println("Debe ser mayor que cero, ingresa otra cantidad:");
                participantes = sc.nextInt();
            }

            double distancia_total = 0;
            double mayor_distancia = 0;
            int mejor_participante = 0;
            int rondas_bajo = 0;
            int rondas_medio = 0;
            int rondas_alto = 0;

            for (int p = 1; p <= participantes; p++) {
                double acumulado = 0;
                for (int r = 1; r <= RONDAS; r++) {
                    System.out.println("Participante " + p + " ronda " + r + " distancia (km):");
                    double distancia = sc.nextDouble();
                    while (distancia < 0) {
                        System.out.println("Debe ser mayor o igual a cero, ingresa otra:");
                        distancia = sc.nextDouble();
                    }
                    acumulado += distancia;

                    if (distancia < LIMITE_BAJO) {
                        rondas_bajo += 1;
                        System.out.println("Rendimiento: bajo");
                    } else if (distancia <= LIMITE_ALTO) {
                        rondas_medio += 1;
                        System.out.println("Rendimiento: medio");
                    } else {
                        rondas_alto += 1;
                        System.out.println("Rendimiento: alto");
                    }
                }
                distancia_total += acumulado;
                if (acumulado > mayor_distancia) {
                    mayor_distancia = acumulado;
                    mejor_participante = p;
                }
            }

            double promedio = distancia_total / participantes;

            System.out.println("Que estadistica quieres ver? 1) Distancia total 2) Promedio por participante 3) Rondas por categoria 4) Mejor participante");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Distancia total: " + distancia_total + " km");
                    break;
                case 2:
                    System.out.println("Promedio por participante: " + promedio + " km");
                    break;
                case 3:
                    System.out.println("Rondas bajo: " + rondas_bajo);
                    System.out.println("Rondas medio: " + rondas_medio);
                    System.out.println("Rondas alto: " + rondas_alto);
                    break;
                case 4:
                    System.out.println("Mejor participante: " + mejor_participante + " con " + mayor_distancia + " km");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println("Registrar otra competencia?: y/n");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                repetir = false;
            }
        } while (repetir == true);
    }
}