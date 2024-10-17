import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        menu(scan);
    }

    public static void menu(Scanner scan) { //menu to select the excersice
        System.out.println("\nQue deseas verificar?: ");
        System.out.println("1. Palindromos.");
        System.out.println("2. Perfectamente cuadrado.");
        System.out.println("3. Encontrar duplicados.");
        System.out.println("4. Salir.");
        int num = scan.nextInt();
        scan.nextLine(); //Clean the buffer.
        pauseExecution(2);//timer.


        switch (num) {
            case 1:
                System.out.println("\nIngresa una frace palindroma para analizarla: ");
                String frace = scan.nextLine();
                if (Palindromo.esPalindormo(frace)) System.out.println("Es palindromo.");
                else System.out.println("No es palindromo.");
                menu(scan);
            case 2:
                System.out.println("\nIngresa el primer arrelgo: ");
                int[] arreglo = PerfectaMenteCuadrado.leerArreglo();
                System.out.println("Ingresa el segundo arrelgo: ");
                int[] arreglo2 = PerfectaMenteCuadrado.leerArreglo();
                if (PerfectaMenteCuadrado.varificar(arreglo, arreglo2)) System.out.println("Es perfectamente cuadrado.");
                else System.out.println("No es perfectamente cuadrado");
                menu(scan);
            case 3:
                System.out.println("\nIngresa el primer arreglo: ");
                ArrayList<Integer> arreglo3 = EncontrarDuplicados.leerArreglo();
                System.out.println("Ingresa el segundo arreglo: ");
                ArrayList<Integer> arreglo4 = EncontrarDuplicados.leerArreglo();
                EncontrarDuplicados.hacerEncontrarDuplicados(arreglo3,arreglo4);
                menu(scan);
            case 4:
                System.out.println("Terminando el programa.");
                break;
            default:
                System.out.println("No ingresaste el numero correcto, ingresa otro numero: ");
                pauseExecution(2);
                menu(scan);
        }
    }

    private static void pauseExecution(int segundos) {
        for (int i = segundos; i > 0; i--) {
            System.out.println("Esperando " + i + " segundo(s)...");
            try {
                Thread.sleep(1000); // 1 second pause.
            } catch (InterruptedException e) { // 
                Thread.currentThread().interrupt();
                System.out.println("Error en la pausa de ejecución.");
            }
        }
    }
}
