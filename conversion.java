package ejercicios;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dol = 1.09;
        System.out.println("introduce la cantidad de euros");
        double eu = sc.nextDouble();
        double cambio = eu * dol;
        System.out.println("El cambio de" +eu+ " euros a dolares es de:" +cambio);

    }

}
