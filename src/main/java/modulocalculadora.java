import java.util.Scanner;

public class modulocalculadora {
    public static void main(String[] args) {

        //Variables
        Scanner teclado = new Scanner(System.in);
        int eleccion;

        //Texto
        System.out.println("⋙⋙⋙⋙⋙¡¡Bienvenido a la seccion de calculadora!!⋘⋘⋘⋘⋘");
        do{
        System.out.println("Seleccione la operación que desea realizar");
        System.out.println("1. Aritmetica \n2. Calculo de areas \n3. Regla de tres");

        eleccion = teclado.nextInt();


            switch (eleccion) {
                case 1:
                    aritmetica();
                    break;
                case 2:
                    calculoDeAreas();
                    break;
                case 3:
                    reglaDeTres();
                    break;
                default:
                    System.out.printf("Selecciona una opción valida");
            }
        } while (eleccion != 3);
    }

    private static void aritmetica() {
        System.out.println("Bienvenid@ a operaciones aritmeticas");
    }

    private static void calculoDeAreas() {
        System.out.println("Bienvenid@ a calculo de áreas");
    }

    private static void reglaDeTres() {
        System.out.println("Bienvenid@ a calculo de regla de tres");
    }
}
