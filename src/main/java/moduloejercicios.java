import java.util.Scanner;

public class moduloejercicios
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static int puntos = 0;
    static int ejercicioactualaritmetica = 0;
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

    private static void aritmetica() {
        Scanner sc = new Scanner(System.in);
        String []problemas=
                {
                        "¿Cuánto es 5 elevado a la 3?",
                        "En un triángulo rectángulo, si un cateto mide 9 cm y el otro 12 cm, ¿cuál es la hipotenusa?",
                };
        String []respuestascorrectas = {"125","15"};
        String []explicaciones = {
                "Tienes que multiplicar el numero por si mismo la cantidad de veces que indica el exponente\nEn este caso\n5x5x5=125",
                "Tenemos que usar el teorema de pitagoras\nc²=a²+b²\nSustituimos los valores en la formula:\nc²=9²+12²\nSacamos raiz de ambos lados para eliminar el cuadrado en c²\nc=√9²+12²\nAl resolver la raiz nos dara el resultado correcto"
        };
        for (int i = ejercicioactualaritmetica; i < problemas.length ; i++){
            boolean respondido = false;
            while (!respondido) {
                System.out.println("Ejercicio " + (i + 1) + ":");
                System.out.println(problemas[i]);
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("calc")) {
                    modulocalculadora.gral();
                    System.out.println("Regresando al ejercicio.");
                    continue;
                }
                if (respuesta.equalsIgnoreCase(respuestascorrectas[i])) {
                    System.out.println("Correcto +5 Novashots");
                    puntos = puntos + 5;
                } else {
                    System.out.println("Incorrecto, la respuesta correcta es: " + respuestascorrectas[i]);
                    System.out.println("Explicacion: " + explicaciones[i]);
                }
                respondido = true;
            }
            ejercicioactualaritmetica = i + 1;
            System.out.println("Presiona ENTER para ir al siguiente ejercicio");
            sc.nextLine();
        }
    }

    private static void regladetres()
    {

    }

    private static void calculoareas()
    {

    }
    
}
