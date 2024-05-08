import Modelo.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int opcion = 0;
            int fechaDeLanzamiento;
            int duracionEnMinutos;
            int evaluacionPelicula;
            String nombrePelicula;
            String nombreDirector;
            String nombreSerie;
            boolean incluidoEnElPlanBasico = false;
            Pelicula peliculaUsuario = new Pelicula();

            Scanner teclado = new Scanner(System.in);

            while (opcion != 9){
                String menu = """
                    \nBienvenido(a) a Screenmatch
                    1)  Registrar nueva Pelicula
                    2)  Registrar nueva Serie
                    3)  Tiempo estimado
                    ------------------------------
                    9)  Salir
                    """;
                System.out.println(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el nombre del titulo de la pelicula: ");
                        nombrePelicula = teclado.nextLine();

                        System.out.println("Ingrese nombre del Director de la pelicula");
                        nombreDirector = teclado.nextLine();

                        System.out.println("Ingrese el año de lanzamiento: ");
                        fechaDeLanzamiento = teclado.nextInt();

                        System.out.println("Ingrese la duracion de la pelicula en minutos: ");
                        duracionEnMinutos = teclado.nextInt();

                        System.out.println("Ingrese que puntuacion le daria a la pelicula 1-10:     (siendo 1 mala y 10 excelente)");
                        evaluacionPelicula = teclado.nextInt();

                        System.out.println("Esta incluido en el plan Basico? true / false");
                        if (teclado.hasNextBoolean()) {
                            incluidoEnElPlanBasico = teclado.nextBoolean();
                        }else{
                            System.out.println("No has ingresado valor válido\n");
                        }

                        peliculaUsuario.setNombre(nombrePelicula);
                        peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                        peliculaUsuario.setDirector(nombreDirector);
                        peliculaUsuario.setTiempoDuracionMinutos(duracionEnMinutos);
                        peliculaUsuario.setEvaluacion(evaluacionPelicula);
                        peliculaUsuario.setIncluidoEnElPlanBasico(incluidoEnElPlanBasico);
                        peliculaUsuario.muestraFichaTecnicaPelicula();
                        break;

                    case 2:
                        System.out.println("Ingrese el nombre del titulo de la Serie: ");
                        nombreSerie = teclado.nextLine();

                        System.out.println("Ingrese el año de lanzamiento: ");
                        fechaDeLanzamiento = teclado.nextInt(); teclado.nextLine();

                    case 3:
                        System.out.println("\nEn progreso...");
                        break;

                    case 9:
                        System.out.println("Terminado");
                        teclado.close();
                        break;
                    default:
                        System.out.println("\n  *   Opcion no valida    *");
                        break;
                }
            }
    }
}