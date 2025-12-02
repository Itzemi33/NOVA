import java.util.Scanner;

public class modulocalculadora {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {
        gral(false);
    }

    public static void gral(boolean volverajercicio) {
        //Variables
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        //Texto

        System.out.println(ANSI_PURPLE +
                "      █████████    █████████   █████         █████████  █████  █████ █████         █████████   ██████████      ███████    ███████████     █████████  \n" +
                "     ███░░░░░███  ███░░░░░███ ░░███         ███░░░░░███░░███  ░░███ ░░███         ███░░░░░███ ░░███░░░░███   ███░░░░░███ ░░███░░░░░███   ███░░░░░███ \n" +
                "    ███     ░░░  ░███    ░███  ░███        ███     ░░░  ░███   ░███  ░███        ░███    ░███  ░███   ░░███ ███     ░░███ ░███    ░███  ░███    ░███ \n" +
                "   ░███          ░███████████  ░███       ░███          ░███   ░███  ░███        ░███████████  ░███    ░███░███      ░███ ░██████████   ░███████████ \n" +
                "   ░███          ░███░░░░░███  ░███       ░███          ░███   ░███  ░███        ░███░░░░░███  ░███    ░███░███      ░███ ░███░░░░░███  ░███░░░░░███ \n" +
                "   ░░███     ███ ░███    ░███  ░███      █░░███     ███ ░███   ░███  ░███      █ ░███    ░███  ░███    ███ ░░███     ███  ░███    ░███  ░███    ░███ \n" +
                "    ░░█████████  █████   █████ ███████████ ░░█████████  ░░████████   ███████████ █████   █████ ██████████   ░░░███████░   █████   █████ █████   █████\n" +
                "     ░░░░░░░░░  ░░░░░   ░░░░░ ░░░░░░░░░░░   ░░░░░░░░░    ░░░░░░░░   ░░░░░░░░░░░ ░░░░░   ░░░░░ ░░░░░░░░░░      ░░░░░░░    ░░░░░   ░░░░░ ░░░░░   ░░░░░ \n" +
                "                                                                                                                                                  " +ANSI_RESET);
        do {
            System.out.println(ANSI_CYAN +
                    "                                               ╔══════════════════════════════════════════════╗\n" +
                    "                                               ║        NOVA CALCULADORA CUENTA CON:          ║\n" +
                    "                                               ╠══════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                               ║  1) Aritmética                               ║\n" +
                    "                                               ║  2) Cálculo de áreas                         ║\n" +
                    "                                               ║  3) Regla de tres                            ║\n" +
                    "                                               ║  4) Volver                                   ║" +
                    ANSI_RESET);

            System.out.println(ANSI_BLUE +
                    "                                               ╚══════════════════════════════════════════════╝" +
                    ANSI_RESET);

            System.out.print(ANSI_RESET + " Seleccione una opción: " + ANSI_RESET);

            if (teclado.hasNextInt()) {
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
                    case 4:
                        if (volverajercicio) {
                            return;
                        } else {
                            nova.general();
                        }

                        break;
                    default:
                        System.out.println("Selecciona una opción valida");
                }
            }else {
                System.out.println("Selecciona una opción valida");
                teclado.nextLine();
            }
        } while (true);

    }

    private static void aritmetica() {
        Scanner teclado2 = new Scanner(System.in);
        int eleccionAri;

            System.out.println(ANSI_CYAN +
                    "                                             ╔═════════════════════════════════════════════════╗\n" +
                    "                                             ║      BIENVENIDO A OPERACIONES ARITMÉTICAS       ║\n" +
                    "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                             ║  1) Suma                                        ║\n" +
                    "                                             ║  2) Resta                                       ║\n" +
                    "                                             ║  3) Multipicación                               ║\n" +
                    "                                             ║  4) Division                                    ║\n" +
                    "                                             ║  5) Volver                                      ║"+
                    ANSI_RESET);
            System.out.println(ANSI_YELLOW +
                    "                                             ╚═════════════════════════════════════════════════╝" +
                    ANSI_RESET);

            System.out.print(ANSI_RESET + " Elija la operación que desea realizar " + ANSI_RESET);
        do {
            if (teclado2.hasNextInt()) {
                eleccionAri = teclado2.nextInt();
                switch (eleccionAri) {
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        multiplicacion();
                        break;
                    case 4:
                        division();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Selecciona una opción valida");
                }
            }else {
                System.out.println("Selecciona una opcion valida");
                teclado2.nextLine();
            }
        } while (true);

    }

    private static void division() {
        System.out.println("                    ⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
        System.out.println(
                           "                                                     Bienvenid@ a la sección NOVA división                        \n"+
                           "                                           En esta sección podras dividir números enteros y decimales                 ");
        System.out.println("                    ⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String repetir;

        do {
            System.out.print("Ingresa un número inicial para comenzar la división: ");
            double division = teclado.nextDouble(); 
            String opcion = "s";

            // Ciclo que divide muchos números
            while (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingresa un número a dividir: ");
                double num = teclado.nextDouble();
                if (num != 0) {
                    division = division / num;
                } else {
                    System.out.println("No se puede dividir por cero. Intenta nuevamente.");
                }
                System.out.print("¿Quieres dividir otro número? (s/n): ");
                opcion = teclado.next();
            }
            System.out.println("El resultado de la división es: " + division);

            System.out.print("¿Quieres repetir la sección de división? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void multiplicacion()
    {
            System.out.println("                     ◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
            System.out.println(
                               "                                                  Bienvenid@ a la sección NOVA multiplicación                        \n"+
                               "                                         En esta sección podras multiplicar números enteros y decimales                 ");
            System.out.println("                     ◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        Scanner teclado = new Scanner(System.in);
        String repetir = "s";

        do {
            System.out.print("Ingresa un número inicial para comenzar la multiplicación: ");
            double multiplicacion = teclado.nextDouble();
            String opcion = "s";

            // Ciclo que multiplica muchos númerosssssssss
            while (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingresa un número a multiplicar: ");
                double num = teclado.nextDouble();
                multiplicacion = multiplicacion * num;
                System.out.print("¿Quieres multiplicar otro número? (s/n): ");
                opcion = teclado.next();
            }
            System.out.println("El resultado de la multiplicación es: " + multiplicacion);

            System.out.print("¿Quieres repetir la sección de multiplicación? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void resta() {
        System.out.println("                           ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        System.out.println(
                           "                                                           Bienvenid@ a la sección NOVA resta                                    \n" +
                           "                                                En esta sección podras restar números enteros y decimales                       ");
        System.out.println("                           ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
                Scanner teclado = new Scanner(System.in);
                String repetir = "s";
                do
                {
                    System.out.print("Ingresa un número inicial para comenzar la resta: ");
                    double resta = teclado.nextDouble();
                    String opcion = "s";
                    // Ciclo que resta muchos númerossssss
                    while (opcion.equalsIgnoreCase("s"))
                    {
                        System.out.print("Ingresa un número a restar: ");
                        double num = teclado.nextDouble();
                        resta = resta - num;
                        System.out.print("¿Quieres restar otro número? (s/n): ");
                        opcion = teclado.next();
                    }
                    System.out.println("El resultado de la resta es: " + resta);

                    System.out.print("¿Quieres repetir la sección de resta? (s/n): ");
                    repetir = teclado.next();
                } while (repetir.equalsIgnoreCase("s"));
    }
    private static void suma() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("                           ##################################################################################################");
        System.out.println(
                           "                                                              Bienvenid@ a la sección NOVA suma                           \n"+
                           "                                                 En esta sección podrás sumar números enteros y decimales               ");
        System.out.println("                           ##################################################################################################");

        String repetir = "s";

        do {
            double suma = 0;
            String opcion = "s";

            // Ciclo que suma muchos números
            while (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingresa un número: ");
                double num = teclado.nextDouble();
                suma = suma + num;
                System.out.print("¿Quieres agregar otro número? (s/n): ");
                opcion = teclado.next();
            }
            System.out.println("El resultado es: " + suma);

            System.out.print("¿Quieres repetir la sección de suma? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));

    }

    private static void calculoDeAreas() {

        Scanner teclado = new Scanner(System.in);
        int eleccioncalc;
        System.out.println("Bienvenid@ a calculo de áreas");
       System.out.println(ANSI_CYAN +
               "                                              ╔═════════════════════════════════════════════════╗\n" +
               "                                              ║    BIENVENIDO A LA CALCULADORA DE DE ÁREAS:     ║\n" +
               "                                              ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

       System.out.println(ANSI_PURPLE +
               "                                              ║  1) Triángulo                                   ║\n" +
               "                                              ║  2) Rectángulo                                  ║\n" +
               "                                              ║  3) Cuadrado                                    ║\n" +
               "                                              ║  4) Circulo                                     ║\n"+
               "                                              ║  5) Trapecio                                    ║\n"+
               "                                              ║  6) Rombo                                       ║\n"+
               "                                              ║  7) Volver                                      ║" +
               ANSI_RESET);
       System.out.println(ANSI_YELLOW +
               "                                              ╚═════════════════════════════════════════════════╝" +
               ANSI_RESET);

       System.out.print(ANSI_RESET + " Elija la operación que desea realizar " + ANSI_RESET);
        do{
        if (teclado.hasNextInt()) {
            eleccioncalc = teclado.nextInt();
            teclado.nextLine();

            switch (eleccioncalc) {
                case 1:
                    triangulo();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    cuadrado();
                    break;
                case 4:
                    circulo();
                    break;
                case 5:
                    trapecio();
                    break;
                case 6:
                    rombo();
                    break;
                case 7:
                    nova.general();
                    break;
                default:
                    System.out.println("Selecciona una opción valida");
            }
        }else {
            System.out.println("Selecciona una opcion valida");
            teclado.nextLine();
        }
   } while (true);

    }

    private static void circulo() {
        System.out.println(
                "                            ●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
        System.out.println(
                "                                                           Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_PURPLE +
                "                                              _______ _______ _______ _______ _______ _______ _______ \n" +
                "                                             |\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                             | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                             | |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                             | |C  | | |I  | | |R  | | |C  | | |U  | | |L  | | |O  | |\n" +
                "                                             | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                             |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                         "+ANSI_RESET);
        System.out.println(
                "                                               En esta sección podras calcular el área de un círculo                    ");
        System.out.println(
                "                            ●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
        System.out.println(
                "                                                                Formula del área de un circulo                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                           A = π·r²                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double radio, area, radioCua;
            double PI = 3.1416;


            do {
                System.out.print(ANSI_RESET + " Radio: " + ANSI_RESET);
                radio = teclado.nextDouble();
                if (radio<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (radio<=0);
            radioCua = radio * radio;
            area = PI * radioCua;
            System.out.println(ANSI_PURPLE+"Area de circulo ="+area+ANSI_RESET);


            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));

    }

    private static void cuadrado() {
        System.out.println(
                "                            ▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣");
        System.out.println(
                "                                                           Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_BLUE +
                "                                       _______ _______ _______ _______ _______ _______ _______ _______ \n" +
                "                                       |\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                       | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                       | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                       | |C  | | |U  | | |A  | | |D  | | |R  | | |A  | | |D  | | |O  | |\n" +
                "                                       | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                       |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                                 "+ANSI_RESET);
        System.out.println(
                "                                           En esta sección podras calcular el área de un cuadrado                    ");
        System.out.println(
                "                            ▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣");
        System.out.println(
                "                                                         Formula del área de un cuadrado                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                     A = L·L                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double lado, area;

            do {
                System.out.print(ANSI_RESET + " Longitud de un lado: " + ANSI_RESET);
                lado = teclado.nextDouble();
                if (lado<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (lado<=0);
            area = lado * lado;
            System.out.println(ANSI_PURPLE+"Area del cuadrado ="+area+ANSI_RESET);


            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void rombo() {
        System.out.println(
                "                            ◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈");
        System.out.println(
                "                                                               Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_BLUE +
                "                                                       _______ _______ _______ _______ _______ \n" +
                "                                                       |\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                                       | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                                       | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                                       | |R  | | |O  | | |M  | | |B  | | |O  | |\n" +
                "                                                       | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                                       |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                       "+ANSI_RESET);
        System.out.println(
                "                                                    En esta sección podras calcular el área de un rombo         ");
        System.out.println(
                "                            ◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈");
        System.out.println("\n" +
                "                                                          Formula del área de un rombo                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                  A = (D·d)/2                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double dMayor, dMenor,multi, area;

            do {
                System.out.print(ANSI_RESET + " Diagonal mayor: " + ANSI_RESET);
                dMayor = teclado.nextDouble();
                if (dMayor<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (dMayor<=0);

            do {
                System.out.print(ANSI_RESET + " Diagonal menor: " + ANSI_RESET);
                dMenor = teclado.nextDouble();
                if (dMenor<= 0 || dMenor>dMayor) {
                    System.out.println("Ingrese un valor menor a la diagonal mayor");
                }
            }while (dMenor<=0 || dMenor>dMayor);
            multi = dMayor * dMenor;
            area = multi/2;
            System.out.println(ANSI_PURPLE+"Area del rombo ="+area+ANSI_RESET);


            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void trapecio() {
        System.out.println(
                "                            ◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩");
        System.out.println(
                "                                                                Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_PURPLE + "                                                                 \n" +
                "                                               _______ _______ _______ _______ _______ _______ _______ _______ \n" +
                "                                               |\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                               | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                               | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                               | |T  | | |R  | | |A  | | |P  | | |E  | | |C  | | |I  | | |O  | |\n" +
                "                                               | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                               |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                                 \n"+ANSI_RESET);
        System.out.println(
                "                                                   En esta sección podras calcular el área de un trapecio                    ");
        System.out.println(
                "                            ◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩");
        System.out.println("\n" +
                "                                                              Formula del área de un trapecio                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                   A = [(B + b)/2]·h                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double bMayor,bMenor,alt,suma, div, area;

            do {
                System.out.print(ANSI_RESET + " Base mayor: " + ANSI_RESET);
                bMayor = teclado.nextDouble();
                if (bMayor<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (bMayor<=0);

            do {
                System.out.print(ANSI_RESET + " Base menor: " + ANSI_RESET);
                bMenor = teclado.nextDouble();
                if (bMenor<= 0 || bMenor>bMayor) {
                    System.out.println("La base menor no puede ser mayor a la base mayor");
                }
            }while (bMenor<=0 || bMenor>bMayor);

            do {
                System.out.print(ANSI_RESET + " Altura: " + ANSI_RESET);
                alt = teclado.nextDouble();
                if (alt<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (alt<=0);
            suma = bMayor + bMenor;
            div = suma/2;
            area= div * alt;
            System.out.println(ANSI_PURPLE+"Area del trapecio ="+area+ANSI_RESET);

            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void rectangulo() {
        System.out.println(
                "                            ▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬");
        System.out.println(
                "                                                               Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_PURPLE +"                                                                                 \n" +
                "                                   _______ _______ _______ _______ _______ _______ _______ _______ _______ _______ \n" +
                "                                   |\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                   | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                   | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                   | |R  | | |E  | | |C  | | |T  | | |A  | | |N  | | |G  | | |U  | | |L  | | |O  | |\n" +
                "                                   | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                   |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                                                 \n"+ANSI_RESET);
        System.out.println(
                "                                               En esta sección podras calcular el área de un rectángulo                    ");
        System.out.println(
                "                            ▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬");
        System.out.println("\n" +
                "                                                           Formula del área de un rectángulo                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                       A = b·h                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double base, alt, area;

            do {
                System.out.print(ANSI_RESET + " Base: " + ANSI_RESET);
                base = teclado.nextDouble();
                if (base<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (base<=0);

            do {
                System.out.print(ANSI_RESET + " Altura: " + ANSI_RESET);
                alt = teclado.nextDouble();
                if (alt<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (alt<=0);


            area = base * alt;
            System.out.println(ANSI_PURPLE+"Area del rectángulo ="+area+ANSI_RESET);


            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void triangulo() {
        System.out.println(
                "                            ▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽");
        System.out.println(
                "                                                               Bienvenid@ a la sección:                            ");
        System.out.println(ANSI_PURPLE +"                                                                         \n" +
                "                                        _______ _______ _______ _______ _______ _______ _______ _______ _______ \n" +
                "                                        |\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\\     /|\n" +
                "                                        | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                        | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | | |   | |\n" +
                "                                        | |T  | | |R  | | |I  | | |A  | | |N  | | |G  | | |U  | | |L  | | |O  | |\n" +
                "                                        | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |\n" +
                "                                        |/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|/_____\\|\n" +
                "                                                                         \n"+ANSI_RESET);
        System.out.println(
                "                                                  En esta sección podras calcular el área de un triángulo                    ");
        System.out.println(
                "                            ▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽");
        System.out.println("\n" +
                "                                                           Formula del área de un triángulo                                         ");
        System.out.println(ANSI_CYAN+
                "                                                                    A = (b·h)/2                                                     "+ANSI_RESET);

        String repetir = "s";
        do {
            Scanner teclado = new Scanner(System.in);
            double base, alt,multi, area;

            do {
                System.out.print(ANSI_RESET + " Base: " + ANSI_RESET);
                base = teclado.nextDouble();
                if (base<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (base<=0);

            do {
                System.out.print(ANSI_RESET + " Altura: " + ANSI_RESET);
                alt = teclado.nextDouble();
                if (alt<= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            }while (alt<=0);
            multi = base * alt;
            area = multi/2;
            System.out.println(ANSI_PURPLE+"Area del triangulo ="+area+ANSI_RESET);


            System.out.print("¿Quieres repetir el calculo del área? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));
    }

    private static void reglaDeTres() {
        System.out.println("                            ⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓");
        System.out.println(
                           "                                                                    Bienvenid@ a la sección:                                     \n"+ANSI_BLUE +
                           "                                                    __   __   __        __      __   __    ___  __   __  __                       \n" +
                           "                                                   |__| |_   | _  |    |__|    |  | |_      |  |__| |_  |__                       \n"+
                           "                                                   | ⋱  |__  |__| |__  |  |    |__| |__     |  | ⋱  |__  __|                      \n" +ANSI_RESET+
                                   "\n"+
                           "                                               En esta sección podras calcular algun valor utilizando regla de tres                    ");
        System.out.println("                            ⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓");
        System.out.println("\n"+ ANSI_GREEN +
                           "                                                                            DEFINICIÓN                                              " +ANSI_RESET);
        System.out.println("                                METODO MATEMÁTICO QUE PERMITE CALCULAR UN VALOR DESCONOCIDO CUANDO SE CONOCEN OTROS TRES VALORES \n" +
                           "                                                                        EN UNA PROPORCION                                                ");
        System.out.println("                            ___________________________________________________________________________________________________");
        System.out.println("                                                                    Organización de regla de tres:                                     \n" +ANSI_CYAN+
                           "                                                                             A       C                                             \n"+
                           "                                                                           ----- = -----                                           \n" +
                           "                                                                             B       D                                               "+"\n"+ANSI_RESET);

        Scanner teclado=new Scanner(System.in);
        String repetir = "s";
        do {
            String eleccion;
            do {
                System.out.println("¿Cuál es la posición de su incognita \n" + "A\n" + "B\n" + "C\n" + "D\n");
                eleccion = teclado.next().toUpperCase();

                if (!eleccion.equals("A") && !eleccion.equals("B") && !eleccion.equals("C") && !eleccion.equals("D")) {
                    System.out.println("Opción inválida, intenta de nuevo.");
                }
            }while (!eleccion.equals("A") && !eleccion.equals("B") && !eleccion.equals("C") && !eleccion.equals("D"));

            switch (eleccion) {
                case "A":
                    A();
                    break;
                case "B":
                    B();
                    break;
                case "C":
                    C();
                    break;
                case "D":
                    D();
                    break;
            }
            System.out.print("¿Quieres repetir regla de tres? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));

    }

    private static void D() {
        System.out.println("Ingresa los valores de cada variable");

            Scanner teclado = new Scanner(System.in);
            double A, B, C, D, multi;

            do {
                System.out.print(ANSI_RESET + " A: " + ANSI_RESET);
                A = teclado.nextDouble();
                if (A <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (A <= 0);

            do {
                System.out.print(ANSI_RESET + " B: " + ANSI_RESET);
                B = teclado.nextDouble();
                if (B <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (B <= 0);


            do {
                System.out.print(ANSI_RESET + " C: " + ANSI_RESET);
                C = teclado.nextDouble();
                if (C <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (C <= 0);

            multi = B * C;
            D = multi / A;

            System.out.println("El valor de la incognita D es: " + D);
    }

    private static void C() {
        System.out.println("Ingresa los valores de cada variable");

            Scanner teclado= new Scanner(System.in);
            double A, B, C, D, multi;

            do {
                System.out.print(ANSI_RESET + " A: " + ANSI_RESET);
                A = teclado.nextDouble();
                if (A <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (A <= 0);

            do {
                System.out.print(ANSI_RESET + " B: " + ANSI_RESET);
                B = teclado.nextDouble();
                if (B <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (B <= 0);


            do {
                System.out.print(ANSI_RESET + " D: " + ANSI_RESET);
                D = teclado.nextDouble();
                if (D <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (D <= 0);

            multi = D * A;
            C = multi / B;

            System.out.println("El valor de la incognita C es: " + C);
    }

    private static void B() {
        System.out.println("Ingresa los valores de cada variable");

            Scanner teclado= new Scanner(System.in);
            double A, B, C, D, multi;

            do {
                System.out.print(ANSI_RESET + " A: " + ANSI_RESET);
                A = teclado.nextDouble();
                if (A <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (A <= 0);

            do {
                System.out.print(ANSI_RESET + " C: " + ANSI_RESET);
                C = teclado.nextDouble();
                if (C <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (C <= 0);

            do {
                System.out.print(ANSI_RESET + " D: " + ANSI_RESET);
                D = teclado.nextDouble();
                if (D <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (D <= 0);

            multi = D * A;
            B = multi / C;

            System.out.println("El valor de la incognita B es: " + B);

    }

    private static void A() {
        System.out.println("Ingresa los valores de cada variable");

            Scanner teclado = new Scanner(System.in);
            double A, B, C, D, multi;

            do {
                System.out.print(ANSI_RESET + " B: " + ANSI_RESET);
                B = teclado.nextDouble();
                if (B <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (B <= 0);

            do {
                System.out.print(ANSI_RESET + " C: " + ANSI_RESET);
                C = teclado.nextDouble();
                if (C <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (C <= 0);

            do {
                System.out.print(ANSI_RESET + " D: " + ANSI_RESET);
                D = teclado.nextDouble();
                if (D <= 0) {
                    System.out.println("Ingresa un numero valido");
                }
            } while (D <= 0);

            multi = B * C;
            A = multi / D;

            System.out.println("El valor de la incognita A es: " + A);
    }
}

