public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Diego Franco"; // Correcto, y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Diego Franco 2"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Diego"; // Incorrecto
        String nombre_cliente = "Diego"; // Correcto, no aplica buenas practicas
        String _apellido = "Franco"; // Correcto y aceptable
        String $apellido = "Franco"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica las buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, aplica buenas practicas
        boolean isCasado = true; // Correcto y aplica buenas practicas *
        boolean tieneSaldo = true; // Correcto y aplica buenas practicas
        boolean hasSaldo = true; // Correcto, aplica buenas practicas *
    }
}
