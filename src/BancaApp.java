import java.util.Scanner;

public class BancaApp {
    public static void main(String[] args) {
        //inicializa variables para el cliente
        String nombre = "Tony Stark";
        String tipoCuenta = "corriente";
        double saldo = 750000.25;
        int opcion = 0;


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
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es " + "$"+saldo);
                    break;

                case 2:
                    System.out.println("Cantidad que desea retirar: ");
                    double valorRetirar = teclado.nextDouble();
                    if(valorRetirar > saldo){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    saldo -= valorRetirar;
                    System.out.println("El saldo actualizado es de " + "$"+saldo);
                    break;

                case 3:
                    System.out.println("Indique cantidad a depositar:");
                    double valorDepositado = teclado.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Su nuevo saldo es de " + "$"+saldo);
                    break;

                case 9:
                    System.out.println("Saliendo de la app. Gracias por usar nuestros servicios");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
