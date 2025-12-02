import java.util.Scanner;

public class moduloejercicios
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static int puntos = 0; //Novashots
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
        int next; //Variable que lee si el usuario quiere continuar haciendo ejercicios o no
        int chose; //Variable que lee si el usuario quiere empezar con los ejercicios o volver
        String[] problemas = //Arreglo de ejercios
                {
                        "¿Cuánto es 5 elevado a la 3?",
                        "En un triángulo rectángulo, si un cateto mide 9 cm y el otro 12 cm, ¿cuál es la hipotenusa?",
                        "Si tienes 920 pesos y gastas 478, ¿cuánto dinero te queda?",
                        "Un número dividido entre 6 da como resultado 54. ¿Cuál es el número?",
                        "Una fábrica produce 375 piezas cada hora. ¿Cuántas produce en 8 horas?",
                        "¿Cuál es el resultado de 780 ÷ 15?",
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
                        "Un paquete trae 24 galletas y compras 7 paquetes. ¿Cuántas galletas tienes en total?"

                };
        String[] respuestascorrectas = {"125", "15", "442", "324", "3000", "52", "91", "2940", "2232", "1711", "450", "12", "270", "70", "68", "273", "74", "570", "168"};
        String[] explicaciones = {

                "Tienes que multiplicar el numero por si mismo la cantidad de veces que indica el exponente\nEn este caso\n5x5x5=125",
                "Tenemos que usar el teorema de pitagoras\nc²=a²+b²\nSustituimos los valores en la formula:\nc²=9²+12²\nSacamos raiz de ambos lados para eliminar el cuadrado en c²\nc=√9²+12²\nAl resolver la raiz nos dara el resultado correcto",
                "Es una resta:\n920 - 478.\nHacemos la resta por columnas y obtenemos 442.",
                "Si un número dividido entre 6 da 54, entonces hacemos la operación inversa:\n54 × 6 = 324.",
                "La fábrica produce 375 piezas por hora.\nMultiplicamos:\n375 × 8 = 3000.",
                "Dividimos 780 entre 15.\nSabemos que 15 × 52 = 780.\nPor eso el resultado es 52.",
                "El cuádruple es multiplicar por 4.\nSi 4 × n = 364, dividimos:\n364 ÷ 4 = 91.",
                "Para 245 × 12 hacemos:\n245 × (10 + 2) = 2450 + 490 = 2940.",
                "Solo sumamos las ventas de ambas semanas:\n987 + 1245 = 2232.",
                "Hacemos la resta:\n3500 - 1789 = 1711.",
                "Si un número dividido entre 18 da 25, hacemos lo contrario:\n25 × 18 = 450.",
                "Repartimos 96 dulces en 8 bolsas.\n96 ÷ 8 = 12 dulces por bolsa.",
                "Multiplicamos:\n45 × 6 = (40×6) + (5×6) = 240 + 30 = 270.",
                "Dividimos:\n350 ÷ 5 = 70.",
                "Marcos compra 4 refrescos de 17 pesos:\n4 × 17 = 68.",
                "Hacemos la resta:\n560 - 287 = 273.",
                "El doble es multiplicar por 2.\nSi 2 × n = 148, entonces:\n148 ÷ 2 = 74.",
                "Cada día el auto recorre 95 km.\nMultiplicamos:\n95 × 6 = 570 km.",
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
                                modulocalculadora.gral(true);
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
                            do {
                                System.out.println("¿Quieres ir al siguiente ejercicio? 1) Si , 2) Volver");
                                if (sc.hasNextInt()) {
                                    next = sc.nextInt();
                                    sc.nextLine();
                                    if (next == 1) {
                                        break;

                                    } else if (next == 2) {
                                        System.out.println("Volviendo...");
                                        return;

                                    } else {
                                        System.out.println("Error, opcion no valida");
                                    }
                                } else {
                                    System.out.println("Error, ingresa un numero");
                                    sc.nextLine();
                                }
                            }while(true);
                        }

                    }
                } else if (chose == 2) {
                    return;
                } else {
                    System.out.println("Error, escribe 1 para comenzar o 2 para volver.");
                }
            }else{
                System.out.println("Error, escribe 1 para comenzar o 2 para volver");
                sc.nextLine();
            }
        }while(true);
    }

    private static void regladetres()
    {
        Scanner sc = new Scanner(System.in);
        int next; //Variable que lee si el usuario quiere continuar haciendo ejercicios o no
        int chose; //Variable que lee si el usuario quiere empezar con los ejercicios o volver
        String []problemas=
                {
                        "2 kilos de manzanas cuestan $40. ¿Cuánto cuestan 5 kilos?",
                        "3 cuadernos cuestan $90. ¿Cuánto cuestan 7 cuadernos?",
                        "Un coche recorre 120 km con 10 litros de gasolina. ¿Cuántos km recorrerá con 25 litros?",
                        "4 litros de pintura cubren 20 m². ¿Cuántos m² cubrirán 10 litros?",
                        "6 horas de trabajo producen 18 piezas. ¿Cuántas piezas se producen en 15 horas?",
                        "8 metros de tela cuestan $560. ¿Cuánto cuestan 15 metros?",
                        "Una impresora imprime 240 hojas en 12 minutos. ¿Cuántas hojas imprimirá en 30 minutos?",
                        "Un pintor cubre 33 m² en 2 horas. ¿Cuántos m² cubre en 9 horas?",
                        "Si 5 lápices cuestan 28 pesos, ¿cuánto cuestan 18 lápices?",
                        "Un ciclista recorre 42 km en 2 horas. ¿Cuánto tarda en recorrer 105 km?",
                        "Una máquina empaca 360 cajas en 6 horas. ¿Cuántas empaca en 14 horas?",
                        "Si 4 litros de gasolina cuestan 74 pesos, ¿cuánto costarán 11 litros?",
                        "Si 6 personas comen 18 hamburguesas, ¿cuántas comerán 14 personas?",
                        "Con 250 g de pasta se hacen 2 platos. ¿Cuánta pasta necesitas para 9 platos?",
                        "Si 1 impresora tarda 40 min en imprimir un documento, ¿cuánto tardarán 4 impresoras trabajando juntas?",
                        "Un auto recorre 360 km con 28 litros. ¿Cuánto recorre con 10 litros?",
                        "Si 3 cajas pesan 7.2 kg, ¿cuánto pesan 11 cajas iguales?",
                        "Un refrigerador consume 90 kWh al mes. ¿Cuánto consume en 7 meses?",
                        "Una manguera llena 250 L en 10 min. ¿Cuántos litros llenará en 35 min?",
                        "Un dron vuela 24 minutos con 80% de su batería. ¿Cuánto volará con 100%?"

                };
        String []respuestascorrectas = {
                "100", //Respuesta ejercicio 1
                "210", //Respuesta ejercicio 2
                "300", //Respuesta ejercicio 3
                "50", //Respuesta ejercicio 4
                "45", //Respuesta ejercicio 5
                "1050", //Respuesta ejercicio 6
                "600", //Respuesta ejercicio 7
                "148.5", //Respuesta ejercicio 8
                "100.8", //Respuesta ejercicio 9
                "5", //Respuesta ejercicio 10
                "840", //Respuesta ejercicio 11
                "203.5", //Respuesta ejercicio 12
                "42", //Respuesta ejercicio 13
                "1125", //Respuesta ejercicio 14
                "10", //Respuesta ejercicio 15
                "128.57", //Respuesta ejercicio 16
                "26.4", //Respuesta ejercicio 17
                "630", //Respuesta ejercicio 18
                "875", //Respuesta ejercicio 19
                "30" //Respuesta ejercicio 20
        };
        String []explicaciones = {
                "Debes multiplicar los 5 kg por $40 y dividir entre 2 kg",
                "Debes multiplicar los 7 cuadernos por $90 y dividir entre 3 cuadernos",
                "Debes multiplicar los 25 lt por 120 km y dividir entre 10 lt",
                "Debes multiplicar los 10 lt por 20 m² y dividir entre 4 lt",
                "Debes multiplicar las 15 horas por 18 piezas y dividir entre 6 horas",
                "Debes multiplicar los 15 m por $560 y dividir entre 8 m",
                "Debes multiplicar los 30 min por 240 hojas y dividir entre 12 minutos",
                "Debes multiplicar las 9 horas por 33 m² y dividir entre 2 horas",
                "Debes multiplicar los 18 lápices por 28 pesos y dividir entre 5 lápices",
                "Debes multiplicar los 105 km por 2 horas y dividir entre 42 km",
                "Debes multiplicar las 14 horas por 360 cajas y dividir entre 6 horas",
                "Debes multiplicar los 11 litros por 74 pesos y dividir entre 4 litros",
                "Debes multiplicar las 14 personas por 18 hamburguesas y dividir entre 6 personas",
                "Debes multiplicar los 9 platos por 250 g y dividir entre 2 platos",
                "Debes dividir los 40 minutos entre 4 impresoras (trabajan a la vez)",
                "Debes multiplicar los 10 litros por 360 km y dividir entre 28 litros",
                "Debes multiplicar las 11 cajas por 7.2 kg y dividir entre 3 cajas",
                "Debes multiplicar los 7 meses por 90 kWh y dividir entre 1 mes",
                "Debes multiplicar los 35 minutos por 250 L y dividir entre 10 minutos",
                "Debes multiplicar el 100% por 24 minutos y dividir entre 80%"
        };

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
                                modulocalculadora.gral(true);
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
                            do {
                                System.out.println("¿Quieres ir al siguiente ejercicio? 1) Si , 2) Volver");
                                if (sc.hasNextInt()) {
                                    next = sc.nextInt();
                                    sc.nextLine();
                                    if (next == 1) {
                                        break;

                                    } else if (next == 2) {
                                        System.out.println("Volviendo...");
                                        return;

                                    } else {
                                        System.out.println("Error, opcion no valida");
                                    }
                                } else {
                                    System.out.println("Error, ingresa un numero");
                                    sc.nextLine();
                                }
                            }while(true);
                        }

                    }
                } else if (chose == 2) {
                    return;

                } else {
                    System.out.println("Error, escribe 1 para comenzar o 2 para volver");

                }
            }else {
                System.out.println("Error, escribe 1 para comenzar o 2 para volver");
                sc.nextLine();
            }
        }while(true);
    }

    private static void calculoareas()
    {
        Scanner sc = new Scanner(System.in);
        int next; //Variable que lee si el usuario quiere continuar haciendo ejercicios o no
        int chose; //Variable que lee si el usuario quiere empezar con los ejercicios o volver
        String []problemas =
                {
                        "Un cuadrado tiene lados de 14 cm. ¿Cuál es su área?",
                        "Un rectángulo mide 12 cm de largo y 9 cm de ancho. ¿Cuál es su área?",
                        "Un triángulo tiene base de 10 cm y altura de 8 cm. Calcula su área.",
                        "Un círculo tiene radio de 7 cm. ¿Cuál es su área?",
                        "Un cuadrado tiene área de 121 cm². ¿Cuánto mide su lado?",
                        "Un rectángulo tiene área de 240 cm² y ancho de 15 cm. ¿Cuál es su largo?",
                        "Si la base mide 22 cm y la altura 13 cm, ¿cuál es el área (triángulo)?",
                        "Un círculo tiene diámetro de 20 cm. ¿Cuál es su área?",
                        "Un trapecio tiene bases 14 cm y 10 cm, y altura 7 cm. ¿Cuál es su área?",
                        "Un rombo tiene diagonales de 18 cm y 10 cm. ¿Cuál es su área?",
                        "Base 35 cm, altura 20 cm. Calcula el área (triángulo).",
                        "Rectángulo: Largo 25 cm, ancho 19 cm. ¿Área?",
                        "Círculo: Radio de 12 cm. ¿Área?",
                        "Trapecio: Bases 30 cm y 20 cm, altura 15 cm. ¿Área?",
                        "Cuadrado: Lado de 34 cm. ¿Área?",
                        "Círculo: Radio 25 cm. ¿Área?",
                        "Triángulo: Base 42 cm, altura 19 cm. ¿Área?",
                        "Rectángulo: Área 900 cm², ancho 30 cm. ¿Largo?",
                        "Rombo: Diagonales 32 cm y 18 cm. ¿Área?",
                        "Trapecio: Bases 45 y 27, altura 20. ¿Área?",
                };
        String []respuestascorrectas = {
                "196",     //1
                "108",     //2
                "40",      //3
                "153.86",  //4
                "11",      //5
                "16",      //6
                "143",     //7
                "314",     //8
                "84",      //9
                "90",      //10
                "350",     //11
                "475",     //12
                "452.16",  //13
                "375",     //14
                "1156",    //15
                "1962.5",  //16
                "399",     //17
                "30",      //18
                "288",     //19
                "720",     //20
        };
        String []explicaciones = {
                "Área del cuadrado = lado × lado = 14 × 14 = 196.",
                "Área del rectángulo = largo × ancho = 12 × 9 = 108.",
                "Área del triángulo = (base × altura) / 2 = (10 × 8) / 2 = 40.",
                "Área del círculo = π × r² = 3.14 × 7² = 153.86.",
                "Si área = lado², entonces lado = √121 = 11.",
                "Largo = área / ancho = 240 / 15 = 16.",
                "Área del triángulo = (22 × 13) / 2 = 143.",
                "Radio = 20/2 = 10. Área = π × 10² = 314.",
                "Área del trapecio = (B + b)/2 × h = (14 + 10)/2 × 7 = 84.",
                "Área del rombo = (D × d) / 2 = (18 × 10)/2 = 90.",
                "Área triángulo = (35 × 20)/2 = 350.",
                "Área del rectángulo = 25 × 19 = 475.",
                "Área del círculo = π × 12² = 452.16.",
                "Trapecio = (30 + 20)/2 × 15 = 375.",
                "Cuadrado = 34 × 34 = 1156.",
                "Círculo = π × 25² = 1962.5.",
                "Triángulo = (42 × 19)/2 = 399.",
                "Largo = 900 / 30 = 30.",
                "Rombo = (32 × 18)/2 = 288.",
                "Trapecio = (45 + 27)/2 × 20 = 720.",
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
                                modulocalculadora.gral(true);
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
                            do {
                                System.out.println("¿Quieres ir al siguiente ejercicio? 1) Si , 2) Volver");
                                if (sc.hasNextInt()) {
                                    next = sc.nextInt();
                                    sc.nextLine();
                                    if (next == 1) {
                                        break;

                                    } else if (next == 2) {
                                        System.out.println("Volviendo...");
                                        return;

                                    } else {
                                        System.out.println("Error, opcion no valida");
                                    }
                                } else {
                                    System.out.println("Error, ingresa un numero");
                                    sc.nextLine();
                                }
                            }while(true);
                        }

                    }
                } else if (chose == 2) {
                    return;

                } else {
                    System.out.println("Error, escribe 1 para iniciar o 2 para volver");
                }
            }else {
                System.out.println("Error, escribe 1 para iniciar o 2 para volver");
            }
        }while(true);
    }
    
}
