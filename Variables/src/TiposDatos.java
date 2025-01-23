public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (Valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoEntero = 2147483647;
        System.out.println("tipoEntero = " + tipoEntero);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (Valor default es 0.0)
        float tipoFloat = 3.14F; // F o f para indicar tipo Float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar tipo Double
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (Valor default es '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (Valor default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Diego Franco";
        System.out.println("nombre = " + nombre);
    }
}
