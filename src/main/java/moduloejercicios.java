import java.util.Scanner;

public class moduloejercicios
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static int puntos = 0;
    static int ejercicioactualaritmetica = 0;
    static int ejercicioactualregladetres = 0;
    static int ejercicioactualcalcareas = 0;
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
            if (ejercicioactualaritmetica == problemas.length) {
                System.out.println("Acabaste todos los ejercicios felicidades");
                System.out.println("Sumaste un total de " + puntos + " Novashots");
                System.out.println("Presiona ENTER para salir");
                sc.nextLine();
                return;
            }
            else {
                System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                sc.nextLine();
            }

        }
    }

    private static void regladetres()
    {
        Scanner sc = new Scanner(System.in);
        String []problemas=
                {
                        "2 kilos de manzanas cuestan $40. ¿Cuánto cuestan 5 kilos?",
                        "3 cuadernos cuestan $90. ¿Cuánto cuestan 7 cuadernos?",
                        "Un coche recorre 120 km con 10 litros de gasolina. ¿Cuántos km recorrerá con 25 litros?",
                        "4 litros de pintura cubren 20 m². ¿Cuántos m² cubrirán 10 litros?",
                        "6 horas de trabajo producen 18 piezas. ¿Cuántas piezas se producen en 15 horas?",
                        "8 metros de tela cuestan $560. ¿Cuánto cuestan 15 metros?",
                        "Una impresora imprime 240 hojas en 12 minutos. ¿Cuántas hojas imprimirá en 30 minutos?"


                };
        String []respuestascorrectas = {"100","210","300","50","45","1050","600"};
        String []explicaciones = {
                "Debes multiplicar los 5 kg por $40 y dividir entre 2 kg",
                "Debes multiplicar los 7 cuadernos por $90 y dividir entre 3 cuadernos",
                "Debes multiplicar los 25 lt por 120 km y dividir entre 10 lt",
                "Debes multiplicar los 10 lt por 20 m² y dividir entre 4 lt",
                "Debes multiplicar las 15 horas por 18 piezas y dividir entre 6 horas",
                "Debes multiplicar los 15 m por $560 y dividir entre 8 m",
                "Debes multiplicar los 30 min por 240 hojas y dividir entre 12 minutos"
        };
        for (int i = ejercicioactualregladetres; i < problemas.length ; i++){
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
            ejercicioactualregladetres = i + 1;
            if (ejercicioactualregladetres == problemas.length) {
                System.out.println("Acabaste todos los ejercicios felicidades");
                System.out.println("Sumaste un total de " + puntos + " Novashots");
                System.out.println("Presiona ENTER para salir");
                sc.nextLine();
                return;
            }
            else {
                System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                sc.nextLine();
            }

        }
    }

    private static void calculoareas()
    {
        Scanner sc = new Scanner(System.in);
        String []problemas=
                {
                        "",
                        "",
                };
        String []respuestascorrectas = {"",""};
        String []explicaciones = {
                "",
                ""
        };
        for (int i = ejercicioactualcalcareas; i < problemas.length ; i++){
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
            ejercicioactualcalcareas = i + 1;
            if (ejercicioactualcalcareas == problemas.length) {
                System.out.println("Acabaste todos los ejercicios felicidades");
                System.out.println("Sumaste un total de " + puntos + " Novashots");
                System.out.println("Presiona ENTER para salir");
                sc.nextLine();
                return;
            }
            else {
                System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                sc.nextLine();
            }

        }
    }
    
}
