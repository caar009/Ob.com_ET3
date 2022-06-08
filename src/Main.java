import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primera parte del ejercicio");

        int variable_a;
        int variable_b;
        int variable_c;
        int resultado_suma;
        Scanner leer = new Scanner(System.in);

        System.out.print("Captura variable a: ");
        variable_a = leer.nextInt();
        System.out.print("Captura variable b: ");
        variable_b = leer.nextInt();
        System.out.print("Captura variable c: ");
        variable_c = leer.nextInt();

        resultado_suma = suma( variable_a, variable_b, variable_c);

        System.out.println("El resultado es " +resultado_suma);
        System.out.println();

        System.out.println("Segunda parte del ejercicio");

        Coche MiCoche = new Coche();

        System.out.print("Mi coche tine " +MiCoche.puertas);
        System.out.println(" puertas");

        System.out.println("Sumo una puerta mas...");
        MiCoche.AnadirPuerta();


        System.out.println("Ahora el numero de puertas de mi coche es: " +MiCoche.puertas);

    }

    public static int suma (int a, int b, int c){
        return a +b +c;
    }
}

class Coche {
    public int puertas = 4;
    public void AnadirPuerta() {
        this.puertas++;
    }

}