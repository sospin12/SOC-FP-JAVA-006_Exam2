import java.util.Scanner;
import java.util.ArrayList;

public class EncontrarDuplicados {

    //FIND THE DUPLICATES IN FIRST ARRAY AND SECOND ARRAY, 
    public static void hacerEncontrarDuplicados(ArrayList<Integer> arreglo1, ArrayList<Integer> arreglo2) {
        for (int i = 0; i<arreglo1.size();i++){ // FOR LOOP TO MOVE THRU FIRST ARRAY
            for (int j = 0; j<arreglo2.size();j++){ // FOR LOOP TO MOVE THRU SECOND ARRAY
                if (arreglo1.get(i)==arreglo2.get(j)){// COMPARE ONE OBJECT OF FIST ARRAY THRU SECOND ARRAY
                    System.out.println("se elimina el numero: "+arreglo1.get(i)+" Porque esta duplicado");
                }
            }
        }
    }

    public static ArrayList<Integer> leerArreglo() { //READ NUMBERS, CHECK AND STORE THEM INF ARRAYLIST
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Ingresa un numero: ");
        String num;
        
        do {
            num = scan.nextLine();
            if (num.equals("FIN")){ //CHECK IF "FIN" IMPUT
                break;//THEN FINISH THE WHILE LOOP
            }
            try { // TRY TO CHAGE STRING TO INTEGER
                int numero = Integer.parseInt(num);
                lista.add(numero);
            } catch (Exception e) { //IF ERROR, CATCH WILL STOP CODE IN TRY SCOPE
                System.out.println(e.getLocalizedMessage());
                System.out.println("ERROR. Ingresa una entrada valida: ");
            }            
        } while (true); //WHILE LOOP STOP UNTIL "FIN".


        return lista; 
    }
    
    

}
