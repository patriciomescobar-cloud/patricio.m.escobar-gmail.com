package variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===\n");

        Estudiante estudiante1 = new Estudiante("A01234567", "Carlos Gómez", "Ingeniería de Software", 88.5);
        Estudiante estudiante2 = new Estudiante("A09876543", "María Fernández", "Sistemas Computacionales", 65.0);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setMatricula("A05554433");
        estudiante3.setNombre("Luis Martínez");
        estudiante3.setCarrera("Tecnologías de la Información");
        estudiante3.setPromedio(92.0);

        System.out.println("Mostrando expedientes académicos:");
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        System.out.println("\n--> Actualizando promedio de María Fernández a 75.0...");
        estudiante2.setPromedio(75.0);
        estudiante2.mostrarInformacion();
    }
}