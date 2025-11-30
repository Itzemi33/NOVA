import java.util.Scanner;
public class
nova {
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
        System.out.println("Bienvenido (a) a NOVA (Numeros, Operaciones, Velocidad y Aventura");
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();

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
        System.out.println("Crea un usuario:");
        usuario = sc.nextLine();
        System.out.println("Crea una contraseña:");
        password= sc.nextLine();
        System.out.println("Registro exitoso, presiona ENTER para continuar");
        sc.nextLine();


    }

    public static void general() {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

            System.out.println("==================================");
            System.out.println("     Bienvenido a tu aventura");
            System.out.println("==================================");
            System.out.println("NOVA te ayudara a estudiar y repasar de una manera divertida y sencilla");

            System.out.println("Selecciona la opcion que desees");
        do {
            System.out.println("1. Ejercicios \n2. Calculadora \n3. Juego \n4. Salir \nPara una mejor experiencia te recomendas la opcion Ejercicios para comenzar con el repaso");
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
        } while (opc != 4);

    }

}
