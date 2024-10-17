import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        menu(scan);//CALSS THE METHOD MENU
    }

    public static void menu(Scanner scan) { //MENU: SELECT THE EXCERCISE.
        System.out.println("\nQue deseas verificar?: ");
        System.out.println("1. Palindromos.");
        System.out.println("2. Perfectamente cuadrado.");
        System.out.println("3. Encontrar duplicados.");
        System.out.println("4. Salir.");
        int num = scan.nextInt();
        scan.nextLine(); //CLEAN BUFFER.
        pauseExecution(2);//TIMER.


        switch (num) { //SWITCH CASE FOR EXCERCISES
            case 1: //PALINDROME
                System.out.println("\nIngresa una frace palindroma para analizarla: ");
                String frace = scan.nextLine();
                if (Palindromo.esPalindormo(frace)) System.out.println("Es palindromo.");
                else System.out.println("No es palindromo.");
                menu(scan);
            case 2: //SQUARE PERFECT
                System.out.println("\nIngresa el primer arrelgo: ");
                int[] arreglo = PerfectaMenteCuadrado.leerArreglo();
                System.out.println("Ingresa el segundo arrelgo: ");
                int[] arreglo2 = PerfectaMenteCuadrado.leerArreglo();
                if (PerfectaMenteCuadrado.varificar(arreglo, arreglo2)) System.out.println("Es perfectamente cuadrado.");
                else System.out.println("No es perfectamente cuadrado");
                menu(scan);
            case 3: //FIND DUPLICATES
                System.out.println("\nIngresa el primer arreglo: ");
                ArrayList<Integer> arreglo3 = EncontrarDuplicados.leerArreglo();
                System.out.println("Ingresa el segundo arreglo: ");
                ArrayList<Integer> arreglo4 = EncontrarDuplicados.leerArreglo();
                EncontrarDuplicados.hacerEncontrarDuplicados(arreglo3,arreglo4);
                menu(scan);
            case 4: // END
                System.out.println("Terminando el programa.");
                break;
            default: // ERROR. ENTERED OTHER NUMBER
                System.out.println("No ingresaste el numero correcto, ingresa otro numero: ");
                pauseExecution(2);
                menu(scan);
        }
    }

    private static void pauseExecution(int segundos) { //TIMER, YOU CAN SET THE TIME AND IT SHOWS IN COMAND WINDOW.
        for (int i = segundos; i > 0; i--) {//FOR LOOP TO DECREACE INTIL TIMER IS LESS THAN 1
            System.out.println("Esperando " + i + " segundo(s)...");
            try {
                Thread.sleep(1000); // 1 SECOND PAUSE
            } catch (InterruptedException e) { // IF ERROR DURING PAUSE, STOP CODE IN TRY SCOPE
                Thread.currentThread().interrupt();
                System.out.println("Error en la pausa de ejecución.");
            }
        }
    }
}
