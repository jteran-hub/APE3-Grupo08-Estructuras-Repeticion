import java.util.Scanner;

public class Ejercicio01_PromedioCalificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;
        int aprobados = 0;
        int reprobados = 0;

        double calificacion;
        double suma = 0;
        double promedio;
        double mayor = 0;
        double menor = 10;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {

            System.out.print(
                    "Ingrese la calificacion del estudiante "
                    + i + ": "
            );

            calificacion = entrada.nextDouble();

            while (calificacion < 0 || calificacion > 10) {

                System.out.println(
                        "Calificacion no valida. "
                        + "Ingrese una nota entre 0 y 10."
                );

                System.out.print("Ingrese nuevamente: ");
                calificacion = entrada.nextDouble();
            }

            suma = suma + calificacion;

            if (calificacion > mayor) {
                mayor = calificacion;
            }

            if (calificacion < menor) {
                menor = calificacion;
            }

            if (calificacion >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = suma / N;

        System.out.println();
        System.out.println("===== RESULTADOS =====");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Calificacion mayor: " + mayor);
        System.out.println("Calificacion menor: " + menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        entrada.close();
    }
}
