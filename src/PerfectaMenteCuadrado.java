import java.util.Scanner;
import java.util.ArrayList;

public class PerfectaMenteCuadrado {

    public static int[] leerArreglo() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Ingresa un numero: ");
        String num;
        
        do {
            num = scan.nextLine();
            if (num.equals("FIN")){
                break;
            }
            try {
                int numero = Integer.parseInt(num);
                lista.add(numero);
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                System.out.println("ERROR. Ingresa una entrada valida: ");
            }            
        } while (true);

        int [] arreglo = new int[lista.size()];
        for (int i = 0; i<lista.size();i++){
            arreglo[i]=lista.get(i);
        }
        return arreglo; 
    }
    public static boolean varificar(int[] arr,int[] arr2) {
        if (arr.length!=arr2.length) return false;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]!=arr2[i]*arr2[i]){
                return false;
            }
        }
        return true;
    }

}
