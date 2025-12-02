import java.util.*;
public class modulojuego {
    static final int ANCHO = 19;
    static final int ALTO = 20;

    static final char VACIO = ' ';
    static final char ENEMIGO = '*';
    static final char NAVE = 'A';
    static final char DISPARO = '|';
    static final String ANSI_RESET = "\u001B[0m";
    static final String ROSA = "\u001B[38;2;255;128;171m";
    static final String AZUL = "\u001B[38;2;135;206;250m";
    static final String MORADO = "\u001B[95m";
    static final String VERDE = "\u001B[38;2;144;238;144m";
    static String colorNave = "";
    static final String RESET = "\u001B[0m";

    static final int MAX_ENEMIGOS = 20;
    static final int MAX_BALAS = 100;

    static int[][] enemigos = new int[MAX_ENEMIGOS][2];
    static boolean[] enemigoActivo = new boolean[MAX_ENEMIGOS];

    static int[][] balas = new int[MAX_BALAS][2];
    static boolean[] balaActiva = new boolean[MAX_BALAS];

    public static void main(String[] args) {
        gral();
    }

    public static void gral() {
        Scanner entrada = new Scanner(System.in);
        Random azar = new Random();

        int cantidadEnemigos = 3;
        int balasDisponibles = 6;

        mainLoop:
        while (true)
        {
            System.out.println("           ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
            System.out.println("                    ∭∭∭∭∭       ∭∭∭              ∭∭∭∭∭∭               ∭∭∭             ∭∭∭                ∭∭∭∭∭∭         ");
            System.out.println("                    ∭∭∭∭∭∭     ∭∭∭           ∭∭∭       ∭∭∭            ∭∭∭           ∭∭∭                ∭∭∭  ∭∭∭         ");
            System.out.println("                    ∭∭∭ ∭∭∭    ∭∭∭         ∭∭∭           ∭∭∭           ∭∭∭         ∭∭∭                ∭∭∭    ∭∭∭        ");
            System.out.println("                    ∭∭∭  ∭∭∭   ∭∭∭         ∭∭∭           ∭∭∭            ∭∭∭       ∭∭∭                ∭∭∭      ∭∭∭       ");
            System.out.println("                    ∭∭∭   ∭∭∭  ∭∭∭         ∭∭∭           ∭∭∭             ∭∭∭     ∭∭∭                ∭∭∭∭∭∭∭∭∭∭∭     ");
            System.out.println("                    ∭∭∭    ∭∭∭ ∭∭∭         ∭∭∭           ∭∭∭              ∭∭∭   ∭∭∭                ∭∭∭           ∭∭∭     ");
            System.out.println("                    ∭∭∭     ∭∭∭∭∭∭           ∭∭∭       ∭∭∭                 ∭∭∭ ∭∭∭                ∭∭∭             ∭∭∭    ");
            System.out.println("                    ∭∭∭       ∭∭∭∭∭              ∭∭∭∭∭∭                      ∭∭∭∭∭                 ∭∭∭              ∭∭∭  ");
            System.out.println("            ●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
            System.out.println("\n");
            System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷  ");
            System.out.println("                    ∷                                             Gran trabajo!!                                                          ∷  ");
            System.out.println("                    ∷       Bienvenido NOVA    ⋙    Entra a la órbita de juego y disfruta    ⋙    Estas list@!                          ∷   ");
            System.out.println("                    ∷                                                                                                                     ∷  ");
            System.out.println("                    ∷                        Tienes " + balasDisponibles + " novashots y hay " + cantidadEnemigos + " naves enemigas.                                                   ∷  ");
            System.out.println("                    ∷                  ¿Desea comenzar el juego? (1 = si, 2 = no, 3 = elegir color de tu nave):                           ∷  ");
            System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷  ");
            label:
            while (true) {
                String opcion = entrada.nextLine().trim();
                switch (opcion) {
                    case "1":
                        break label;
                    case "2":
                        System.out.println("                                                                  Regresando...");
                        nova.general();
                        return;
                    case "3":
                        elegirColor(entrada);
                        System.out.println("\n");
                        System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
                        System.out.println("                    ∷                                                                                                             ∷");
                        System.out.println("                    ∷                            Tienes " + balasDisponibles + " novashots y hay " + cantidadEnemigos + " naves enemigas.                                       ∷ ");
                        System.out.println("                    ∷                       ¿Desea comenzar el juego? (1 = si, 2 = no, 3 = elegir color de tu nave):              ∷ ");
                        System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");

                        continue;
                    default:
                        System.out.println("                                            Opcion no valida. Escribe 1 para jugar, 2 para salir, 3 para color de nave                ");
                        break;
                }
            }


            char[][] tablero = new char[ALTO][ANCHO];

            for (int fila = 0; fila < ALTO; fila++) {
                for (int col = 0; col < ANCHO; col++) {
                    tablero[fila][col] = VACIO;
                }
            }

            int X = ANCHO / 2;
            int Y = ALTO - 1;
            tablero[Y][X] = NAVE;
            for (int i = 0; i < MAX_ENEMIGOS; i++) {
                enemigoActivo[i] = false;
                enemigos[i][0] = -1;
                enemigos[i][1] = -1;
            }
            int placed = 0;
            boolean[] columnaUsada = new boolean[ANCHO];
            while (placed < cantidadEnemigos) {
                int c = azar.nextInt(ANCHO);
                if (!columnaUsada[c]) {
                    columnaUsada[c] = true;
                    enemigos[placed][0] = 0;
                    enemigos[placed][1] = c;
                    enemigoActivo[placed] = true;
                    placed++;
                }
            }

            for (int i = 0; i < MAX_BALAS; i++) {
                balaActiva[i] = false;
                balas[i][0] = -1;
                balas[i][1] = -1;
            }

            int intentos = 0;
            boolean juegoTerminado = false;
            boolean ganar = false;
            int turno = 0;

            label:
            while (!juegoTerminado) {
                turno++;

                for (int f = 0; f < ALTO; f++) {
                    for (int c = 0; c < ANCHO; c++) {
                        tablero[f][c] = VACIO;
                    }
                }


                tablero[Y][X] = NAVE;


                for (int i = 0; i < MAX_ENEMIGOS; i++) {
                    if (enemigoActivo[i]) {
                        int fe = enemigos[i][0], ce = enemigos[i][1];
                        if (fe >= 0 && fe < ALTO && ce >= 0 && ce < ANCHO) {
                            tablero[fe][ce] = ENEMIGO;
                        }
                    }
                }


                for (int i = 0; i < MAX_BALAS; i++) {
                    if (balaActiva[i]) {
                        int fb = balas[i][0], cb = balas[i][1];
                        if (fb >= 0 && fb < ALTO && cb >= 0 && cb < ANCHO) {
                            tablero[fb][cb] = DISPARO;
                        }
                    }
                }


                int enemigosVivos = contarEnemigosActivos();


                System.out.println("\nTurno: " + turno +
                        " | Enemigos: " + enemigosVivos +
                        " | Balas: " + balasDisponibles +
                        " | Intentos: " + intentos + "\n");


                imprimirTableroConColor(tablero, X, Y);


                if (enemigosVivos == 0) {
                    ganar = true;
                    break;
                }


                boolean hayBalasEnVuelo = contarBalasActivas() > 0;
                if (balasDisponibles <= 0 && !hayBalasEnVuelo) {
                    System.out.println("                                                              Te has quedado sin novashots. Perdiste.");
                    break;
                }


                System.out.println("                                         Presiona las teclas...para: 'a' mover izquierda, 'd' mover derecha, 's' disparar, 'q' salir");
                System.out.print("                                                                          Ingresa comando: ");

                String comando = entrada.nextLine().trim().toLowerCase();

                switch (comando) {
                    case "q":
                        System.out.println("                                                    Has salido del juego. Vuelve pronto te esperamos para regresar a la aventura!!");
                        break label;
                    case "a":
                        if (X > 0) X--;
                        break;
                    case "d":
                        if (X < ANCHO - 1) X++;
                        break;
                    case "s":
                        if (balasDisponibles > 0) {
                            balasDisponibles--;
                            intentos++;

                            boolean disparado = false;
                            for (int i = 0; i < MAX_BALAS; i++) {
                                if (!balaActiva[i]) {
                                    balaActiva[i] = true;
                                    balas[i][0] = Y - 1;
                                    balas[i][1] = X;
                                    disparado = true;
                                    break;
                                }

                            }
                            if (!disparado) {
                                System.out.println("                                                              No se pudo disparar");
                            } else {
                                System.out.println("                                                         Disparaste. Balas restantes: " + balasDisponibles);
                            }
                        } else {
                            System.out.println("                                                             No tienes novashots restantes.");
                        }
                        break;
                    default:
                        System.out.println("                                                                       Comando inválido.");
                        break;
                }
                    for (int y = 0; y < MAX_BALAS; y++) {
                        if (balaActiva[y]) {

                            int fila = balas[y][0];
                            int columna = balas[y][1];

                            int nuevaFila = fila - 1;
                            if (nuevaFila < 0) {
                                balaActiva[y] = false;
                                balas[y][0] = -1;
                                balas[y][1] = -1;
                                continue;
                            }

                            boolean elimino = false;

                            for (int j = 0; j < MAX_ENEMIGOS; j++) {
                                if (enemigoActivo[j]) {
                                    int fe = enemigos[j][0];
                                    int ce = enemigos[j][1];


                                    if ((fe == nuevaFila && ce == columna) ||
                                            (fe == fila && ce == columna)) {

                                        enemigoActivo[j] = false;
                                        enemigos[j][0] = -1;
                                        enemigos[j][1] = -1;

                                        balaActiva[y] = false;
                                        balas[y][0] = -1;
                                        balas[y][1] = -1;

                                        elimino = true;
                                        System.out.println("¡Muy bien! Eliminaste a un enemigo, continua así ");
                                        break;
                                    }
                                }
                            }


                            if (!elimino) {
                                balas[y][0] = nuevaFila;
                            }
                        }
                    }

                for (int i = 0; i < MAX_ENEMIGOS; i++) {
                    if (enemigoActivo[i])
                        enemigos[i][0]++;
                }

                for (int i = 0; i < MAX_ENEMIGOS; i++) {
                    if (enemigoActivo[i]) {
                        if (enemigos[i][0] >= Y) {
                            juegoTerminado = true;
                            System.out.println("Un enemigo llegó a tu orbita.");
                            System.out.println("Lo siento ╯︿╰ has perdido");
                            System.out.println("Vuelve a intentarlo pronto");
                            break;
                        }
                    }
                }

            }

            if (ganar) {
                System.out.println("\n¡Felicidades! Lo has logrado ");
                System.out.println("¡¡¡MISION EXITOSA!!!");
            }
            while (true) {
                System.out.println("\n¿A donde quieres viajar?");
                System.out.println("1. Regresar al menú del juego");
                System.out.println("2. Salir al menú principal");
                System.out.print("Ingresa opción: ");
                String opf = entrada.nextLine().trim();
                if (opf.equals("1")) {
                    continue mainLoop;
                } else if (opf.equals("2")) {
                    System.out.println("Regresando al menú principal...");
                    nova.general();
                    break mainLoop;

                } else {
                    System.out.println("Opción no válida.");
                }
            }
        }

        entrada.close();
    }


    static int contarEnemigosActivos() {
        int c = 0;
        for (boolean b : enemigoActivo) if (b) c++;
        return c;
    }

    static int contarBalasActivas() {
        int c = 0;
        for (boolean b : balaActiva) if (b) c++;
        return c;
    }

    static void elegirColor(Scanner entrada) {
        while (true) {
            System.out.println("\nElige el color de tu nave:");
            System.out.println("1. " + ROSA + "Rosa" + ANSI_RESET);
            System.out.println("2. " + AZUL + "Azul" + ANSI_RESET);
            System.out.println("3. " + MORADO + "Morado" + ANSI_RESET);
            System.out.println("4. " + VERDE + "Verde" + ANSI_RESET);
            System.out.println("5. Regresar");
            System.out.print("Opción: ");
            String op = entrada.nextLine().trim();
            String elegido = null;
            switch (op) {
                case "1": elegido = ROSA; break;
                case "2": elegido = AZUL; break;
                case "3": elegido = MORADO; break;
                case "4": elegido = VERDE; break;
                case "5": return;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }
            System.out.println("\nTu nave se verá así (vista previa):\n");
            System.out.println(elegido +
                    "     AAA\n" +
                    "    AA AA\n" +
                    "   AA   AA\n" +
                    "  AAAAAAAAA\n" +
                    " AA       AA\n" +
                    "AA         AA\n" + ANSI_RESET);
            System.out.print("¿Deseas usar este color? (1 = sí, 2 = no, 3 = regresar menú): ");
            String conf = entrada.nextLine().trim();
            switch (conf) {
                case "1" -> {
                    colorNave = elegido;
                    System.out.println("Color cambiado con éxito.");
                    return;
                }
                case "2" -> {
                    ;
                }
                case "3" -> {
                    return;
                }
                default -> System.out.println("Opción no válida. Regresando al menú de colores.");
            }
        }
    }
    static void imprimirTableroConColor(char[][] tablero, int naveX, int naveY)
    {
        String centrado = "                                                           ";
        for (int fila = 0; fila < tablero.length; fila++)
        {
            System.out.print(centrado +":");
            for (int col = 0; col < tablero[fila].length; col++) {
                char ch = tablero[fila][col];
                if (fila == naveY && col == naveX && ch == NAVE) {

                    System.out.print(colorNave + NAVE + ANSI_RESET);
                } else {
                    System.out.print(ch);
                }
            }
            System.out.println(":");
        }
        System.out.print(centrado + " ");
        for (int c = 0; c < tablero[0].length; c++) {
            System.out.print((c % 10) );
        }
        System.out.println();
    }
}