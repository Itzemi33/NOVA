import java.util.*;
public class modulojuego {
    static final int ANCHO = 19;
    static final int ALTO = 20;

    static final char VACIO = ' ';
    static final char ENEMIGO = '*';
    static final char NAVE = 'A';
    static final char DISPARO = '|';
    static final String ANSI_RESET = "\u001B[0m";
    static final String ROSA = "\u001B[38;2;255;182;193m";
    static final String AZUL = "\u001B[38;2;135;206;250m";
    static final String MORADO = "\u001B[38;2;216;191;216m";
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
            System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
            System.out.println("                    ∷                                             Gran trabajo!!                                                                   ∷");
            System.out.println("                    ∷       Bienvenido NOVA    ⋙    Entra a la órbita de juego y disfruta    ⋙    Estas list@!                                    ∷");
            System.out.println("                    ∷                                                                                                                               ∷\n");
            System.out.println("                    ∷                        Tienes " + balasDisponibles + " novashots y hay " + cantidadEnemigos + " naves enemigas.       ∷ ");
            System.out.println("                    ∷                  ¿Desea comenzar el juego? (1 = si, 2 = no, 3 = elegir color de tu nave):                                                    ∷ ");
            System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
            label:
            while (true) {
                String opcion = entrada.nextLine().trim();
                switch (opcion) {
                    case "1":
                        break label;
                    case "2":
                        System.out.println("                                                                  Regresando...");
                        entrada.close();
                        return;
                    case "3":
                        elegirColor(entrada);

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
                        System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
                        System.out.println("                    ∷                                             Gran trabajo!!                                                                   ∷");
                        System.out.println("                    ∷       Bienvenido NOVA    ⋙    Entra a la órbita de juego y disfruta    ⋙    Estas list@!                                    ∷");
                        System.out.println("                    ∷                                                                                                                               ∷\n");
                        System.out.println("                    ∷                            Tienes " + balasDisponibles + " novashots y hay " + cantidadEnemigos + " naves enemigas.       ∷ ");
                        System.out.println("                    ∷                       ¿Desea comenzar el juego? (1 = si, 2 = no, 3 = elegir color de tu nave):                                                    ∷ ");
                        System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
                        continue;
                    default:
                        System.out.println("                                                Opcion no valida. Escribe 1 para jugar o 2 para salir                  ");
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
                for (int i = 0; i < MAX_BALAS; i++) {
                    if (!balaActiva[i]) continue;

                    int nuevaFila = balas[i][0] - 1;
                    int columna = balas[i][1];

                    boolean ledio = false;

                    for (int j = 0; j < MAX_ENEMIGOS; j++) {
                        if (!enemigoActivo[j]) continue;
                        if (enemigos[j][0] == nuevaFila && enemigos[j][1] == columna) {

                            enemigoActivo[j] = false;
                            balaActiva[i] = false;
                            balas[i][0] = -1;
                            balas[i][1] = -1;
                            ledio = true;
                            System.out.println("¡Muy bien! Eliminaste a un enemigo, continua así ");
                            break;
                        }
                    }
                    if (!ledio) {
                        if (nuevaFila >= 0) {
                            balas[i][0] = nuevaFila;
                        } else {

                            balaActiva[i] = false;
                            balas[i][0] = -1;
                            balas[i][1] = -1;
                        }
                    }
                }

                for (int i = 0; i < MAX_ENEMIGOS; i++) {
                    if (enemigoActivo[i]) {
                        enemigos[i][0]++;
                    }
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
            System.out.println("Fin del juego...Regresando...");

            while (true) {
                System.out.println("\n¿Qué deseas hacer ahora?");
                System.out.println("1. Regresar al menú del juego");
                System.out.println("2. Salir al menú principal");
                System.out.print("Opción: ");
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
            System.out.println("1. " + ROSA + "Rosa pastel" + ANSI_RESET);
            System.out.println("2. " + AZUL + "Azul pastel" + ANSI_RESET);
            System.out.println("3. " + MORADO + "Morado pastel" + ANSI_RESET);
            System.out.println("4. " + VERDE + "Verde pastel" + ANSI_RESET);
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
            if (conf.equals("1")) {
                colorNave = elegido;
                System.out.println("Color cambiado con éxito.");
                return;
            } else if (conf.equals("2")) {
                ;
            } else if (conf.equals("3")) {
                return;
            } else {
                System.out.println("Opción no válida. Regresando al menú de colores.");
            }
        }
    }
    static void imprimirTableroConColor(char[][] tablero, int naveX, int naveY) {
        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print("|");
            for (int col = 0; col < tablero[fila].length; col++) {
                char ch = tablero[fila][col];
                if (fila == naveY && col == naveX && ch == NAVE) {

                    System.out.print(colorNave + NAVE + ANSI_RESET);
                } else {
                    System.out.print(ch);
                }
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int c = 0; c < tablero[0].length; c++) {
            System.out.print((c % 10));
        }
        System.out.println();
    }

    static void imprimirTablero(char[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print("|");
            for (int col = 0; col < tablero[fila].length; col++) {
                System.out.print(tablero[fila][col]);
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int c = 0; c < tablero[0].length; c++) {
            System.out.print((c % 10));
        }
        System.out.println();
    }
}