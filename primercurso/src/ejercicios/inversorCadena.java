package ejercicios;

import java.util.Scanner;

public class inversorCadena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un texto y yo lo invertire");
            String texto = sc.nextLine();

            String textoInvertido = new StringBuilder(texto).reverse().toString();

            // Mostramos la cadena invertida.
            System.out.println("texto invertido" + textoInvertido);
        }
    }


