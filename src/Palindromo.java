import java.util.Scanner;
public class Palindromo {

    public static boolean esPalindormo(String frace) {
        frace = frace.toLowerCase().replaceAll("[\\s,]+", "");
        System.out.println(frace);
        for (int i = 0; i<frace.length()/2;i++){
            System.out.println(frace);
            if (frace.charAt(i)!=frace.charAt(frace.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
