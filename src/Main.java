
public class Main {
// Fifth bit only differs in 8 bits of the binary numbers of ascii numbers...
// So we are checking
    public static String toggleResult(String word){
        char charArrayOfString[] = word.toCharArray();
        for (int iterator = 0 ; iterator < charArrayOfString.length ; iterator++){
            charArrayOfString[iterator] ^= 32 ;
        }
        return new String(charArrayOfString);
    }

    public static void main(String[] args) {
        System.out.println(toggleResult("tHiSiSaStRiNg"));
    }
}