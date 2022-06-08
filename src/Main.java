import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int variable_a;
        int variable_b;
        int variable_c;
        int resultado_suma;
        Scanner leer = new Scanner(System.in);

        System.out.println("Primera parte del ejercicio");

        System.out.println("Captura variable a:");
        variable_a = leer.nextInt();
        System.out.println("Captura variable b:");
        variable_b = leer.nextInt();
        System.out.println("Captura variable c:");
        variable_c = leer.nextInt();

        resultado_suma = suma( variable_a, variable_b, variable_c);

        System.out.println("El resultado es " +resultado_suma);

        System.out.println("Segunda parte del ejercicio");

    }

    public static int suma (int a, int b, int c){
        return a +b +c;
    }
}