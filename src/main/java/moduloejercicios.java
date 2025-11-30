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
        int opc = 0;
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
            if (sc.hasNextInt()) {
                opc = sc.nextInt();
                sc.nextLine();
                switch (opc) {
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
            }else
            {
                System.out.println("Error, ingresa un numero");
                sc.nextLine();
            }
        }
        while (opc !=4);
    }

    private static void aritmetica() {
        Scanner sc = new Scanner(System.in);
        int chose = 0;
        String[] problemas =
                {
                        "¿Cuánto es 5 elevado a la 3?",
                        "En un triángulo rectángulo, si un cateto mide 9 cm y el otro 12 cm, ¿cuál es la hipotenusa?",
                        "Si tienes 920 pesos y gastas 478, ¿cuánto dinero te queda?",
                        "Un número dividido entre 6 da como resultado 54. ¿Cuál es el número?",
                        "Una fábrica produce 375 piezas cada hora. ¿Cuántas produce en 8 horas?",
                        ".¿Cuál es el resultado de 780 ÷ 15?",
                        "El cuádruple de un número es 364. ¿Cuál es el número?",
                        "Calcula 245 × 12.",
                        "Una tienda vende 987 productos en una semana y la siguiente vende 1245. ¿Cuántos productos vendió en total?",
                        "Si a 3500 le restas 1789, ¿qué resultado queda?",
                        "Un número dividido entre 18 da como resultado 25. ¿Cuál es el número?",
                        "Una caja contiene 96 dulces y se reparten en 8 bolsas iguales. ¿Cuántos dulces lleva cada bolsa?",
                        "¿Cuánto es 45 × 6?",
                        "¿Cuál es el resultado de 350 ÷ 5?",
                        "Marcos compra 4 refrescos de 17 pesos cada uno. ¿Cuánto gasta en total?",
                        "Si tienes 560 pesos y compras algo de 287, ¿cuánto te queda?",
                        "El doble de un número es 148. ¿Cuál es el número?",
                        "Si un auto recorre 95 km por día, ¿cuántos km viaja en 6 días?",
                        "Un paquete trae 24 galletas y compras 7 paquetes. ¿Cuántas galletas tienes en total?",

                };
        String[] respuestascorrectas = {"125", "15", "442", "324", "3000", "52", "91", "2940", "2232", "1711", "450", "12", "270", "70", "68", "273", "74", "570", "168"};
        String[] explicaciones = {

                // 1
                "Tienes que multiplicar el numero por si mismo la cantidad de veces que indica el exponente\nEn este caso\n5x5x5=125",
                // 2
                "Tenemos que usar el teorema de pitagoras\nc²=a²+b²\nSustituimos los valores en la formula:\nc²=9²+12²\nSacamos raiz de ambos lados para eliminar el cuadrado en c²\nc=√9²+12²\nAl resolver la raiz nos dara el resultado correcto",
                // 3
                "Es una resta:\n920 - 478.\nHacemos la resta por columnas y obtenemos 442.",

                // 4
                "Si un número dividido entre 6 da 54, entonces hacemos la operación inversa:\n54 × 6 = 324.",

                // 5
                "La fábrica produce 375 piezas por hora.\nMultiplicamos:\n375 × 8 = 3000.",

                // 6
                "Dividimos 780 entre 15.\nSabemos que 15 × 52 = 780.\nPor eso el resultado es 52.",

                // 7
                "El cuádruple es multiplicar por 4.\nSi 4 × n = 364, dividimos:\n364 ÷ 4 = 91.",

                // 8
                "Para 245 × 12 hacemos:\n245 × (10 + 2) = 2450 + 490 = 2940.",

                // 9
                "Solo sumamos las ventas de ambas semanas:\n987 + 1245 = 2232.",

                // 10
                "Hacemos la resta:\n3500 - 1789 = 1711.",

                // 11
                "Si un número dividido entre 18 da 25, hacemos lo contrario:\n25 × 18 = 450.",

                // 12
                "Repartimos 96 dulces en 8 bolsas.\n96 ÷ 8 = 12 dulces por bolsa.",

                // 13
                "Multiplicamos:\n45 × 6 = (40×6) + (5×6) = 240 + 30 = 270.",

                // 14
                "Dividimos:\n350 ÷ 5 = 70.",

                // 15
                "Marcos compra 4 refrescos de 17 pesos:\n4 × 17 = 68.",

                // 16
                "Hacemos la resta:\n560 - 287 = 273.",

                // 17
                "El doble es multiplicar por 2.\nSi 2 × n = 148, entonces:\n148 ÷ 2 = 74.",

                // 18
                "Cada día el auto recorre 95 km.\nMultiplicamos:\n95 × 6 = 570 km.",

                // 19
                "Un paquete trae 24 galletas.\n24 × 7 = 168 galletas en total."
        };

        if (ejercicioactualaritmetica == problemas.length) {
            System.out.println("Acabaste todos los ejercicios felicidades");
            System.out.println("Tienes un total de " + puntos + " Novashots");
            System.out.println("Presiona ENTER para salir");
            sc.nextLine();
            return;
        }

        System.out.println("Bienvenido a la seccion de ejercicios de aritmetica");
        System.out.println("Por cada ejercicio que resuelvas correctamente sumaras 5 NovaShots");
        System.out.println("Escribe 1 si estas listo o 2 para volver");
        do {
            if (sc.hasNextInt()){
                chose = sc.nextInt();
                sc.nextLine();
                if (chose == 1) {
                    for (int i = ejercicioactualaritmetica; i < problemas.length; i++) {
                        boolean respondido = false;
                        while (!respondido) {
                            System.out.println("Ejercicio " + (i + 1) + ":");
                            System.out.println(problemas[i]);
                            String respuesta = sc.nextLine();
                            if (respuesta.equalsIgnoreCase("calculadora")) {
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
                        } else {
                            System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                            sc.nextLine();
                            for (int y = 0; y < 25; y++) {
                                System.out.println();
                            }
                        }

                    }
                } else if (chose == 2) {
                    gral();
                } else {
                    System.out.println("Error, escribe 1 para comenzar o 2 para volver.");
                }
            }else{
                System.out.println("Error, escribe 1 para comenzar o 2 para volver");
                sc.nextLine();
            }
        }while(chose !=1 && chose != 2);
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
        int chose = 0;
        if (ejercicioactualregladetres == problemas.length) {
            System.out.println("Acabaste todos los ejercicios de regla de tres felicidades");
            System.out.println("Tienes un total de " + puntos + " Novashots");
            System.out.println("Presiona ENTER para salir");
            sc.nextLine();
            return;
        }

        System.out.println("Bienvenido a la seccion de ejercicios de regla de tres");
        System.out.println("Por cada ejercicio que resuelvas correctamente sumaras 5 NovaShots");

            System.out.println("Escribe 1 si estas listo o 2 para volver");
        do {
            if (sc.hasNextInt()) {
                chose = sc.nextInt();
                sc.nextLine();
                if (chose == 1) {
                    for (int i = ejercicioactualregladetres; i < problemas.length; i++) {
                        boolean respondido = false;
                        while (!respondido) {
                            System.out.println("Ejercicio " + (i + 1) + ":");
                            System.out.println(problemas[i]);
                            String respuesta = sc.nextLine();
                            if (respuesta.equalsIgnoreCase("calculadora")) {
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
                        } else {
                            System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                            sc.nextLine();
                            for (int y = 0; y < 25; y++) {
                                System.out.println();
                            }
                        }

                    }
                } else if (chose == 2) {
                    gral();

                } else {
                    System.out.println("Error, escribe 1 para comenzar o 2 para volver");

                }
            }else {
                System.out.println("Error, escribe 1 para comenzar o 2 para volver");
                sc.nextLine();
            }
        }while(chose !=1 && chose != 2);
    }

    private static void calculoareas()
    {
        Scanner sc = new Scanner(System.in);
        int chose = 0;
        String []problemas=
                {
                        "",
                        "",
                };
        String []respuestascorrectas = {"",""};
        String []explicaciones = {
                "",
                "",
        };
        System.out.println("Bienvenido a la seccion de ejercicios de regla de tres");
        System.out.println("Por cada ejercicio que resuelvas correctamente sumaras 5 NovaShots");

        System.out.println("Escribe 1 si estas listo o 2 para volver");
        do {
            if (sc.hasNextInt()) {
                chose = sc.nextInt();
                sc.nextLine();
                if (chose == 1) {
                    for (int i = ejercicioactualcalcareas; i < problemas.length; i++) {
                        boolean respondido = false;
                        while (!respondido) {
                            System.out.println("Ejercicio " + (i + 1) + ":");
                            System.out.println(problemas[i]);
                            String respuesta = sc.nextLine();
                            if (respuesta.equalsIgnoreCase("calculadora")) {
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
                        } else {
                            System.out.println("Presiona ENTER para ir al siguiente ejercicio");
                            sc.nextLine();
                        }

                    }
                } else if (chose == 2) {
                    gral();

                } else {
                    System.out.println("Error, escribe 1 para iniciar o 2 para volver");
                }
            }else {
                System.out.println("Error, escribe 1 para iniciar o 2 para volver");
            }
        }while(chose !=1 && chose != 2);
    }
    
}
