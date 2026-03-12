package ejercicios;

import java.util.Scanner;

public class muestraNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota y te digo a que corresponde ");
        int nota = sc.nextInt();

        switch (nota){
            case 10,9:
                System.out.println("Sobresaliente");
                break;
            case 8,7:
                System.out.println("notable");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 4,3,2,1:
                System.out.println("insuficiente");
        }

}
}
