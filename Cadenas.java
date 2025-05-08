import java.util.Scanner;
public class Cadenas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Escribe tu apellido");
        String apellido = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre + " " + apellido);

    }
}