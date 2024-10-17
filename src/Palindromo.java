import java.util.Scanner;
public class Palindromo {

    public static boolean esPalindormo(String frace) { //CHECK IF THE SENTENCE GIVEN IS PALINDROME
        frace = frace.toLowerCase().replaceAll("[\\s,]+", ""); //SET THE SETNECE OR WORD
        
        for (int i = 0; i<frace.length()/2;i++){ //FOR LOOP TO MOVE TRHU THE SENTENCE COMPARING INITAL LETTERS AND FINAL LETTERS TILL THEY MET
            if (frace.charAt(i)!=frace.charAt(frace.length()-i-1)){//IF CONTROL CODE, IF ANY OF THEM DOESN'T MATCH IT RETURNS FALSE.
                return false;
            }
        }
        return true;
    }

}
