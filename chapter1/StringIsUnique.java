
import java.util.*;

public class StringIsUnique {

    private static boolean isUnique(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("is the given string unique " + isUnique(input));
    }

}
