import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Inmersion en Java");
        //  System.out.println("Movie of Matrix");

        int     fechaDeLanzamiento  =   1999;
        double  evaluacion   =   4.5;
        boolean incluidoEnElPlanBasico  =   true;
        double  mediaEvaluacionUsuario = 0;
        String  nombre  =   "Matrix";
        String  sinopsis =   """
                La mejor pelicula de fin de milenio
                """;

        System.out.println("Nombre de la pelicula: "    +   nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double  mediaEvaluacion =   (4.5 + 4.8 + 3)/3;
        System.out.println("Media de evaluacion de Matrix: "    +   mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver`");
        }
        
        for (int i = 1; i < 4; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa nota que darias a la pelicula de Matrix 3 diferentes: " + i);
            double  notaEvaluacion = teclado.nextDouble();
            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + notaEvaluacion);
        }
        System.out.println("La media de la pelicula " + "Matrix dada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}