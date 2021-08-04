import java.util.Scanner;

public class exswitch {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    int numero;
    
    numero = teclado.nextInt();

    switch (numero){

    case 1:
    System.out.println("Vc digitou 1");
    break;
    case 2:
    System.out.println("Vc digitou 2");
    break;
    case default:
    System.out.println("Vc digitou outra coisa");

    }
    }
}
