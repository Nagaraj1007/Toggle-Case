
public class Main {

    public static String toggleResult(String word){
        char charArrayOfString[] = word.toCharArray();
        for (int iterator = 0 ; iterator < charArrayOfString.length ; iterator++){
            charArrayOfString[iterator] = (charArrayOfString[iterator] >= 65 && charArrayOfString[iterator] <= 90) ? (char)( charArrayOfString[iterator] + 32 ) : (char) ( charArrayOfString[iterator] - 32 );
        }
        return new String(charArrayOfString);
    }

    public static void main(String[] args) {
        System.out.println(toggleResult("tHiSiSaStRiNg"));
    }
}