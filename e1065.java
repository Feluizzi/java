import java.util.Scanner;

public class e1065{
    public static void main (String args []) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero, qtdpar=0;

        for(int i=0; i < 5 ; i++){
            numero = teclado.nextInt();
            if (numero%2 == 0)
            qtdpar++;
        }

        System.out.println(qtdpar + " valores pares");

    }
}