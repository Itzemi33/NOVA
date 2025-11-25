import java.sql.SQLOutput;
import java.util.Scanner;

public class modulocalculadora {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {
        gral();
    }

    public static void gral() {
        //Variables
        Scanner teclado = new Scanner(System.in);
        int eleccion;
        //Texto

        System.out.println(ANSI_PURPLE +
                " .d8888b.        d8888 888      .d8888b.  888     888 888             d8888 8888888b.   .d88888b.  8888888b.         d8888 \n" +
                "d88P  Y88b      d88888 888     d88P  Y88b 888     888 888            d88888 888  \"Y88b d88P\" \"Y88b 888   Y88b       d88888 \n" +
                "888    888     d88P888 888     888    888 888     888 888           d88P888 888    888 888     888 888    888      d88P888 \n" +
                "888           d88P 888 888     888        888     888 888          d88P 888 888    888 888     888 888   d88P     d88P 888 \n" +
                "888          d88P  888 888     888        888     888 888         d88P  888 888    888 888     888 8888888P\"     d88P  888 \n" +
                "888    888  d88P   888 888     888    888 888     888 888        d88P   888 888    888 888     888 888 T88b     d88P   888 \n" +
                "Y88b  d88P d8888888888 888     Y88b  d88P Y88b. .d88P 888       d8888888888 888  .d88P Y88b. .d88P 888  T88b   d8888888888 \n" +
                " \"Y8888P\" d88P     888 88888888 \"Y8888P\"   \"Y88888P\"  88888888 d88P     888 8888888P\"   \"Y88888P\"  888   T88b d88P     888 \n" +
                "                                                                                                                           \n" +
                " " +
                "\n" +
                ANSI_RESET);
        do {
            System.out.println(ANSI_CYAN +
                    "                                   ╔══════════════════════════════════════════════╗\n" +
                    "                                   ║        NOVA CALCULADORA CUENTA CON:          ║\n" +
                    "                                   ╠══════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                   ║  1) Aritmética                               ║\n" +
                    "                                   ║  2) Cálculo de áreas                         ║\n" +
                    "                                   ║  3) Regla de tres                            ║\n" +
                    "                                   ║  4) Volver                                   ║" +
                    ANSI_RESET);

            System.out.println(ANSI_YELLOW +
                    "                                   ╚══════════════════════════════════════════════╝" +
                    ANSI_RESET);

            System.out.print(ANSI_RESET + " Seleccione una opción: " + ANSI_RESET);

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
                    nova.general();
                default:
                    System.out.println("Selecciona una opción valida");
            }
        } while (eleccion > 4 || eleccion <= 0);

    }

    private static void aritmetica() {
        Scanner teclado2 = new Scanner(System.in);
        int eleccionAri = 0;
        do {
            System.out.println(ANSI_CYAN +
                    "                                   ╔═════════════════════════════════════════════════╗\n" +
                    "                                   ║      BIENVENIDO A OPERACIONES ARITMÉTICAS       ║\n" +
                    "                                   ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                   ║  1) Suma                                        ║\n" +
                    "                                   ║  2) Resta                                       ║\n" +
                    "                                   ║  3) Multipicación                               ║\n" +
                    "                                   ║  4) División                                    ║\n"+
                    ANSI_RESET);
            System.out.println(ANSI_YELLOW +
                    "                                   ╚═════════════════════════════════════════════════╝" +
                    ANSI_RESET);

            System.out.print(ANSI_RESET + " Elija la operación que desea realizar " + ANSI_RESET);
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
                default:
                    System.out.println("Selecciona una opción valida");
            }
        } while (eleccionAri > 3 || eleccionAri <= 0);

    }

    private static void division() {
        System.out.println("⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");
        System.out.println(
                "                          Bienvenid@ a la sección NOVA división                        \n"+
                        "                En esta sección podras dividir números enteros y decimales                 ");
        System.out.println("⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝⨝");

    }

    private static void multiplicacion()
    {
            System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
            System.out.println(
                    "                          Bienvenid@ a la sección NOVA multiplicación                        \n"+
                    "                En esta sección podras multiplicar números enteros y decimales                 ");
            System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa un número");
        double multiplicacion;
        String opcion = "s";
        // Ciclo que multiplica muchos númerosssssssssssss
        while (opcion.equalsIgnoreCase("s"))
        {
            System.out.print("Ingresa un número: ");
            double num = teclado.nextDouble();
            System.out.print("Ingresa otro número: ");
            double num2 = teclado.nextDouble();
            multiplicacion = num2 * num;
            System.out.print("¿Quieres agregar otro número? (s/n): ");
            opcion = teclado.next();
        }
    }

    private static void resta() {
        System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        System.out.println(
                "                          Bienvenid@ a la sección NOVA resta                                    \n" +
                        "                  En esta sección podras restar números enteros y decimales                       ");
        System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");

        Scanner teclado = new Scanner(System.in);
        String repetir = "s";

        do {
            double resta = 0;
            String opcion = "s";

            // Ciclo que resta muchos números
            while (opcion.equalsIgnoreCase("s")) {
                System.out.print("Ingresa un número: ");
                double num = teclado.nextDouble();
                resta = resta - num;
                System.out.print("¿Quieres agregar otro número? (s/n): ");
                opcion = teclado.next();
            }
            System.out.println("El resultado es: " + resta);

            System.out.print("¿Quieres repetir la sección de suma? (s/n): ");
            repetir = teclado.next();

        } while (repetir.equalsIgnoreCase("s"));

    }
    private static void suma() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("##################################################################################################");
        System.out.println(
                "                                  Bienvenid@ a la sección NOVA suma                           \n"+
                "                        En esta sección podrás sumar números enteros y decimales               ");
        System.out.println("##################################################################################################");

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
        int eleccioncalc=0;
        System.out.println("Bienvenid@ a calculo de áreas");
   do{
       System.out.println(ANSI_CYAN +
               "                                   ╔═════════════════════════════════════════════════╗\n" +
               "                                   ║    BIENVENIDO A LA CALCULADORA DE DE ÁREAS:     ║\n" +
               "                                   ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

       System.out.println(ANSI_PURPLE +
               "                                   ║  1) Triángulo                                   ║\n" +
               "                                   ║  2) Rectángulo                                  ║\n" +
               "                                   ║  3) Cuadrado                                    ║\n" +
               "                                   ║  4) Circulo                                     ║\n"+
               "                                   ║  5) Trapecio                                    ║\n"+
               "                                   ║  6) Rombo                                       ║" +
               ANSI_RESET);
       System.out.println(ANSI_YELLOW +
               "                                   ╚═════════════════════════════════════════════════╝" +
               ANSI_RESET);

       System.out.print(ANSI_RESET + " Elija la operación que desea realizar " + ANSI_RESET);

        eleccioncalc= teclado.nextInt();

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
            default:
                System.out.println("Selecciona una opción valida");
        }
   } while (eleccioncalc>6 || eleccioncalc<=0);

    }

    private static void circulo() {
        System.out.println("●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA circulo                          \n"+
                        "                   En esta sección podras calcular el área de un circulo                    ");
        System.out.println("●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
        System.out.println("\n" +
                           "                             Formula del área de un circulo                                         ");
        System.out.println(ANSI_CYAN+"                                        A = π·r²                                                     "+ANSI_RESET);

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
        System.out.println("▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA cuadrado                          \n"+
                        "                   En esta sección podras calcular el área de un cuadrado                    ");
        System.out.println("▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨▨▨▣▣▣▣▨▨");
        System.out.println("\n" +
                "                             Formula del área de un cuadrado                                         ");
        System.out.println(ANSI_CYAN+"                                        A = L·L                                                     "+ANSI_RESET);

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
        System.out.println("◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA rombo                          \n"+
                        "                   En esta sección podras calcular el área de un rombo                    ");
        System.out.println("◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈◆◇◈");

        System.out.println("\n" +
                "                             Formula del área de un rombo                                         ");
        System.out.println(ANSI_CYAN+"                                        A = (D·d)/2                                                     "+ANSI_RESET);

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
        System.out.println("◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA trapecio                          \n"+
                "                   En esta sección podras calcular el área de un trapecio                    ");
        System.out.println("◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩◩");
        System.out.println("\n" +
                "                             Formula del área de un trapecio                                         ");
        System.out.println(ANSI_CYAN+"                                    A = [(B + b)/2]·h                                                     "+ANSI_RESET);

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
        System.out.println("▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA rectángulo                          \n"+
                "                   En esta sección podras calcular el área de un rectangulo                    ");
        System.out.println("▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬▭▬");
        System.out.println("\n" +
                "                             Formula del área de un rectángulo                                         ");
        System.out.println(ANSI_CYAN+"                                        A = b·h                                                     "+ANSI_RESET);

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
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA triangulo                          \n"+
                        "                   En esta sección podras calcular el área de un triangulo                    ");
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽");
        System.out.println("\n" +
                "                             Formula del área de un triangulo                                         ");
        System.out.println(ANSI_CYAN+"                                        A = (b·h)/2                                                     "+ANSI_RESET);

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
        System.out.println("⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓");
        System.out.println(
                "                            Bienvenid@ a la sección NOVA calculo de regla de tres                          \n"+
                "                   En esta sección podras calcular algun valor utilizando regla de tres                    ");
        System.out.println("⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓⩓");
        System.out.println("\n"+ ANSI_CYAN+
                "                                            DEFINICIÓN                                                     " +ANSI_RESET);
        System.out.println("");
    }
}

