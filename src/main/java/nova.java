import java.util.Scanner;
public class
nova {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static String nombre;
    static String usuario;
    static String password;
    static int edad =-1;
    public static void main(String[] args) {
        registro();
        general();
    }
    private static void registro() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_BLUE+"                                                                                                                                     \n" +
                "                                                                                                                                     \n" +
                "           NNNNNNNN        NNNNNNNN               OOOOOOOOO               VVVVVVVV           VVVVVVVV                         AAA               \n" +
                "           N:::::::N       N::::::N             OO:::::::::OO             V::::::V           V::::::V                        A:::A              \n" +
                "           N::::::::N      N::::::N           OO:::::::::::::OO           V::::::V           V::::::V                       A:::::A             \n" +
                "           N:::::::::N     N::::::N          O:::::::OOO:::::::O          V::::::V           V::::::V                      A:::::::A            \n" +
                "           N::::::::::N    N::::::N          O::::::O   O::::::O           V:::::V           V:::::V                      A:::::::::A           \n" +
                "           N:::::::::::N   N::::::N          O:::::O     O:::::O            V:::::V         V:::::V                      A:::::A:::::A          \n" +
                "           N:::::::N::::N  N::::::N          O:::::O     O:::::O             V:::::V       V:::::V                      A:::::A A:::::A         \n" +
                "           N::::::N N::::N N::::::N          O:::::O     O:::::O              V:::::V     V:::::V                      A:::::A   A:::::A        \n" +
                "           N::::::N  N::::N:::::::N          O:::::O     O:::::O               V:::::V   V:::::V                      A:::::A     A:::::A       \n" +
                "           N::::::N   N:::::::::::N          O:::::O     O:::::O                V:::::V V:::::V                      A:::::AAAAAAAAA:::::A      \n" +
                "           N::::::N    N::::::::::N          O:::::O     O:::::O                 V:::::V:::::V                      A:::::::::::::::::::::A     \n" +
                "           N::::::N     N:::::::::N          O::::::O   O::::::O                  V:::::::::V                      A:::::AAAAAAAAAAAAA:::::A    \n" +
                "           N::::::N      N::::::::N          O:::::::OOO:::::::O                   V:::::::V                      A:::::A             A:::::A   \n" +
                "           N::::::N       N:::::::N           OO:::::::::::::OO                     V:::::V                      A:::::A               A:::::A  \n" +
                "           N::::::N        N::::::N             OO:::::::::OO                        V:::V                      A:::::A                 A:::::A \n" +
                "           NNNNNNNN         NNNNNNN               OOOOOOOOO                           VVV                      AAAAAAA                   AAAAAAA\n" +
                "                                                                                                                                     "+ANSI_RESET);
        System.out.println(ANSI_PURPLE);
        System.out.println(
                "                ∷              Bienvenido a NOVA    ⋙     Entra a la órbita del juego y disfruta     ⋙    Estas list@!             ∷");
        System.out.println(
                "                                   ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷"+ANSI_RESET);

        System.out.println(
                "                    Antes de iniciar con la aventura ⋙ Registrate para ser parte de una comunidad que aprende de forma divertida!! ⋙            ");

        System.out.println(ANSI_CYAN +
                "                                             ╔═════════════════════════════════════════════════╗\n" +
                "                                             ║                      LOGIN                      ║\n" +
                "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_PURPLE+
                "                                                Nombre:                                         \n" +
                "                                                Edad:                                           \n" +
                "                                                Usuario:                                        \n" +
                "                                                Contraseña:                                     "+
                ANSI_RESET);
        System.out.println(ANSI_BLUE +
                "                                             ╚═════════════════════════════════════════════════╝" +
                ANSI_RESET);
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();
        System.out.println(ANSI_CYAN +
                "                                             ╔═════════════════════════════════════════════════╗\n" +
                "                                             ║                      LOGIN                      ║\n" +
                "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_PURPLE+
                "                                                Nombre:"+nombre+                               "\n" +
                "                                                Edad:                                           \n" +
                "                                                Usuario:                                        \n" +
                "                                                Contraseña:                                     "+
                ANSI_RESET);
        System.out.println(ANSI_BLUE +
                "                                             ╚═════════════════════════════════════════════════╝" +
                ANSI_RESET);
        boolean valida = false;
        System.out.println("Ingresa tu edad:");
        while (!valida){
            if (sc.hasNextInt()){
                edad = sc.nextInt();
                if (edad > 0 && edad < 110) {
                    valida = true;

                }
                else {
                    System.out.println("Ingresa una edad valida");
                }

            }
            else {
                System.out.println("Ingresa un numero");
                sc.next();
            }
        }
        sc.nextLine();
        System.out.println(ANSI_CYAN +
                "                                             ╔═════════════════════════════════════════════════╗\n" +
                "                                             ║                      LOGIN                      ║\n" +
                "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_PURPLE+
                "                                                Nombre:"+nombre                              + "\n" +
                "                                                Edad:"+edad                                 +"  \n" +
                "                                                Usuario:                                        \n" +
                "                                                Contraseña:                                     "+
                ANSI_RESET);
        System.out.println(ANSI_BLUE +
                "                                             ╚═════════════════════════════════════════════════╝" +
                ANSI_RESET);

        System.out.println("Crea un usuario:");
        usuario = sc.nextLine();
        System.out.println(ANSI_CYAN +
                "                                             ╔═════════════════════════════════════════════════╗\n" +
                "                                             ║                      LOGIN                      ║\n" +
                "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_PURPLE+
                "                                                Nombre:"+nombre                              +" \n" +
                "                                                Edad:"+edad                                 +"  \n" +
                "                                                Usuario:"+usuario                           +"  \n" +
                "                                                Contraseña:                                     "+
                ANSI_RESET);
        System.out.println(ANSI_BLUE +
                "                                             ╚═════════════════════════════════════════════════╝" +
                ANSI_RESET);

        System.out.println("Crea una contraseña:");
        password= sc.nextLine();
        System.out.println(ANSI_CYAN +
                "                                             ╔═════════════════════════════════════════════════╗\n" +
                "                                             ║                      LOGIN                      ║\n" +
                "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

        System.out.println(ANSI_PURPLE+
                "                                                Nombre:"+nombre                              +" \n" +
                "                                                Edad:"+edad                                 +"  \n" +
                "                                                Usuario:"+usuario                           +"  \n" +
                "                                                Contraseña:"+password                       +"  "+
                ANSI_RESET);
        System.out.println(ANSI_BLUE +
                "                                             ╚═════════════════════════════════════════════════╝" +
                ANSI_RESET);
        System.out.println("Registro exitoso, presiona ENTER para continuar");
        sc.nextLine();


    }

    private static String getLineBreak() {
        return "\n";
    }

    public static void general() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

            System.out.println(ANSI_BLUE+
                    "                                                        ███    ██  ██████  ██    ██  █████  \n" +
                    "                                                        ████   ██ ██    ██ ██    ██ ██   ██ \n" +
                    "                                                        ██ ██  ██ ██    ██ ██    ██ ███████ \n" +
                    "                                                        ██  ██ ██ ██    ██  ██  ██  ██   ██ \n" +
                    "                                                        ██   ████  ██████    ████   ██   ██ \n"+ANSI_RESET);
            System.out.println(ANSI_CYAN+
                    "                   ███╗   ███╗███████╗███╗   ██╗██╗   ██╗    ██████╗ ██████╗ ██╗███╗   ██╗ ██████╗██╗██████╗  █████╗ ██╗     \n" +
                    "                   ████╗ ████║██╔════╝████╗  ██║██║   ██║    ██╔══██╗██╔══██╗██║████╗  ██║██╔════╝██║██╔══██╗██╔══██╗██║     \n" +
                    "                   ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║    ██████╔╝██████╔╝██║██╔██╗ ██║██║     ██║██████╔╝███████║██║     \n" +
                    "                   ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║    ██╔═══╝ ██╔══██╗██║██║╚██╗██║██║     ██║██╔═══╝ ██╔══██║██║     \n" +
                    "                   ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝    ██║     ██║  ██║██║██║ ╚████║╚██████╗██║██║     ██║  ██║███████╗\n" +
                    "                   ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝     ╚═╝     ╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝ ╚═════╝╚═╝╚═╝     ╚═╝  ╚═╝╚══════╝\n" +ANSI_RESET);
            System.out.println(ANSI_CYAN +
                    "                                             ╔═════════════════════════════════════════════════╗\n" +
                    "                                             ║         SELECCIONA LA OPCIÓN QUE DESEES         ║\n" +
                    "                                             ╠═════════════════════════════════════════════════╣" + ANSI_RESET);

            System.out.println(ANSI_PURPLE +
                    "                                             ║  1) Ejercicios                                  ║\n" +
                    "                                             ║  2) Calculadora                                 ║\n" +
                    "                                             ║  3) Juego                                       ║\n" +
                    "                                             ║  4) Salir                                       ║"+
                    ANSI_RESET);
            System.out.println(ANSI_BLUE +
                    "                                             ╚═════════════════════════════════════════════════╝" +
                    ANSI_RESET);
        do {
            if (sc.hasNextInt()) {
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        moduloejercicios.gral();
                        break;
                    case 2:
                        modulocalculadora.gral();
                        break;
                    case 3:
                        modulojuego.gral();
                        break;
                    case 4:
                        int contador = 3;
                        while (contador > 0) {
                            System.out.println(contador);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            contador--;
                        }
                        System.out.println("Hasta aqui llego nuestra aventura, nos vemos pronto!");
                        break;
                    default:
                        System.out.println("Opcion no valida");

                }
            }else {
                System.out.println("Error, ingresa un numero");
                sc.nextLine();
            }
        } while (opc > 4 || opc <=0);

    }

}
