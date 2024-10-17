import java.util.Scanner;
import java.util.ArrayList;

public class PerfectaMenteCuadrado {

    public static int[] leerArreglo() {//READ AN ARRAY UNTIL "FIN" IS WRITTEN
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Ingresa un numero: ");
        String num;
        
        do {
            num = scan.nextLine();
            if (num.equals("FIN")){ //CHEK IF "FIN" THEN END THE EHILE LOOP IF CASE.
                break;
            }
            try { // TRIES (STRING TO INT) AND IF ERROR CHATCHES. 
                int numero = Integer.parseInt(num);
                lista.add(numero);
            } catch (Exception e) { //CATCH THE ERROR AND DO NOT STORE THE STRING IN THE ARRAY;
                System.out.println(e.getLocalizedMessage());
                System.out.println("ERROR. Ingresa una entrada valida: ");
            }            
        } while (true);

        int [] arreglo = new int[lista.size()];
        for (int i = 0; i<lista.size();i++){ //CONVERTS FROM ARRAYLIST<INTEGER> TO INT[0]
            arreglo[i]=lista.get(i);
        }
        return arreglo; 
    }
    public static boolean varificar(int[] arr,int[] arr2) { //CHECK IF FIRST ARRAY IS PERFECT SQUARE THE SECOND ARRAY
        if (arr.length!=arr2.length) return false;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]!=arr2[i]*arr2[i]){ //THIS IS THE MAIN FORMULA
                return false;
            }
        }
        return true;
    }

}
