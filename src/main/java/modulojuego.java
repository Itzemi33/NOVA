import java.util.*;
public class modulojuego {
    public static void main(String[] args) {
        gral();

    }

    public static void gral() {
        Juego juego = new Juego();
        Juego.iniciar();
    }
}
class Juego
{

            static final int ANCHO = 20;
            static final int ALTO = 11;

            static final char VACIO = ' ';
            static final char ENEMIGO = '*';
            static final char NAVE = 'A';
            static final char DISPARO = '|';

            public static void iniciar() {
                Scanner entrada = new Scanner(System.in);
                Random azar = new Random();
                //NAVES ENEMIGAS AL AZAR

                int cantidadEnemigos = 3;
                int balasDisponibles = 6;

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
                while (true) {

                    System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");
                    System.out.println("                    ∷                                             Gran trabajo!!                                                                   ∷");
                    System.out.println("                    ∷       Bienvenido NOVA    ⋙    Entra a la órbita de juego y disfruta    ⋙    Estas list@!                                    ∷");
                    System.out.println("                    ∷                                                                                                                               ∷\n");
                    System.out.println("                    ∷                                Tienes " + balasDisponibles + " novashots y hay " + cantidadEnemigos + " naves enemigas.       ∷ ");
                    System.out.println("                    ∷                                ¿Desea comenzar el juego? (1 = si, 2 = no):                                                    ∷ ");
                    System.out.println("                    ∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷∷");

                    String opcion = entrada.nextLine().trim();
                    if (opcion.equals("1")) {
                        break;
                    } else if (opcion.equals("2")) {
                        System.out.println("Regresando...");
                        return;
                    } else {
                        System.out.println("Opcion no valida. Escribe 1 para jugar o 2 para salir");
                    }
                }
                // area de juego
                char[][] tablero = new char[ALTO][ANCHO];
                for (int fila = 0; fila < ALTO; fila++)
                    Arrays.fill(tablero[fila], VACIO);//llena espacios

                int posicionJugadorX = ANCHO / 2;
                int posicionJugadorY = ALTO - 1;

                tablero[posicionJugadorY][posicionJugadorX] = NAVE;
                //enemigos
                ArrayList<Integer> columnasEnemigas = new ArrayList<>();//hashsit por si se duplica
                while (columnasEnemigas.size() < cantidadEnemigos) {
                    int c = azar.nextInt(ANCHO);
                    if (!columnasEnemigas.contains(c))
                        columnasEnemigas.add(c);
                }
                ArrayList<int[]> enemigos = new ArrayList<>();
                //ARRAYLIST (AÑADIR O ELIMIAR ELEMENTOS)
                for (int columna : columnasEnemigas)
                    enemigos.add(new int[]{0, columna}); //empiezan arriba

                //balas
                ArrayList<int[]> balas = new ArrayList<>();

                int intentos = 0;
                boolean juegoTerminado = false;
                boolean ganar = false;
                int turno = 0;

                // ciclo de juego
                while (!juegoTerminado) {

                    turno++;

                    for (int f = 0; f < ALTO; f++)
                        Arrays.fill(tablero[f], VACIO);
                    //LLENAR

                    // mover nave
                    tablero[posicionJugadorY][posicionJugadorX] = NAVE;
                    //COORDENADAS

                    // enemigos
                    for (int[] e : enemigos) {
                        int fe = e[0], ce = e[1];
                        if (fe >= 0 && fe < ALTO && ce >= 0 && ce < ANCHO)
                            tablero[fe][ce] = ENEMIGO;
                    }

                    // disparos
                    for (int[] b : balas) {
                        int fb = b[0], cb = b[1];
                        if (fb >= 0 && fb < ALTO && cb >= 0 && cb < ANCHO)
                            tablero[fb][cb] = DISPARO;
                    }

                    // area de juego cambiada
                    System.out.println("\nTurno: " + turno +
                            " | Enemigos: " + enemigos.size() +
                            " | Balas: " + balasDisponibles +
                            " | Intentos: " + intentos + "\n");

                    imprimirTablero(tablero);

                    if (enemigos.size() == 0) {
                        ganar = true;
                        break;
                    }

                    if (balasDisponibles <= 0 && balas.isEmpty()) {
                        System.out.println("Te has quedado sin novashots. Perdiste.");
                        break;
                    }

                    // comandos
                    System.out.println("Presiona las teclas...para: 'a' mover izquierda, 'd' mover derecha, 's' disparar, 'q' salir");
                    System.out.print("Ingresa comando: ");

                    String comando = entrada.nextLine().trim().toLowerCase();
                    //TRIM(ESPACIOS),TOLOWER(MAYUSCULAS)

                    if (comando.equals("q")) {
                        System.out.println("                   Has salido del juego. Vuelve pronto te esperamos para regresar a la aventura!!");
                        break;
                    } else if (comando.equals("a")) {
                        if (posicionJugadorX > 0) posicionJugadorX--;
                    } else if (comando.equals("d")) {
                        if (posicionJugadorX < ANCHO - 1) posicionJugadorX++;
                    } else if (comando.equals("s")) {

                        if (balasDisponibles > 0) {
                            balasDisponibles--;
                            intentos++;

                            balas.add(new int[]{posicionJugadorY - 1, posicionJugadorX});
                            //AÑADIR BALA
                            System.out.println("Disparaste. Balas restantes: " + balasDisponibles);
                        } else {
                            System.out.println("No tienes novashots restantes.");
                        }

                    } else {
                        System.out.println("Comando inválido.");
                    }

                    //balas
                    ArrayList<int[]> nuevasBalas = new ArrayList<>();

                    for (int[] b : balas) {
                        int nuevaFila = b[0] - 1;
                        int columna = b[1];
                        boolean impacto = false;

                        Iterator<int[]> itEn = enemigos.iterator();
                        //ELIMINAR
                        while (itEn.hasNext()) {
                            int[] e = itEn.next();//borrar enemigo

                            if (e[0] == nuevaFila && e[1] == columna) {
                                itEn.remove();//QUITAR
                                impacto = true;
                                System.out.println("¡Muy bien! Eliminaste a un enemigo, continua así ");
                                break;
                            }
                        }

                        if (!impacto && nuevaFila >= 0)
                            nuevasBalas.add(new int[]{nuevaFila, columna});
                    }

                    balas = nuevasBalas;

                    //enemigos movimiento
                    for (int[] e : enemigos)
                        e[0]++;

                    //perder
                    for (int[] e : enemigos) {
                        if (e[0] >= posicionJugadorY) {
                            juegoTerminado = true;
                            System.out.println("Un enemigo llegó a tu orbita.");
                            System.out.println("Lo siento ╯︿╰ has perdido");
                            System.out.println("Vuelve a intentarlo pronto");
                            break;
                        }
                    }
                }

                //ganar
                if (ganar) {
                    System.out.println("\n¡Felicidades! Lo has logrado ");
                    System.out.println("¡¡¡MISION EXITOSA!!!");
                }
                System.out.println("Fin del juego...Regresando...");
                entrada.close();
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
                    //COLUMNAS IMPRESAS
                }
                System.out.println();
            }

        }
