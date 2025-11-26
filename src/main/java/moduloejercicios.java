import java.util.Scanner;

public class moduloejercicios
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static int puntos = 0;
    static String respuestas;
    public static void main(String[] args)
    {
        gral();
    }
    public static void gral()
    {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println(ANSI_BLUE+
                "                ██████████       █████ ██████████ ███████████     █████████  █████   █████████  █████    ███████     █████████ \n" +
                "               ░░███░░░░░█      ░░███ ░░███░░░░░█░░███░░░░░███   ███░░░░░███░░███   ███░░░░░███░░███   ███░░░░░███  ███░░░░░███\n" +
                "                ░███  █ ░        ░███  ░███  █ ░  ░███    ░███  ███     ░░░  ░███  ███     ░░░  ░███  ███     ░░███░███    ░░░ \n" +
                "                ░██████          ░███  ░██████    ░██████████  ░███          ░███ ░███          ░███ ░███      ░███░░█████████ \n" +
                "                ░███░░█          ░███  ░███░░█    ░███░░░░░███ ░███          ░███ ░███          ░███ ░███      ░███ ░░░░░░░░███\n" +
                "                ░███ ░   █ ███   ░███  ░███ ░   █ ░███    ░███ ░░███     ███ ░███ ░░███     ███ ░███ ░░███     ███  ███    ░███\n" +
                "                ██████████░░████████   ██████████ █████   █████ ░░█████████  █████ ░░█████████  █████ ░░░███████░  ░░█████████ \n" +
                "                ░░░░░░░░░░  ░░░░░░░░   ░░░░░░░░░░ ░░░░░   ░░░░░   ░░░░░░░░░  ░░░░░   ░░░░░░░░░  ░░░░░    ░░░░░░░     ░░░░░░░░░  \n" +
                "                                                                              "+ANSI_RESET);
        System.out.println("                       Bienvenido NOVA EJERCICIOS    ⋙    Entra a la órbita de ejercicios y disfruta    ⋙    Estas list@!     ");
        do
        {
            System.out.println(ANSI_CYAN +
                    "                                           ╔══════════════════════════════════════════════╗\n" +
                    "                                           ║    SELECCIONA LA OPCIÓN QUE DESEES HACER:    ║\n" +
                    "                                           ╠══════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                           ║  1) Aritmética                               ║\n" +
                    "                                           ║  2) Cálculo de áreas                         ║\n" +
                    "                                           ║  3) Regla de tres                            ║\n" +
                    "                                           ║  4) Volver                                   ║" +
                    ANSI_RESET);

            System.out.println(ANSI_BLUE +
                    "                                           ╚══════════════════════════════════════════════╝" +
                    ANSI_RESET);
            opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    aritmetica();
                    break;
                case 2:
                    calculoareas();
                    break;
                case 3:
                    regladetres();
                    break;
                case 4:
                    nova.general();
                    break;
                default:
                    System.out.println("Error opcion invalida");
            }
        }
        while (opc !=4);
    }

    private static void regladetres()
    {

    }

    private static void calculoareas()
    {

    }

    private static void aritmetica()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la seccion de ejercicios de aritmetica");
        System.out.println("Por cada respuesta correcta se añadiran 5 novashots con los cuales podras seguir jugando");
        System.out.println("Comenzemos con ejercicios basicos (La dificultad ira aunmentando)");
        System.out.println("Presiona ENTER cuando estes listo");
        sc.nextLine();
        System.out.println("Ejercicio 1:");
        System.out.println("Cuanto es 5 elevado a la 3");
        respuestas= sc.nextLine();
        if (respuestas.equals("125"))
        {
            System.out.println("Correcto \n+5 Novashots");
            puntos = puntos + 5;
        }
        else
        {
            System.out.println("Respuesta incorrecta, la respuesta es: 125");
        }

        System.out.println("Presiona ENTER para ir al siguiente ejercicio");
        sc.nextLine();
        System.out.println("Ejercicio 2:");
        System.out.println("En un triángulo rectángulo, si un cateto mide 9 cm y el otro cateto mide 12 cm, ¿cuál es la hipotenusa?");
        respuestas = sc.nextLine();
        if (respuestas.equals("15"))
        {
            System.out.println("Correcto \n+5 Novashots");
            puntos = puntos + 5;
        }
        else
        {
            System.out.println("Respuesta incorrecta, la respuesta es: 15");
        }
        System.out.println("Muy bien has sumado un total de " + puntos + " Novashots");
        System.out.println("Presiona ENTER para volver al menu de ejercicios");
        sc.nextLine();


    }
}
