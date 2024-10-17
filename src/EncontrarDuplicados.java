import java.util.Scanner;
import java.util.ArrayList;

public class EncontrarDuplicados {

    public static void hacerEncontrarDuplicados(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        for (int i = 0; i<arreglo1.size();i++){
            for (int j = 0; j<arreglo1.size();j++){
                if (arreglo1.get(i)==arreglo2.get(j)){
                    System.out.println("se elimina el numero: "+arreglo1.get(i)+" Porque esta duplicado");
                }
            }
        }
    }

    public static ArrayList<Integer> leerArreglo() {
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


        return lista; 
    }
    
    

}
