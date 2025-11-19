import java.util.Scanner;

public class moduloejercicios
{
    static int puntos = 0;
    static int respuestas;
    public static void main(String[] args)
    {
        gral();
    }
    public static void gral()
    {
        Scanner sc = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("Bienvenido a la seccion de ejercicios!!");
            System.out.println("Seleccione la opcion");
            System.out.println("1. Aritmetica \n2. Calculo de areas \n3. Regla de tres \n4. Volver");
            opc = sc.nextInt();
            switch (opc)
            {
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
        }
        while (opc !=4);
    }

    private static void regladetres()
    {

    }

    private static void calculoareas()
    {

    }

    private static void aritmetica()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la seccion de ejercicios de aritmetica");
        System.out.println("Por cada respuesta correcta se añadiran 5 novashots con los cuales podras seguir jugando");
        System.out.println("Comenzemos con ejercicios basicos (La dificultad ira aunmentando)");
        System.out.println("Presiona ENTER cuando estes listo");
        sc.nextLine();
        System.out.println("Ejercicio 1:");
        System.out.println("Cuanto es 5 elevado a la 3");
        respuestas= sc.nextInt();
        if (respuestas == 25)
        {
            System.out.println("Correcto \n+5 Novashots");
            puntos = puntos + 5;
        }
        else
        {
            System.out.println("Respuesta incorrecta, la respuesta es: 15");
        }

        System.out.println("Presiona ENTER para ir al siguiente ejercicio");
        sc.nextLine();
        System.out.println("Ejercicio 2:");
        System.out.println("En un triángulo rectángulo, si un cateto mide 9 cm y el otro cateto mide 12 cm, ¿cuál es la hipotenusa?");
        respuestas = sc.nextInt();
        if (respuestas == 15)
        {
            System.out.println("Correcto \n+5 Novashots");
            puntos = puntos + 5;
        }
        else
        {
            System.out.println("Respuesta incorrecta, la respuesta es: 15");
        }

    }
}
