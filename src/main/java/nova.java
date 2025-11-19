import java.util.Scanner;
public class nova {
    static String nombre;
    static String usuario;
    static String password;
    static int edad;
    public static void main(String[] args) {
        registro();
        general();
    }


    private static void registro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido (a) a NOVA (Numeros, Operaciones, Velocidad y Aventura");
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Crea un usuario:");
        usuario = sc.nextLine();
        System.out.println("Crea una contraseña:");
        password= sc.nextLine();
        System.out.println("Registro exitoso, presiona ENTER para continuar");
        sc.nextLine();


    }

    private static void general() {
        Scanner sc = new Scanner(System.in);
        int opc;

            System.out.println("==================================");
            System.out.println("     Bienvenido a tu aventura");
            System.out.println("==================================");
            System.out.println("NOVA te ayudara a estudiar y repasar de una manera divertida y sencilla");
        do {
            System.out.println("Selecciona la opcion que desees");
            System.out.println("1. Ejercicios \n2. Calculadora \n3. Juego \n4. Salir \nPara una mejor experiencia te recomendas la opcion Ejercicios para comenzar con el repaso");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    moduloejercicios();
                case 2:
                    modulocalculadora();
                case 3:
                    modulojuego();
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } while (opc != 4);

    }

    private static void modulojuego() {
        System.out.println("ok");
    }

    private static void modulocalculadora() {
    }

    private static void moduloejercicios() {
    }
}
