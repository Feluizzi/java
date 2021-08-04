import java.util.Scanner;

public class e1014 {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    int x;
    double y, resul;
    
    x = teclado.nextInt();
    y = teclado.nextDouble();
    resul = x / y;


    System.out.printf("%.3f km/l\n", resul);

    }
}
