import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio:");
        int precioInicial = Integer.parseInt(scanner.nextLine());
        System.out.println("El precio con IVA es de:" + (precioInicial+(precioInicial*(21/100.0f))));

    }


}
