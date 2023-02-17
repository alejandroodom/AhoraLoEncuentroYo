import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numMin = 1;
        int numMax = 100;
        int intentos = 0;
        boolean found = false;

        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.nextLine();

        while (!found) {
            int numero = (numMax + numMin) / 2;

            System.out.println("Pruebo con " + numero + ", ¿es mayor, menor o es el número (+/-/=)?");
            String respuesta = teclado.nextLine();

            intentos++;

            switch (respuesta) {
                case "+":
                    numMin = numero + 1;
                    break;
                case "-":
                    numMax = numero - 1;
                    break;
                case "=":
                    found = true;
                    break;
                default:
                    System.out.println("Introduzca un valor válido (+/-/=).");
            }
        }

        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }
}