public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        // Nombre completo
        var nombreCompleto = "Diego Franco Gomez";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Normalizar el nombre
        var nombreNormalizado = nombreCompleto.strip();
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = " Global Mentoring ";
        var extensionDominio = ".com.mx";

        // Normalizamos
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;

        // Creamos el Email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
