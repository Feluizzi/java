import java.util.Scanner;

public class e1018 {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    int valor, q100, q50, q20, q10, q5, q2, q1;
    
    valor = teclado.nextInt();

    System.out.println(valor);

    q100 = valor / 100;
    valor = valor % 100;
    
    q50 = valor / 50;
    valor = valor % 50;

    q20 = valor / 20;
    valor = valor % 20;

    q10 = valor / 10;
    valor = valor % 10;

    q5 = valor / 5;
    valor = valor % 5;

    q2 = valor / 2;
    valor = valor % 2;

    q1 = valor;

    System.out.println(q100 + " nota(s) de R$ 100,00");
    System.out.println(q50 + " nota(s) de R$ 50,00");
    System.out.println(q20 + " nota(s) de R$ 20,00");
    System.out.println(q10 + " nota(s) de R$ 10,00");
    System.out.println(q5 + " nota(s) de R$ 5,00");
    System.out.println(q2 + " nota(s) de R$ 2,00");
    System.out.println(q1 + " nota(s) de R$ 1,00");



    

    }
}
