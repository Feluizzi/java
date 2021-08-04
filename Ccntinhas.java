public class Ccntinhas {
    public static void main (String args[]) {
        
        int a,b,c;
        a=23;
        b=4;

        c = a + b;

        System.out.println("Valor da sominha = " + c + " <<<");

        c = a - b;

        System.out.println("Valor da subtration = " + c + " <<<");
        
        c = a * b;

        System.out.println("Valor da multiplicacao = " + c + " <<<");

        c = a / b;

        System.out.println("Valor da divisao = " + c + " <<<");

        float x, y, z;
        x=a;
        y=b;

        z = x / y;

        System.out.println("Valor da divisao float = " + z + " <<<");
        
        System.out.printf("Valor da divisao float = %5.2f \n", z );
        System.out.printf("Valor da divisao float 5 casas= %.5f \n", z );

    }
}