public class ReservaDeHoteles {
    public static void main(String[] args) {
        System.out.println("*** Reto de Variables ***");
        var nombreCliente = "Diego Franco";
        var diasCliente = 3;
        var tarifaCliente = 890.80;
        var hasVista = false;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasCliente = " + diasCliente);
        System.out.println("tarifaCliente = " + tarifaCliente);
        System.out.println("hasVista = " + hasVista);

        // Modificamos valores

        nombreCliente = "Juan Perez";
        diasCliente = 7;
        tarifaCliente = 1090.80;
        hasVista = true;

        System.out.println();
        System.out.println("Nuevos datos");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasCliente = " + diasCliente);
        System.out.println("tarifaCliente = " + tarifaCliente);
        System.out.println("hasVista = " + hasVista);
    }
}
