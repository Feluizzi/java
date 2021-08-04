import java.util.Scanner;

public class Ex3 {
    public static void main (String args[]) {
    Scanner teclado;
    teclado = new Scanner(System.in);

    double salario, qtdkw, valorp, vlrkw, valor2;
    

    System.out.println("Digite o valor do salario minimo: ");
    salario = teclado.nextDouble();
    System.out.println("Digite quantidade de kw: ");
    qtdkw = teclado.nextDouble();
    
    //System.out.println("1 ");
    vlrkw = (salario / 7) / 100;
    //System.out.println("2 ");

    System.out.printf("\n valor de cada kw: %.2f", vlrkw);

    valorp = vlrkw * qtdkw;

    System.out.printf("\n valor a ser pago: %.2f", valorp);

    valor2 = valorp - (valorp / 10);

    System.out.printf("\n valor a ser pago com desconto: %.2f", valor2);



    }
}
