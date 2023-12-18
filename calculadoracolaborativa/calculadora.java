package calculadoracolaborativa;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int opcion = 0, suma, resta, num1, num2;
        do {
            System.out.println("Bienvenido a la calculadora de Suma y Resta\n");

            System.out.println("1:Sumar\n" );
            System.out.println("2:Resta\n" );
            System.out.println("3:Salir\n" );

            opcion = sc.nextInt();

            switch (opcion) {
             

                // CASO 1 suma será el código que desarrollará Alicia.
                case 1:

              

                
                // CASO 2 resta será el código que desarrollará Carlos.
                case 2:

                
                    break;

                  case 3:
                    System.out.println("Has salido");
                   break;

                default:
                    System.out.println("No es una opción válida.");
                    break;
            }

        } while (opcion != 3);
    }
}
