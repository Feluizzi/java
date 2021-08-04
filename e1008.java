import java.util.Scanner;

public class e1008 {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    int num, qtd;
    double vlrhr, salario;
    
    num = teclado.nextInt();
    qtd = teclado.nextInt();
    vlrhr = teclado.nextDouble();


    System.out.println("NUMBER = " + num);
    salario = vlrhr * qtd;
    System.out.printf("SALARY = U$ %.2f", salario);

    }
}
