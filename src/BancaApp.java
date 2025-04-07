public class BancaApp {
    public static void main(String[] args) {
        //inicializa variables para el cliente
        String nombre = "Tony Stark";
        String tipoCuenta = "corriente";
        double saldo = 750000.25;

        System.out.println("##############################");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + "$"+saldo);
        System.out.println("\n##############################");

        String menu = """
                ***Escriba el número de la opción deseada:
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                """;
    }
}
