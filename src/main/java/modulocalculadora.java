import java.util.Scanner;

public class modulocalculadora {
    public static void main(String[] args) {
        gral();
    }
    public static void gral() {


        //Variables
        Scanner teclado = new Scanner(System.in);
        int eleccion;

        //Texto
        System.out.println("⋙⋙⋙⋙⋙¡¡Bienvenido a la seccion de calculadora!!⋘⋘⋘⋘⋘");
        do{
            System.out.println("Seleccione la operación que desea realizar");
            System.out.println("1. Aritmetica \n2. Calculo de areas \n3. Regla de tres \n4. Volver");

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
        } while (eleccion>4 || eleccion<=0);

    }

    private static void aritmetica()
    {
        Scanner teclado2 = new Scanner(System.in);
        int eleccionAri=0;
        do{
        System.out.println("Bienvenid@ a operaciones aritmeticas");
        System.out.println("1.Suma \n2.Resta \n3.Multiplicación \n4.División");
        eleccionAri= teclado2.nextInt();
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
    } while (eleccionAri>3 || eleccionAri<=0);

    }

    private static void division() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección división");
        System.out.println("=============================");
    }

    private static void multiplicacion() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección multiplicación");
        System.out.println("=============================");
    }

    private static void resta() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección resta");
        System.out.println("=============================");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a restar");
        int cantResta= teclado.nextInt();

        System.out.println("Ingrese los numeros a restar");
        Scanner teclado2=new Scanner(System.in);
        int n = teclado2.nextInt();


    }
    private static void suma() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección suma");
        System.out.println("=============================");


 }

   private static void calculoDeAreas() {

        Scanner teclado = new Scanner(System.in);
        int eleccioncalc=0;
        System.out.println("Bienvenid@ a calculo de áreas");
   do{
        System.out.println("Elija la operación que desea realizar");
        System.out.println("1.Triangulo \n2.Rectangulo \n3.Cuadrado \n4.Circulo \n5.Trapecio \n6.Rombo");
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
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección círculo");
        System.out.println("=============================");
    }

    private static void cuadrado() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección cuadrado");
        System.out.println("=============================");
    }

    private static void rombo() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección rombo");
        System.out.println("Hola mundo");
        System.out.println("=============================");
    }

    private static void trapecio() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección trapecio");
        System.out.println("=============================");
    }

    private static void rectangulo() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección rectángulo");
        System.out.println("=============================");
    }

    private static void triangulo() {
        System.out.println("=============================");
        System.out.println("Bienvenid@ a la sección triángulo");
        System.out.println("=============================");
    }

    private static void reglaDeTres() {
        System.out.println("Bienvenid@ a calculo de regla de tres");
    }
}
