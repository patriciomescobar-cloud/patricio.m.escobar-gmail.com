package variables;

public class Estudiante {
    private String matricula;
    private String nombre;
    private String carrera;
    private double promedio;

    public Estudiante() {
        this.matricula = "SIN_MATRICULA";
        this.nombre = "Sin Nombre";
        this.carrera = "No Asignada";
        this.promedio = 0.0;
    }

    public Estudiante(String matricula, String nombre, String carrera, double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public boolean estaAprobado() {
        return this.promedio >= 70.0;
    }

    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Estudiante: " + this.nombre);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Promedio: " + this.promedio);
        System.out.println("Estatus: " + (estaAprobado() ? "APROBADO" : "REPROBADO"));
        System.out.println("----------------------------------------");
    }
}