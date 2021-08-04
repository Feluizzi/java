import java.util.Scanner;

public class Ex2 {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    float area, lado, base, altura, baseMa, baseMe;

    //a
    System.out.println("\n lado:");
    lado = teclado.nextFloat();

        area = lado * lado;

        System.out.printf("\n Area= %.2f", area);

    //b
    System.out.println("\n base:");
    base = teclado.nextFloat();
    System.out.println("\n altura:");
    altura = teclado.nextFloat();

    area = (base * altura)/2;
    System.out.printf("\n Area= %.2f", area);

    //e
    System.out.println("\n Base Maior:");
    baseMa = teclado.nextFloat();
    System.out.println("\n Base Menor:");
    baseMe = teclado.nextFloat();
    System.out.println("\n altura:");
    altura = teclado.nextFloat();

    area = (baseMa + baseMe) * altura / 2;

    System.out.printf("\n Area= %.2f", area);


    }
}