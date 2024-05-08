package Modelo;

public class Pelicula {
    private String director;
    private String nombre;
    private int fechaDeLanzamiento, tiempoDuracionMinutos;
    private int  evaluacion;
    private boolean incluidoEnElPlanBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTiempoDuracionMinutos() {
        return tiempoDuracionMinutos;
    }

    public void setTiempoDuracionMinutos(int tiempoDuracionMinutos) {
        this.tiempoDuracionMinutos = tiempoDuracionMinutos;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }

    public void muestraFichaTecnicaPelicula(){
        System.out.println("\n * Ficha Tecnica * ");
        System.out.println("Nombre del Titulo: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duracion: " + getTiempoDuracionMinutos() + " min");
        System.out.println("Nombre del Director: " + getDirector());
        System.out.println("Tu evaluacion del titulo: " + getEvaluacion());
        System.out.println("Incluido en el plan Basico? " + isIncluidoEnElPlanBasico() + "\n");
    }
}