import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int opcio;
        do {
            System.out.println("1. Opció 1");
            System.out.println("2. Opció 2");
            System.out.println("3. Opció 3");
            System.out.println("4. Opció 4");
            System.out.println("5. Opció 5");
            System.out.println("0. Acabar");

            opcio = escaner.nextInt();
            escaner.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("Introdueix el primer número: ");
                    int num1 = escaner.nextInt();
                    System.out.println("Introdueix el segon número: ");
                    int num2 = escaner.nextInt();
                    if (Equacions.maxim(num1, num2)) {
                        System.out.println("El primer número és més gran.");
                    } else {
                        System.out.println("El segon número és més gran.");
                    }
                    break;
                case 2:
                    double a = 2;
                    double b = 3;
                    double c = 1;
                    Equacions.calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<LiniaComanda> liniesComanda = null;
                    Comanda comanda = new Comanda(liniesComanda, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
}
