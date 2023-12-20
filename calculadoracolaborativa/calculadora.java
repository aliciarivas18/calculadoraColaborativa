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
             

                // CASO 1 suma será el código que desarrollará Alicia. Desde la rama parteSuma
                case 1:
                System.out.println("Introduce el primer numero");
                num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();
                suma = num1 + num2;
                System.out.println("Suma " + num1 + " - " + num2 + " es igual a : " + suma + "\n");
                break;

                // CASO 2 resta será el código que desarrollará Carlos.
                case 2:
                    System.out.println("Introduce el primer número.");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo número.");
                    num2 = sc.nextInt();
                    resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
                
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
